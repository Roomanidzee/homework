package myproperties.main.java;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyPropertyViewer {
    
    public static void main(String[] args){
        
        Path path = Paths.get("myproperties/main/resources/app.properties.dist");
        
        MyPropertyReader r = new MyPropertyReader();
        
        r.printProperty(path);
        
    }
    
}
