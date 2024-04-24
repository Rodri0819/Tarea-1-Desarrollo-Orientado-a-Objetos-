package org.example;
import java.util.ArrayList;
import java.util.List;

public class Deposito<T> {
    private List<T> items = new ArrayList<>();

    public T get() {
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null;
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
