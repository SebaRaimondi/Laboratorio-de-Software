package practica7.ej4;

 /*
    Los metodos que sobreescriben deben tirar las mismas excepciones o menos que los sobreescriptos.
        Encuentro.penal throws Mano no deberia tirar Mano.
        Encuentro.evento throws lluvia no deberia tirar Lluvia
    Encuentro.evento esta definido dos veces
    En los catch de Encuentro.main se define e multiples veces dentro de un try que ya definio e
 */

class FutbolException extends Exception { }

class Falta extends FutbolException { }

class EquipoIncompleto extends FutbolException { }

class ClimaException extends Exception { }

class Lluvia extends ClimaException { }

class Mano extends Falta { }

class Partido {
    Partido() throws FutbolException{}
    void evento() throws FutbolException{}
    void jugada() throws EquipoIncompleto, Falta{}
    void penal(){}
}

interface Tormenta {
    void evento() throws Lluvia;

    void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
    Encuentro() throws Lluvia, FutbolException { }

    Encuentro(String fecha) throws Falta, FutbolException { }

//    void penal() throws Mano { }

//    public void evento() throws Lluvia { }

    public void diluvio() throws Lluvia { }

    public void evento() { }

    void jugada() throws Mano { }

    public static void main(String[] args) {
        try {
            Encuentro enc = new Encuentro();
            enc.jugada();
        } catch (Mano e) {
        } catch (Lluvia e) {
        } catch (FutbolException e2) {
            // Cambie el e de arriba por e2 para que no tenga conflicto con las e de abajo.
            try {
                Partido par = new Encuentro();
                par.jugada();
            } catch (EquipoIncompleto e) {
            } catch (Falta e) {
            } catch (Lluvia e) {
            } catch (FutbolException e) { }
        }
    }
}