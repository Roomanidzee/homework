package commands;

import functions.ShowFileInfoImplementation;
import interfaces.Command;
import processing.CommandGenerator;
/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ShowFileInfoCommand extends CommandGenerator implements Command{
    
    private final ShowFileInfoImplementation info;
    
    public ShowFileInfoCommand(ShowFileInfoImplementation info){
        
        this.info = info;
        
    }

    @Override
    public void execute(String path) {
        
        this.info.showFiles(path);
        
    }

    @Override
    public void executeAdded(String path) {
        
        this.info.showFilesWithInfo(path);
        
    }

    @Override
    public void executeAddedMore(String path) {
        
       this.info.showAllFiles(path);
       
    }

    @Override
    public void executeFull(String path) {
        
        this.info.showAllFilesFull(path);
        
    }
    
}
