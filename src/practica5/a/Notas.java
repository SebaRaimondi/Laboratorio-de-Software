package practica5.a;

public enum Notas {
    DO("C"), FA("F"), LA("A"), MI("E"), RE("D"), SI("B"), SOL("G");

    private String americano;

    Notas(String americano) {
        this.americano = americano;
    }

    public String getAmericano() {
        return americano;
    }
}
