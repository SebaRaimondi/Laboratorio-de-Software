package practica6.ej3;

public class QGramaTest {
    public static void main(String[] args) {
        int size = 2;
        QGrama qGrama = new QGrama(size);

        qGrama.addWord("Cosa");
        qGrama.addWord("Casa");
        qGrama.addWord("Cama");

        // Debe devolver Casa porque comparten "as"
        System.out.println(StringMatcher.match(qGrama, "Gasoam", size));
    }
}
