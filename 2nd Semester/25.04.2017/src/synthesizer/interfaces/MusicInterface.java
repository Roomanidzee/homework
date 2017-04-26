package synthesizer.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface MusicInterface {
    
    void playSound(int duration, int volume, int type, int note);
    void close();
    
}
