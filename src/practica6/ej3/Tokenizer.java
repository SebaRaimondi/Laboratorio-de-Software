package practica6.ej3;

import java.util.ArrayList;

public class Tokenizer {
    public static ArrayList<String> tokenize(String w, int size) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < w.length() - (size - 1); i++) {
            list.add(w.toLowerCase().substring(i, i + size));
        }
        return list;
    }
}
