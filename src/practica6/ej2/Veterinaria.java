package practica6.ej2;

public class Veterinaria<E> {
    private E animal;
    public void setAnimal(E x) {
        animal = x;
    }
    public E getAnimal() {
        return animal;
    }
}
