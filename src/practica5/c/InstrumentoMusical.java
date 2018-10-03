package practica5.c;


import practica5.a.Notas;
import practica5.b.FrecuenciasDeLA;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();
    void afinar();
    void afinar(FrecuenciasDeLA f);
    void hacerSonar(Notas n, int duracion);
}

