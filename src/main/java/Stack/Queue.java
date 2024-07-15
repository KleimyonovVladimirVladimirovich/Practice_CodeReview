package Stack;

public interface Queue<T> {
    void add(T item); //Добавляем эл в конец очереди
    T remove(); //Извлекаем эл из начала очереди
    boolean isEmpty();
}
