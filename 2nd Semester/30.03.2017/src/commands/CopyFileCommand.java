package commands;

import functions.CopyFileImplementation;
import interfaces.Command;
import processing.CommandGenerator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CopyFileCommand extends CommandGenerator implements Command{
    
    private final CopyFileImplementation copy;
    
    public CopyFileCommand(CopyFileImplementation copy){
        
        this.copy = copy;
        
    }
    
    @Override
    public void executeMore(String path1, String path2){
        
        copy.copyToFile(path1, path2);
        
    }
    
}
