package practica2.geometria;

public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println("Se dibuja un circulo de radio " + getRadio() + " y color " + getColor());
    }

    @Override
    public int area() {
        return radio * (int) Math.pow(Math.PI, 2);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
