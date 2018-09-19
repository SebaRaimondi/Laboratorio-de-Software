package b;

public enum FrecuenciasDeLA {
    ISO(440), AFINACION(444), RENACIMIENTO(446), BACH(480);

    private int frecuencia;

    private FrecuenciasDeLA(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
}
