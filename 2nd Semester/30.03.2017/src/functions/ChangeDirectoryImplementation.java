package functions;

import interfaces.ChangeDirectory;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ChangeDirectoryImplementation implements ChangeDirectory{    
    
    @Override
    public Path goTo(String pathToDirectory) {
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        return path;
        
    }
    
}
