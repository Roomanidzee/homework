package processing;

import classes.SerializableClass;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WriteClass {
    
    public void writeClass(Path pathToFile){
        
        SerializableClass serialClass = new SerializableClass();
        
        if(Files.exists(pathToFile)){
            
            try(ObjectOutputStream out = new ObjectOutputStream(
                                     new FileOutputStream(pathToFile.toFile())))
            {
            
                out.writeObject(serialClass);
            
                System.out.println("Было записано: ");
            
                serialClass.fillAndShowArray();
            
            } catch (IOException ex) {
                
                System.err.println("Ошибка ввода - вывода");
                
            }
            
        }else{
            
            System.err.println("Файл не найден");
            
        }   
    }
    
}
