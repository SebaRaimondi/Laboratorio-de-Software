package c;

import a.Notas;
import b.FrecuenciasDeLA;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();
    void afinar();
    void afinar(FrecuenciasDeLA f);
    void hacerSonar(Notas n, int duracion);
}

