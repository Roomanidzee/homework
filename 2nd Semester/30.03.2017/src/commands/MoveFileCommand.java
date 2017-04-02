package commands;

import functions.MoveFileImplementation;
import interfaces.Command;
import processing.CommandGenerator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MoveFileCommand extends CommandGenerator implements Command{
    
    private final MoveFileImplementation move;
    
    public MoveFileCommand(MoveFileImplementation move){
        
        this.move = move;
        
    }
    
    @Override
    public void executeMore(String path1, String path2){
        
        this.move.moveTo(path1, path2);
        
    }
}
