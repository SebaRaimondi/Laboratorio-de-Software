package practica2.hashsets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class HashSetAbstract<E> implements Set {
    private HashSet hash;

    public HashSetAbstract() {
        this.hash = new HashSet();
    }

    public HashSetAbstract(Collection c) {
        this.hash = new HashSet(c);
    }

    @Override
    public int size() {
        return hash.size();
    }

    @Override
    public boolean isEmpty() {
        return hash.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hash.contains(o);
    }

    @Override
    public Iterator iterator() {
        return hash.iterator();
    }

    @Override
    public Object[] toArray() {
        return hash.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return hash.toArray(a);
    }

    @Override
    public boolean add(Object o) {
        return hash.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return hash.remove(o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return hash.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        return hash.addAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return hash.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return hash.removeAll(c);
    }

    @Override
    public void clear() {
        hash.clear();
    }
}
