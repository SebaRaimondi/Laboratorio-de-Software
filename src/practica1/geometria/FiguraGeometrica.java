package practica1.geometria;

public abstract class FiguraGeometrica {
    private String color;


    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract void dibujar();
    public abstract int area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
