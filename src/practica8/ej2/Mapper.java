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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapper {
    final static String eol = System.lineSeparator();

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
        /*
        List<Field> fields = getAlmacenables(o);
        String str = "<nombreClase>" + o.getClass().toString() + "</nombreClase>" + eol;
        for (Field field : fields) str += fieldXML(field, o);
        return str;
        */

        // Pinto SmallTalk
        String xml = "<nombreClase>" + o.getClass().toString() + "</nombreClase>" + eol;
        return xml.concat(getAlmacenables(o).stream()
                .map(f -> fieldXML(f, o))
                .reduce(eol, String::concat));
    }

    private static String fieldXML(Field f, Object o) {
        f.setAccessible(true);
        String fieldXML = "<nombreAtributo>" + f.getName() + "</nombreAtributo>" + eol;

        try { fieldXML += "<nombreValor>" + f.get(o) + "</nombrenombreValor>"; }
        catch (IllegalAccessException e) { e.printStackTrace(); }

        return fieldXML;
    }

    private static List<Field> getAlmacenables(Object o) {
        /*
        List<Field> almacenables = new ArrayList<>();
        Field[] fields  = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(AlmacenarAtributo.class))
                almacenables.add(field);
        }
        return almacenables;
        */

        // Pinto SmallTalk
        return Arrays.stream(o.getClass().getDeclaredFields())
                .filter(x -> x.isAnnotationPresent(AlmacenarAtributo.class))
                .collect(Collectors.toList());
    }
}
