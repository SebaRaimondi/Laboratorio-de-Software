package a;

public enum Notas {
    DO("C"), RE("D"), MI("E"), FA("F"), SOL("G"), LA("A"), SI("B");
    private String americano;

    private Notas(String americano) {
        this.americano = americano;
    }

    public String getAmericano() {
        return americano;
    }
}
