package geometria;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        for (FiguraGeometrica figura : paint.getPaleta()) {
            System.out.println("Area: " + figura.area());
            if (figura.getClass() == Circulo.class) {
                System.out.println("Radio: " + ((Circulo) figura).getRadio());
            }
        }
    }
}
