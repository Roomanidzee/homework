package functions;

import interfaces.WriteInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WriteImplementation implements WriteInterface{
    //реализация интерфейса WriteInterface
    private final File CHANGEABLE_FILE;
    private final String ENCODING = "UTF-8";
    
    public WriteImplementation(File file){
        
        this.CHANGEABLE_FILE = file;
        
    }
    
    @Override
    public boolean write(List<String[]> dataArray) {
        
        if(dataArray == null){
            
            throw new NullPointerException("Передана пустая коллекция");
            
        }
        
        int lineCounter = 0;
        
        try(LineNumberReader lineReader = new LineNumberReader(
                                          new FileReader(this.CHANGEABLE_FILE)))
        {
            
            while(lineReader.readLine() != null){
                
                lineCounter++;
                
            }
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        List<String[]> fileDataArray = new ArrayList<>(lineCounter);
        
        try(BufferedReader br = new BufferedReader(new FileReader(this.CHANGEABLE_FILE))){
            
            String line = "";
            
            line = br.readLine();
            
            String[] array = new String[1];
            
            while(line != null){
                
                array[0] = line;
        
                fileDataArray.add(array);
        
                line = br.readLine();
                
            }            
            
        } catch (FileNotFoundException ex) {
            
            System.err.println("Файл не найден");
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода-вывода");
            
        }
        
        try(PrintWriter pw = new PrintWriter(this.CHANGEABLE_FILE,this.ENCODING)){
            
            for(int i = 0; i < fileDataArray.size(); i++){
                
                pw.println(Arrays.toString(fileDataArray.get(i)));
                
            }
            
            for(int j = 0; j < dataArray.size(); j++){
                
                pw.println(Arrays.toString(dataArray.get(j)));
                
            }
            
        }catch(IOException err){
            
            System.err.println("Ошибка ввода - вывода");
            
        }
            
            return true;      
        
    }
    
}
