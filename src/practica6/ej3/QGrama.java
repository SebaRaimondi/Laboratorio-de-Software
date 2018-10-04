package practica6.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QGrama {
    Map<String, List<String>> qgrama = new HashMap<>();
    int size;

    public QGrama(int size) {
        this.size = size;
    }

    public void addWord(String word) {
        ArrayList<String> tokens = Tokenizer.tokenize("#" + word + "$", size);
        loadAll(tokens, word);
    }

    private void loadAll(ArrayList<String> tokens, String word) {
        List<String> list;
        for (String token: tokens) {
            list = new ArrayList<>();
            list.add(word);
            if (qgrama.putIfAbsent(token, list) != null) qgrama.get(token).add(word);
        }
    }

    public Map<String, List<String>> getQgrama() {
        return qgrama;
    }
}
