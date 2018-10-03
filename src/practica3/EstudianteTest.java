package practica3;

import practica3.Estudiante;

import java.lang.reflect.Array;
import java.util.*;

public class EstudianteTest {
    public static void main(String[] args) {
        ArrayList<Estudiante> array = new ArrayList<Estudiante>();
        array.add(new Estudiante("zSeba", "Raimondi", "512345/6", 22, 23));
        array.add(new Estudiante("tSeba", "Raimondi", "312345/6", 21, 22));
        array.add(new Estudiante("eSeba", "Raimondi", "712345/6", 24, 25));
        array.add(new Estudiante("ySeba", "Raimondi", "112345/6", 23, 21));
        array.add(new Estudiante("uSeba", "Raimondi", "212345/6", 27, 24));

        Collections.sort(array, SortBy.MATERIASAPROBADAS);
        System.out.println(array);

        Collections.sort(array, SortBy.EDAD);
        System.out.println(array);

        Collections.sort(array, SortBy.LEGAJO);
        System.out.println(array);

        Collections.sort(array, SortBy.NOMBREYAPELLIDO);
        System.out.println(array);
    }
}

