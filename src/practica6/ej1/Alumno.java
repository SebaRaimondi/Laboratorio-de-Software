package practica6.ej1;

import java.util.Comparator;

public class Alumno extends Persona{
    String apellido, nombre, legajo, dni;

    private String getFullName() {
        return apellido + ", " + nombre;
    }

    public enum Comparators implements Comparator<Alumno> {
        NOMBREYAPELLIDO {
            @Override
            public int compare(Alumno a, Alumno b) {
                return (a.getFullName()).compareTo(b.getFullName());
            }
        }
    }

}
