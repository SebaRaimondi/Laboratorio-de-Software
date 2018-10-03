package practica2.geometria;

import java.util.Arrays;
import java.util.Comparator;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        Arrays.sort(paint.getPaleta(), new SortByArea());
        for (FiguraGeometrica figura : paint.getPaleta()) {
            StringBuffer sb = new StringBuffer("Area: " + figura.area());
            if (figura.getClass() == Circulo.class) sb.append(", Radio: " + ((Circulo) figura).getRadio());
            System.out.println(sb.toString());
        }
    }
}

class SortByArea implements Comparator<FiguraGeometrica> {
    public int compare(FiguraGeometrica a, FiguraGeometrica b) {
        return a.area() - b.area();
    }
}