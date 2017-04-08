package functions;

import interfaces.CurrentPath;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CurrentPathImplementation implements CurrentPath{

    @Override
    public Path showPath(String pathToFile) {
        
        Path path = null;
        
        try{
            
            path = Paths.get(pathToFile).toRealPath();
            
        }catch(IOException ex){
            
            System.err.println("Нет такого пути");
            
        }       
        
        return path;
        
    }
    
}
