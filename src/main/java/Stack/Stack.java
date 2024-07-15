package Stack;

public interface Stack<T> {
    void push(T item); //доб эл на верш стека
    T pop(); //забираем эл из верш стека

    boolean isEmpty();

}
