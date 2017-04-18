package processing;

import classes.SerializableClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 * 
 */
public class ReadClass {
    
    public void readClass(Path pathToFile){
        
        if(Files.exists(pathToFile)){
            
            try(ObjectInputStream in = new ObjectInputStream(
                                       new FileInputStream(pathToFile.toFile())))
            {
                
                SerializableClass serialClass = (SerializableClass)in.readObject();
                
                System.out.println("Полученные данные: ");
                
                serialClass.fillAndShowArray();
                
            } catch (IOException ex) {
                
                System.err.println("Ошибка ввода - вывода");
                
            } catch (ClassNotFoundException ex) {
                
                System.err.println("Данный класс не найден");
                
            }
            
        }else{
            
            System.err.println("Файл не найден");
            
        }
        
    }
    
}
