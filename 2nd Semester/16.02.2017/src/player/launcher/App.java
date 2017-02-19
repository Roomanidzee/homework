package player.launcher;

import player.exceptions.StorageException;
import player.exceptions.UserInteractorException;
import player.playertype.ConsoleUserInteractor;
import player.playertype.UserInteractor;
import player.storage.DataStorage;
import player.storage.InternalDataStorage;

import java.util.Scanner;
import player.trackproperty.Track;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class App extends Application{
    
    protected UserInteractor reader;
    protected DataStorage ds;
    protected String command = this.reader.readCommand();
    private Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) throws UserInteractorException{
        
        App app = new App(args);
        
    }

    private App(String[] args) throws UserInteractorException{
        
        super(args);
        Track track = Track.getInstance();
        
        
    }
    
    @Override
    public void init() {
        
        try{
            
            this.reader = new ConsoleUserInteractor();
            this.ds = new InternalDataStorage();
            
        }catch(UserInteractorException ex){
            
            System.err.println("Couldn't start application");
            System.err.println(ex.getMessage());
            System.exit(1);
            
        } catch (StorageException ex) {
           
            System.err.println("Some errors with storage");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        
    }

    @Override
    public void start() {       
        
        System.out.println("Please, enter the command");
        
        try{
            
          while(this.command != null){  
            
            switch(this.command){
                
                case "exit":
                    
                    this.reader.exit();
                    break;
                
                case "add":
                    
                    System.out.println("Enter the name of song: ");
                    String song = sc.nextLine();
                    this.reader.add(song);
                    
                    break;
                
                case "create playlist":
                    
                    this.reader.createPlaylist();
                    break;
                    
                default:
                    
                    System.out.println("I don't know. what the command is");
            }
            
          }  
            
        }catch(StorageException ex) {
           
            System.err.println("Some errors with storage");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        
    }
    
}
