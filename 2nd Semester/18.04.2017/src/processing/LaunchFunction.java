package processing;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {

    public static void launch() {
        
        Path path = null;
        
        try{
            
            path = Paths.get("src/data/file_for_saving_classes.txt").toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Путь не найден");
            
        }
        
        ReadClass rc = new ReadClass();
        WriteClass wc = new WriteClass();
        
        wc.writeClass(path);
        
        System.out.println();
        
        rc.readClass(path);
        
    } 
    
}
