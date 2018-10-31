package practica6.ej1;

import java.util.Comparator;

public class Alumno extends Persona{
    String apellido, nombre, legajo, dni;

    private String getFullName() {
        return apellido + ", " + nombre;
    }

    public Alumno(String apellido, String nombre, String legajo, String dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
        this.dni = dni;
    }

    public enum Comparators implements Comparator<Alumno> {
        NOMBREYAPELLIDO {
            @Override
            public int compare(Alumno a, Alumno b) {
                return (a.getFullName()).compareTo(b.getFullName());
            }
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", legajo='" + legajo + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
