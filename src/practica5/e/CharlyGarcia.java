package practica5.e;


import practica5.a.Notas;
import practica5.c.InstrumentoMusical;

import java.util.ArrayList;

public enum CharlyGarcia {
    INSTANCE;

    private InstrumentoMusical instrumento;

    CharlyGarcia() {
        instrumento = new Piano();
    }

    public void tocarCancion(ArrayList<Notas> notas, int[] duraciones) {
        if (notas.size() != duraciones.length) {
            System.out.println("La cantidad de notas no es igual a la cantidad de duraciones");
            return;
        }

        for (int i = 0; i < notas.size(); i++) {
            instrumento.hacerSonar(notas.get(i), duraciones[i]);
        }
    }
}
