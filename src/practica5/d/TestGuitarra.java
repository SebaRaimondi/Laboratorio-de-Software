package practica5.d;

import practica5.a.Notas;
import practica5.b.FrecuenciasDeLA;

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
