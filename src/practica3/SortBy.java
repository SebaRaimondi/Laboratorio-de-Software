package practica3;

import java.util.Comparator;

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
