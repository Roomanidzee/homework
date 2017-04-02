package functions;

import interfaces.ChangeDirectory;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ChangeDirectoryImplementation implements ChangeDirectory{    
    
    @Override
    public Path goTo(String pathToDirectory) {
        
        Path path = Paths.get(pathToDirectory).toAbsolutePath();
        
        return path;
        
    }
    
}
