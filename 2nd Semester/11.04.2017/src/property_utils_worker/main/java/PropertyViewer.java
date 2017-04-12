package property_utils_worker.main.java;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class PropertyViewer {
    
    public static void main(String[] args) {
        
        PropertyReader pr = new PropertyReader();
        
        Path path = Paths.get("property_utils_worker/main/resources/app.properties.dist");
        
        pr.printProperty(path);
        
    }
    
}
