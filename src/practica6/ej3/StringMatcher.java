package practica6.ej3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class StringMatcher {
    public static Collection match(QGrama qGrama, String word, int size) {
        ArrayList<String> tokens = Tokenizer.tokenize("#" + word + "$", size);
        Set<String> set = new TreeSet<>();

        for (String token : tokens) {
            Collection col = qGrama.getQgrama().get(token);
            if (col != null) set.addAll(col);
        }

        return set;
    }
}
