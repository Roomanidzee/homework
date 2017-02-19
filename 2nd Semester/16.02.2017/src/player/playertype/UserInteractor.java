package player.playertype;

import player.exceptions.StorageException;
import player.exceptions.UserInteractorException;

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
