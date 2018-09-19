package d;

import a.Notas;
import b.FrecuenciasDeLA;

public class TestGuitarra {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();

        System.out.println("Que es: " + guitarra.queEs());
        guitarra.afinar();
        guitarra.afinar(FrecuenciasDeLA.BACH);
        guitarra.hacerSonar();
        guitarra.hacerSonar(Notas.DO, 2);
    }
}
