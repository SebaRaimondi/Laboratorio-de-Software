import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Stack {
    private ArrayList items;

    public Stack() {
        this.items = new ArrayList();
    }

    public void push(Object item) {
        items.add(item);
    }

    public Object pop() {
        int last = items.size() - 1;
        Object obj = items.get(last);
        items.remove(last);
        return obj;
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public Iterator iterator() {
        return new Iterator() {
            int index;
            {
                index = items.size() - 1;
            }
            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Object next() {
                if (!hasNext()) throw new IndexOutOfBoundsException();
                return items.get(index--);
            }
        };
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");
        stack.push("String 5");

        Iterator iterator = stack.iterator();
        if (iterator instanceof Iterator) {
            System.out.println("instanceof");
        }
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());

        iterator = stack.iterator();
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
        System.out.println("Pop: " + iterator.next());
    }
}
