package practica8.ej1;

// Dejando el nombre en minuscula no compila porque tiene una anotacion
// @Override pero no sobreescribe ningun metodo. Comento la anotacion.

// a) Cuando se ejecuta TestAnotaciones se ejecuta correctamente porque tiene la
// la anotacion @SuppressWarnings deprecated.

// b) Sin la anotacion SuppressWarning tira un warning de metodo deprecado.

// c) En este caso ninguna pero si se usara un metodo deprecado en otro metodo
// y se anotara la clase, tampoco tiraria warning. En cambio si se anota el metodo
// solo ese metodo no tirara warning pero el resto si.


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

class TestDeprecated {
    @Deprecated
    public void hacer() {
        System.out.println("Testeando: 'Deprecatade'");
    }
}

class TestAnotaciones {
    public static void main(String[] args) throws Exception {
        new TestAnotaciones().testearYa();
    }

    @SuppressWarnings({"deprecation"})
    public void testearYa() {
        TestDeprecated t2 = new TestDeprecated();
        t2.hacer();
    }
}