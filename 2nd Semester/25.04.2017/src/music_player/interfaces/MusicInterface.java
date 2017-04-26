package music_player.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface MusicInterface {
    
    void playSound(int channel, int volume, int duration, int type, int... notes);
    void close();
    
}
