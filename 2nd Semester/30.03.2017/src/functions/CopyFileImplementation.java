package functions;

import interfaces.CopyFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CopyFileImplementation implements CopyFile{

    @Override
    public void copyToFile(String src, String dest) {
        
        Path source = Paths.get(src).toAbsolutePath();
        Path newdir = Paths.get(dest).toAbsolutePath();
        
        File dir = newdir.toFile();
        
        if(dir.exists() && dir.canRead() && dir.isDirectory()){
            
            try{
                
                Files.copy(source, newdir.resolve(source.getFileName()));
                
            }catch(IOException e){
                
                System.err.println("Произошла ошибка при копировании файла");
                
            }
            
        }else{
            
            System.err.println("Нет такой папки");
            
        }
        
    }
    
}
