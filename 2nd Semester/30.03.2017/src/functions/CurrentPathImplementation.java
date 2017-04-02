package functions;

import interfaces.CurrentPath;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CurrentPathImplementation implements CurrentPath{

    @Override
    public Path showPath(String pathToFile) {
        
        Path path = Paths.get(pathToFile).toAbsolutePath();
        
        return path;
        
    }
    
}
