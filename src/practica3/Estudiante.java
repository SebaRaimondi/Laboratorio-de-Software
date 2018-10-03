package practica3;

public class Estudiante {
    String nombre, apellido, legajo;
    int edad, materiasAprobadas;

    public Estudiante(String nombre, String apellido, String legajo, int edad, int materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getEdad() {
        return edad;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public String apellidoNombre() {
        return this.getApellido() + ", " + this.getNombre();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", edad=" + edad +
                ", materiasAprobadas=" + materiasAprobadas +
                '}';
    }
}
