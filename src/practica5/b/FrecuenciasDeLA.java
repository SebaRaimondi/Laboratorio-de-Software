package practica5.b;

public enum FrecuenciasDeLA {
    AFINACION(444), BACH(480), ISO(440), RENACIMIENTO(446);

    private int frecuencia;

    FrecuenciasDeLA(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
}
