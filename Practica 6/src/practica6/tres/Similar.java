package practica6.tres;

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

    public void addWord(String w) {
        ArrayList<String> tokens = tokenize(w);
        for (String token: tokens) {

        }
        
    }

    private ArrayList<String> tokenize(String w) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            list.add(w.substring(i, i + 1));
        }
        return list;
    }
}
