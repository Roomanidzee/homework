package commands;

import functions.DeleteFileImplementation;
import interfaces.Command;
import processing.CommandGenerator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class DeleteFileCommand extends CommandGenerator implements Command{
    
    private final DeleteFileImplementation rm;
    
    public DeleteFileCommand(DeleteFileImplementation rm){
        
        this.rm = rm;
        
    }

    @Override
    public void execute(String path) {
        
        this.rm.deleteSimple(path);
        
    }

    @Override
    public void executeAdded(String path) {
        
        this.rm.deleteRecursive(path);
        
    }

    @Override
    public void executeAddedMore(String path) {
        
        this.rm.deleteFolder(path);
        
    }

    @Override
    public void executeFull(String path) {
        
        this.rm.deleteAll(path);
        
    }
    
}
