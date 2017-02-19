package player.playertype;

import java.util.Scanner;
import player.exceptions.StorageException;
import player.exceptions.UserInteractorException;
import player.storage.InternalDataStorage;
import player.storage.MusicStorage;

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
