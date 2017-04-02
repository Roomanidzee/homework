package commands;

import functions.ChangeDirectoryImplementation;
import interfaces.Command;
import java.nio.file.Path;
import processing.CommandGenerator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ChangeDirectoryCommand extends CommandGenerator implements Command{
    
    private final ChangeDirectoryImplementation cd;
    
    public ChangeDirectoryCommand(ChangeDirectoryImplementation cd){
        
        this.cd = cd;
        
    }
    
    @Override
    public Path executePath(String path) {
        
       return this.cd.goTo(path);
        
    }
       
}
