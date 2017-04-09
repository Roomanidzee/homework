package numbers;

import java.io.File;//все необходимые импорты
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class NumbersWorker {
    
    public static void main(String[] args){
        
        Random r = new Random();//инициализация экземпляров
        byte[] array = new byte[20];       
            
        r.nextBytes(array);       
        
        System.out.println("Исходный массив: " + Arrays.toString(array));
        
        Path path = null;
        
        try {
            
            path = Paths.get("src/data/numbers.txt").toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        File file = path.toFile(); //запись в файл
        
        try(OutputStream os = new FileOutputStream(file)){           
            
            os.write(array);
            os.close();
            
        }catch(FileNotFoundException ex){
            
            System.err.println("Файл не найден");
            
        }catch(IOException ex){       
            
            System.err.println("Ошибка ввода - вывода");
                           
        }        
        
        try(InputStream is = new FileInputStream(file)){//считывание из файла
            
            is.read(array);
            
            is.close();
            
        }catch(IOException ex){       
            
            System.err.println("Ошибка ввода - вывода");
                           
        }
        
        System.out.println("Считанный массив: " + Arrays.toString(array));
  }
}   
