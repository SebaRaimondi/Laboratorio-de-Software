package hashsets;

import java.util.Collection;

public class HashSetRemovidos<E> extends HashSetAbstract {
    private int cantidadRemovidos;

    public HashSetRemovidos() {
        super();
        cantidadRemovidos = 0;
    }

    public HashSetRemovidos(Collection c) {
        super(c);
        cantidadRemovidos = c.size();
    }

    @Override
    public boolean remove(Object o) {
        cantidadRemovidos--;
        return super.remove(o);
    }

    @Override
    public boolean removeAll(Collection c) {
        cantidadRemovidos -= c.size();
        return super.removeAll(c);
    }

    public int getCantidadAgregados() {
        return cantidadRemovidos;
    }
}
