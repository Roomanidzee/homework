package functions;

import interfaces.ReadInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ReadImplementation implements ReadInterface{
    //реализация ReadInterface
    private final File CHANGEABLE_FILE;
    private List<String[]> fileDataArray;
    
    public ReadImplementation(File file, int size){
        
        this.CHANGEABLE_FILE = file;
        this.fileDataArray = new ArrayList<>(size);
        
    }
    //разбор строки по пробелам
    private StringBuilder makeStringBetterAgain(char[] charSequence, int begin, int end){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = begin; i < end; i++){
           
            sb.append(charSequence[i]);
            
        }
        
        return sb;
        
    }
    //запись документа в промежуточную коллекцию
    private void readToList(){
        
        String line = "";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(this.CHANGEABLE_FILE))) {
            
            line = reader.readLine();            
            
            String changedLine = "";
            
            String[] array = null;
            
            int k = 0;
            
            char[] charSequence = null;
            
            int[] tagArray = null;
            
            while(line != null){
                
                changedLine = line.replaceAll("\\s*,\\s*", " ");
                
                charSequence = changedLine.toCharArray();
                
                for(int i = 0; i < charSequence.length; i++){
                    
                    if(charSequence[i] == ' '){
                        
                        k++;
                        
                    }
                    
                }
                
                array = new String[k];
                tagArray = new int[k];
                
                int count = 0;
                
                for(int i = 0; i < charSequence.length; i++){
                    
                    if(charSequence[i] == ' '){
                        
                        tagArray[count] = i;
                        count++;
                        
                    }
                    
                }                
                
                int begin = 0;
                int end = 0;
                
                StringBuilder sb = null;
                
                for(int i = 0; i < array.length; i++){
                    
                    end = tagArray[i];
                    
                    sb = makeStringBetterAgain(charSequence, begin, end);
                    
                    array[i] = sb.toString();
                    
                    begin = end + 1;
                    
                }
                
                this.fileDataArray.add(array);
        
                line = reader.readLine();
                
            }
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }        
        
    }
    
    @Override
    public List<String[]> read(List<String[]> dataArray, int n) {
        
        readToList();
        
        for(int i = 0; i < n; i++){
            
            dataArray.add(this.fileDataArray.get(i));
            
        }

        return dataArray;        
        
    }

    @Override
    public List<String[]> showAll(List<String[]> dataArray) {
        
        readToList();
        
        for(int i = 0; i < fileDataArray.size(); i++){
            
            dataArray.add(this.fileDataArray.get(i));
            
        }

        return dataArray;
        
    }
    
}
