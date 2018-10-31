package practica8.ej3;

import practica8.ej3.annotation.Invocar;
import practica8.ej3.annotation.Servidor;

import java.io.BufferedReader;
import java.io.IOException;

@Servidor(direccion = "127.0.0.1", puerto = 8000, archivo = "ServerLog.txt")
public class Server {
    @Invocar
    public void printEntry(BufferedReader entrada) {
        try {
            System.out.println("Desde Server: " + entrada.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
