package practica9.ej3;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Corredor implements Runnable {
    private String recorrido;
    private int numero;

    public Corredor(int numero) {
        this.numero = numero;
        recorrido = String.valueOf(numero + 1) + ".";
    }

    @Override
    public void run() {
        Monitor monitor = Monitor.getInstance();
        while(true) {
            recorrido += "_";
            monitor.run(recorrido, numero);
        }

    }
}
