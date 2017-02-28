package music_player.player.playertype;

import java.util.Scanner;
import music_player.player.exceptions.StorageException;
import music_player.player.exceptions.UserInteractorException;
import music_player.player.storage.InternalDataStorage;
import music_player.player.storage.MusicStorage;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ConsoleUserInteractor implements UserInteractor{
    
    private final Scanner sc = new Scanner(System.in);
    private String command;
    
    public ConsoleUserInteractor() throws UserInteractorException{}
    
    @Override
    public String readCommand() throws UserInteractorException{
        
        this.command = sc.nextLine();
        return this.command;
        
    }

    @Override
    public void exit() {
        
        System.out.println("Thank you for using the app!");
        System.exit(0);
        
    }

    @Override
    public void add(String song) throws StorageException {
        
        InternalDataStorage.add(song);
        
    }

    @Override
    public void createPlaylist() throws StorageException{
        
        MusicStorage.createPlaylist();
        
    }
    
   
    
}
