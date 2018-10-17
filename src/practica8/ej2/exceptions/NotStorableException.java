package practica8.ej2.exceptions;

public class NotStorableException extends Exception {
    @Override
    public String getMessage() {
        return "La clase no es almacenable (No tiene @Archivo)";
    }
}
