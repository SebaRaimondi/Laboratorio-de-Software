import static java.lang.Math.pow;

public class InnerStatic {
    static double PI = 3.1416;
    static class Circulo {
        public static double radio;
        static double getArea() {
            double a = PI * pow(radio, 2);
            System.out.println("El area es: " + a);
            return a;
        }
        static double getLongitudCircunferencia() {
            double l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
    }
}
