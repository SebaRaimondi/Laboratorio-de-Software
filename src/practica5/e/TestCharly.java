package practica5.e;

import practica5.a.Notas;

import java.util.ArrayList;

public class TestCharly {

    public static void main(String[] args) {
        CharlyGarcia charly = CharlyGarcia.INSTANCE;
        ArrayList<Notas> notas = new ArrayList();
        notas.add(Notas.LA);
        notas.add(Notas.FA);
        notas.add(Notas.RE);
        notas.add(Notas.LA);
        notas.add(Notas.SOL);
        notas.add(Notas.FA);
        notas.add(Notas.RE);
        notas.add(Notas.LA);
        notas.add(Notas.DO);
        notas.add(Notas.RE);
        notas.add(Notas.LA);
        notas.add(Notas.DO);
        notas.add(Notas.RE);
        notas.add(Notas.RE);
        int[] duraciones = new int[notas.size()];
        for (int i = 0; i < notas.size(); i++) {
            duraciones[i] = 1;
        }
        charly.tocarCancion(notas, duraciones);
    }
}
