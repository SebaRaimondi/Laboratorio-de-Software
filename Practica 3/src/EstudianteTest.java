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

class Estudiante {
    String nombre, apellido, legajo;
    int edad, materiasAprobadas;

    public Estudiante(String nombre, String apellido, String legajo, int edad, int materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getEdad() {
        return edad;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public String apellidoNombre() {
        return this.getApellido() + ", " + this.getNombre();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", edad=" + edad +
                ", materiasAprobadas=" + materiasAprobadas +
                '}';
    }
}

enum SortBy implements Comparator<Estudiante> {
    MATERIASAPROBADAS {
        public final int compare(final Estudiante o1, final Estudiante o2) {
            return o1.getMateriasAprobadas() - o2.getMateriasAprobadas();
        }
    },

    EDAD {
        public final int compare(final Estudiante o1, final Estudiante o2) {
            return o1.getEdad() - o2.getEdad();
        }
    },

    LEGAJO {
        public final int compare(final Estudiante o1, final Estudiante o2) {
            return o1.getLegajo().compareTo(o2.getLegajo()) ;
        }
    },

    NOMBREYAPELLIDO {
        public final int compare(final Estudiante o1, final Estudiante o2) {
            return o1.apellidoNombre().compareTo(o2.apellidoNombre());
        }
    }

}
