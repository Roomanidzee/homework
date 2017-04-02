package commands;

import functions.CurrentPathImplementation;
import interfaces.Command;
import java.nio.file.Path;
import processing.CommandGenerator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CurrentPathCommand extends CommandGenerator implements Command{
    
    private final CurrentPathImplementation currentPath;
    
    public CurrentPathCommand(CurrentPathImplementation currentPath){
        
        this.currentPath = currentPath;
        
    }
    
    @Override
    public Path executePath(String path) {
        
       return this.currentPath.showPath(path);
        
    }
    
}
