package player.storage;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import player.exceptions.StorageException;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class InternalDataStorage implements DataStorage{
    
    private static String[] dataArray;
    private static int size = 0;
    
    public InternalDataStorage() throws StorageException{
        
        InternalDataStorage.dataArray = new String[20];
        
    }
    
     private static void increaseArraySize(){
        
        InternalDataStorage.dataArray = Arrays.copyOf(dataArray, dataArray.length * 2);
        
    }
    
    @Override
    public boolean scan(URI uri){
        
        File file = new File(uri.toString());
        
        return file.isFile();
    }
    
    @Override
    public Object read(URI uri){
        
        File file = new File(uri.toString());
        return file;
        
    }
    
   

    public static void add(String song) {
        
         if(InternalDataStorage.dataArray.length - InternalDataStorage.size <= 10){
            
            increaseArraySize();
            
        }
        
        InternalDataStorage.dataArray[InternalDataStorage.size] = song;
        InternalDataStorage.size++;
        
    }
}
