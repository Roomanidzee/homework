package property_utils_worker.main.java;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;
import java.util.Properties;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class PropertyReader {
    
    public void printProperty(Path pathToFile){
        
        String existPath = pathToFile.toString();
        
        Properties p = new Properties();        
        
        ClassLoader classLoader = getClass().getClassLoader();
        //Перевод в Reader для загрузки в Properties
        Reader isr = new InputStreamReader(classLoader.getResourceAsStream(existPath));    
        
        try {
            
            p.load(isr);
            
        } catch (IOException ex) {
            
            System.err.println("Файл не найден");
            
        }
        
        System.out.println("Язык: " +  p.getProperty("app.name"));
        System.out.println("Версия: " + p.getProperty("app.version"));
    }
    
}
