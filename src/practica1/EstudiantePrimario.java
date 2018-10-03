public class EstudiantePrimario extends Estudiante {
    private int ausencias;
    private boolean repitio;

    public int getAusencias() {
        return ausencias;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }

    public boolean isRepitio() {
        return repitio;
    }

    public void setRepitio(boolean repitio) {
        this.repitio = repitio;
    }

    public EstudiantePrimario(String apellido, String nombre, String legajo, int ausencias, boolean repitio) {
        super(apellido, nombre, legajo);
        this.ausencias = ausencias;
        this.repitio = repitio;
    }
}
