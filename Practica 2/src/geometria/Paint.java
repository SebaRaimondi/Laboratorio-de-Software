package geometria;

public class Paint {
    private FiguraGeometrica[] paleta = new FiguraGeometrica[5];

    public Paint() {
    }

    public FiguraGeometrica[] getPaleta() {
        return paleta;
    }

    public void setPaleta(FiguraGeometrica[] paleta) {
        this.paleta = paleta;
    }

    public void init(){
        paleta[0] = new Circulo("azul", 2);
        paleta[1] = new Circulo("amarillo", 3);
        paleta[2] = new Rectangulo("verde", 2, 3);
        paleta[3] = new Rectangulo("rojo", 4, 10);
        paleta[4] = new Rectangulo("rojo", 4, 10);
    }
}
