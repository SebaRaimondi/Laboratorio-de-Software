package d;

import a.Notas;
import b.FrecuenciasDeLA;
import c.InstrumentoMusical;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void hacerSonar() {
        System.out.println("Suena");
    }

    @Override
    public String queEs() {
        return "Guitarra";
    }

    @Override
    public void afinar() {
        System.out.println("Afinando a " + FrecuenciasDeLA.ISO.getFrecuencia() + "Hz por defecto");
    }

    @Override
    public void afinar(FrecuenciasDeLA f) {
        System.out.println("Afinando a " + f.getFrecuencia() + "Hz");
    }

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Suena la nota " + n.getAmericano() + " durante " + duracion + " segundo(s)");
    }
}
