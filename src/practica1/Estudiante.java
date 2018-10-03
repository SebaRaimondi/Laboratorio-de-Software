public class Estudiante {
    private String apellido;
    private String nombre;
    private String legajo;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Estudiante {");
        sb.append("Apellido: '" + apellido + '\'');
        sb.append(", Nombre: '" + nombre + '\'');
        sb.append(", Legajo: '" + legajo + '\'');
        sb.append('}');
        return sb.toString();
    }

    public Estudiante(String apellido, String nombre, String legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

}
