package practica8.ej3;

import practica8.ej3.annotation.Invocar;
import practica8.ej3.annotation.Servidor;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Contenedor {
    public static void main(String[] args) throws IOException {
        Servidor servidor = Server.class.getAnnotation(Servidor.class);

        int port = servidor.puerto();
        int backlog = 5;
        InetAddress address = InetAddress.getByName(servidor.direccion());

        ServerSocket listener = new ServerSocket(port, backlog, address);

        int clientNumber = 0;
        try {
            while (true) {
                new Logger(listener.accept(), clientNumber++, servidor.archivo()).start();
            }
        } finally {
            listener.close();
        }
    }

    private static class Logger extends Thread {
        private Socket socket;
        private int clientNumber;
        private String file;
        private String eol = System.lineSeparator();

        public Logger(Socket socket, int clientNumber, String file) {
            this.socket = socket;
            this.clientNumber = clientNumber;
            this.file = file;
            System.out.println("New connection with client# " + clientNumber + " at " + socket);
        }

        public void run() {
            try {
                // Log clientNumber, date, time and ip
                logClient();

                // Call methods with Invocar annotation
                callMethods();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("Couldn't close a socket, what's going on?");
                }
                System.out.println("Connection with client# " + clientNumber + " closed");
            }
        }

        private void log(String message) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
                out.write(message + eol);
                out.close();
            }
            catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }

        private void logClient() {
            String dateTime = new Date().toString();
            String ip = socket.getRemoteSocketAddress().toString();

            String out = "DateTime: " + dateTime + eol;
            out += "IP: " + ip + eol;

            log(out);
        }

        private void callMethods() {
            try {
                BufferedReader entrada = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                Arrays.stream(Server.class.getMethods())
                        .filter(method -> method.isAnnotationPresent(Invocar.class))
                        .forEach(method -> {
                            try {
                                method.invoke(new Server(), entrada);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        });
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}
