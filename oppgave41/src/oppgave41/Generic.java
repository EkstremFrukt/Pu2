package oppgave41;

import java.util.AbstractList;

public class Generic<T> extends AbstractList<T> {
    private Object[] data;
    private int count = 0;

    Generic (int length) {
        data = new Object[length];
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("index provided does not exist");
        }

        Object item = data[index];

        final T item1 = (T) item;
        return item1;
    }

    @Override
    public int size() {
        return this.count + 1;
    }

    @Override
    public boolean add (T elem) {
        if (this.count >= size()) {
            return false;
        }

        data[this.count] = elem;
        this.count++;
        return true;
    }
}