package music_player.functions;

import music_player.interfaces.FileParseInterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class FileParseImplementation implements FileParseInterface{

    @Override
    public int[][] fileParse(Path pathToFile) {
        
        int k = 0;
        
        try(LineNumberReader lineCount = new LineNumberReader(new FileReader(pathToFile.toFile()))) 
        {
            
            while(lineCount.readLine() != null){
                
                k++;
                
            }
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        int[][] dataArray = new int[k][4];
        
        int index = 0;
        String line = "";
        Scanner sc;
        
        try(BufferedReader br = new BufferedReader(new FileReader(pathToFile.toFile())))
        {
            
            line = br.readLine();
            
            while(line != null && index < k){
                
                line = line.replaceAll(":", " ");
                
                
                
                sc = new Scanner(line);
                
                for(int i = 0; i < 4; i++){
                    
                    dataArray[index][i] = sc.nextInt();
                    
                }
                
                index++;
                
                line = br.readLine();
                
            }
            
        }catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }    
        
        return dataArray;
        
    }
    
}
