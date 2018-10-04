package practica6.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Similar {
    Map<String, List<String>>  qgrama = new HashMap<>();
    int size;

    public Similar(int size) {
        this.size = size;
    }

    public void addWord(String word) {
        ArrayList<String> tokens = tokenize("#" + word + "$");
        loadAll(tokens, word);
    }

    private ArrayList<String> tokenize(String w) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < w.length() - 1; i++) {
            list.add(w.substring(i, i + 1));
        }
        return list;
    }

    private void loadAll(ArrayList<String> tokens, String word) {
        List<String> initialList = new ArrayList();
        initialList.add(word);

        for (String token: tokens) {
            if (qgrama.putIfAbsent(token, initialList) == null) qgrama.get(token).add(word);
        }
    }
}
