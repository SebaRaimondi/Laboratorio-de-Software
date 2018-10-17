package practica8;

 /*
    Dejando el nombre en minuscula no compila porque tiene una anotacion @Override pero no sobreescribe ningun metodo.
    Falta terminar
 */

public class TestSobreescritura {

    // @Override
    public String tostring() {
        return super.toString() + " Testeando: 'Override'";
    }

    public static void main(String[] args) {
        TestSobreescritura test = new TestSobreescritura();
        System.out.println(test.tostring());
    }
}
