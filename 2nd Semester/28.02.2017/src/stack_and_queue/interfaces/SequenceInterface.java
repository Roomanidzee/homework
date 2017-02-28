package stack_and_queue.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface SequenceInterface<T> {
    
    void add(T obj);
    T pop();
    T peek();
    int size();
    
}
