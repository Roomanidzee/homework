package symbols;

import java.io.File;//все необходимые импорты
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class SymbolsWorker {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);//инициализация экземпляров
        
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        
        Path path = null;
        
        try {
            
            path = Paths.get("src/data/symbols.txt").toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        File file = path.toFile();        
        //запись в файл
        try(Writer fw = new FileWriter(file)){
            
            fw.write(input);
            
        }catch(IOException e){
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        char[] charArray = new char[input.length()]; 
        //чтение из файла
        try(Reader fr = new FileReader(file)){
            
            fr.read(charArray);
            
        }catch(IOException e){
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        
        System.out.println("Полученная строка: " + Arrays.toString(charArray)); 
    }
    
}
