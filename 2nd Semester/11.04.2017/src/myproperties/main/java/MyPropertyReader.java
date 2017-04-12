package myproperties.main.java;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyPropertyReader {
    
    public void printProperty(Path pathToFile){
        
        String existPath = pathToFile.toString();
        
        MyPropertyImplementation myProp = new MyPropertyImplementation();        
        
        ClassLoader classLoader = getClass().getClassLoader();
        
        Reader isr = new InputStreamReader(classLoader.getResourceAsStream(existPath));
        
        try{
            
            myProp.load(isr);
            
        }catch(IOException e){
            
            System.err.println("Ошибка ввода-вывода");
            
        }
        
        System.out.println("Язык: " + myProp.getProperty("app.name"));
        System.out.println("Версия: " + myProp.getProperty("app.version"));
        
    }
    
}
