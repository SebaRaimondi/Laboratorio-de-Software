import java.util.Date;

public class EstudianteUniversitario extends Estudiante {
    private Date ingreso;

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public EstudianteUniversitario(String apellido, String nombre, String legajo, Date ingreso) {
        super(apellido, nombre, legajo);
        this.ingreso = ingreso;
    }
}
