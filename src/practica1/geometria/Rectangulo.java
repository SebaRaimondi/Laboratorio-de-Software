package practica1.geometria;

public class Rectangulo extends FiguraGeometrica{
    private int alto;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(String color, int alto, int ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo de alto " + alto + ", ancho " + ancho + " y color " + getColor());
    }

    @Override
    public int area() {
        return alto*ancho;
    }
}
