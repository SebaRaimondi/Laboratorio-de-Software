public class EstudiantSecundario extends Estudiante {
    private int previas;
    private double promedio;

    public int getPrevias() {
        return previas;
    }

    public void setPrevias(int previas) {
        this.previas = previas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public EstudiantSecundario(String apellido, String nombre, String legajo, int previas, double promedio) {
        super(apellido, nombre, legajo);
        this.previas = previas;
        this.promedio = promedio;
    }
}
