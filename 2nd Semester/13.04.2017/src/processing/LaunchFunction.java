package processing;

import functions.ReadImplementation;
import functions.WriteImplementation;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    //демонстрация работы
    public static void launch(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите путь до файла: ");
        
        String pathToFile = sc.nextLine();
        
        Path realPath = null;
        
        try {
            
            realPath = Paths.get(pathToFile).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        int lineCounter = 0;
        
        try(LineNumberReader lineReader = new LineNumberReader(
                                          new FileReader(realPath.toFile()))) 
        {
         
             while(lineReader.readLine() != null){
                
                lineCounter++;
                
            }           
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        ReadImplementation readFile = new ReadImplementation(realPath.toFile(), lineCounter);
        WriteImplementation writeFile = new WriteImplementation(realPath.toFile());
        
        List<String[]> dataList = new ArrayList<>(lineCounter);
        
        readFile.read(dataList, lineCounter);
        
        for(int i = 0; i < dataList.size(); i++){
            
            System.out.println(Arrays.toString(dataList.get(i)));
            
        }
    }
    
}
