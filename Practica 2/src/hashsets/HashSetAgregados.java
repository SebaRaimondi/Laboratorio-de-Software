package hashsets;

import java.util.Collection;

public class HashSetAgregados<E> extends HashSetAbstract {
    private int cantidadAgregados;

    public HashSetAgregados() {
        super();
        this.cantidadAgregados = 0;
    }

    public HashSetAgregados(Collection c) {
        super(c);
        this.cantidadAgregados = c.size();
    }

    @Override
    public boolean add(Object o) {
        cantidadAgregados++;
        return super.add(o);
    }

    @Override
    public boolean addAll(Collection c) {
        cantidadAgregados += c.size();
        return super.addAll(c);
    }

    public int getCantidadAgregados() {
        return cantidadAgregados;
    }
}
