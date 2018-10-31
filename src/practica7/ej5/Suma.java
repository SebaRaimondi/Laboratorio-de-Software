package practica7.ej5;

 /*
    No se tuvo que tener en cuenta la excepcion porque es una Runtime Exception.
 */

public class Suma {
    public static void main(String[] args){
        int suma=0;
        for (int i = 0; i < args.length; i++) {
            try {
                suma+= Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Argumento invalido: " + args[i]);
            }
        }
        System.out.print("La suma es:"+suma);
    }
}