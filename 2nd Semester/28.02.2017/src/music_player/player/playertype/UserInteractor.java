package music_player.player.playertype;

import music_player.player.exceptions.StorageException;
import music_player.player.exceptions.UserInteractorException;

/**
 *
 * @author Андрей Романов
 */

public interface UserInteractor {
    
    String readCommand() throws UserInteractorException;
    void exit();
    void add(String song) throws StorageException;
    void createPlaylist() throws StorageException;
    
    
}
