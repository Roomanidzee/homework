package synthesizer.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface Observer {
    
    void update(int noteNumber);
    int getNumber();
    
}
