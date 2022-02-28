/**
 * Created by Arabic on 28/02/22.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
