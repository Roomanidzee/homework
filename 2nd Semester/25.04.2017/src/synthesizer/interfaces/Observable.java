package synthesizer.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface Observable {
    
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setNumber(int noteNumber);
    
}
