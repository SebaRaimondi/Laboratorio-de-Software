package practica6.uno;

import java.util.*;

public class Materia {
    String nombre;
    SortedSet<? super Alumno> alumnos = new TreeSet<>(Alumno.Comparators.NOMBREYAPELLIDO);

    public void agregaAlumno(Alumno a) {
        alumnos.add(a);
    }

    public SortedSet<? super Alumno> getAlumnos() {
        return alumnos;
    }

    public static void main(String[] args) {
        // Aca va la prueba que no quiero hacer.
    }
}
