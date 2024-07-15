package Stack;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T>{
    private ArrayList<T> arrayList = new ArrayList<T>();
    @Override
    public void push(T item) {
    arrayList.add(0,item);
    }

    @Override
    public T pop() {
        return arrayList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
