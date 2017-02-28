package map_realizer.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface MapInterface<T1, T2> {
    
    void add(T1 key, T2 value);
    T2 remove(T1 key);
    T2 get(T1 key);
    void set(T1 key, T2 value);
    void removeAll();
    T1[] getKeys();
    T2[] getValues();
    int size();
    
}
