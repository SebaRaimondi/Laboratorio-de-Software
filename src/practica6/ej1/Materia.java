package practica6.ej1;

import java.util.*;

public class Materia {
    String nombre;
    Set<? super Alumno> alumnos =
            new TreeSet<>(Alumno.Comparators.NOMBREYAPELLIDO);

    public void agregaAlumno(Alumno a) {
        alumnos.add(a);
    }

    public Set<? super Alumno> getAlumnos() {
        return alumnos;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }

    public static void main(String[] args) {
        Alumno alumno0 = new Alumno("Raimondi",
                "Sebastian", "12345/6", "12345678");
        Alumno alumno1 = new Alumno("Rios",
                "Gaston", "12345/6", "12345678");
        Alumno alumno2 = new Alumno("Liptak",
                "Franco", "12345/6", "12345678");
        Alumno alumno3 = new Alumno("Onofri",
                "Camila", "12345/6", "12345678");

        Materia materia = new Materia("Laboratorio de Software");
        materia.agregaAlumno(alumno0);
        materia.agregaAlumno(alumno1);
        System.out.println(materia);

        materia.agregaAlumno(alumno2);
        System.out.println(materia);

        materia.agregaAlumno(alumno3);
        System.out.println(materia);
    }
}
