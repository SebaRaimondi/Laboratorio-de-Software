package practica8.ej2;

import practica8.ej2.annotations.AlmacenarAtributo;
import practica8.ej2.annotations.Archivo;
import practica8.ej2.exceptions.NotStorableException;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    final static String eof = System.lineSeparator();

    public static void map(Object o) throws NotStorableException {
        Archivo archivo = o.getClass().getAnnotation(Archivo.class);
        if (archivo == null) throw new NotStorableException();

        String xml = buildXML(o);

        writeFile(archivo.nombre(), xml);
    }

    private static void writeFile(String path, String xml) {
        try {
            Files.write(Paths.get(path), xml.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String buildXML(Object o) {
        List<Field> fields = getAlmacenables(o);

        String str = "<nombreClase>" + o.getClass().toString() + "</nombreClase>" + eof;
        for (Field field : fields) {
            str += "<nombreAtributo>" + field.getName() + "</nombreAtributo>" + eof;
            field.setAccessible(true);
            try {
                str += "<nombreValor>" + field.get(o) + "</nombrenombreValor>" + eof;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return str;
    }

    private static List<Field> getAlmacenables(Object o) {
        List<Field> almacenables = new ArrayList<>();

        Field[] fields  = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(AlmacenarAtributo.class)) almacenables.add(field);
        }

        return almacenables;
    }
}
