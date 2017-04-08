package functions;

import interfaces.MoveFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MoveFileImplementation implements MoveFile{

    @Override
    public void moveTo(String src, String dest) {
        
        Path source = null;
        Path destination  = null;
        
        try{
            
            source = Paths.get(src).toRealPath();
            destination = Paths.get(dest).toRealPath();
            
        }catch(IOException ex){
            
            System.err.println("Нет таких путей");
            
        }
        
        
        
        File tempFile = destination.toFile();
        
        if(tempFile.exists() && tempFile.canRead()){
            
            if(tempFile.isFile()){
                
                try{
                
                    Files.move(source, source.resolveSibling(source.getName(source.getNameCount() - 1)));
                
                }catch(IOException e){
                
                    System.err.println("Произошла ошибка при перемещении файла");
                
                }    
                
            }
            
            if(tempFile.isDirectory()){
                
               try{
                
                  Files.move(source, destination.resolve(source.getFileName()), REPLACE_EXISTING);
                
               }catch(IOException e){
                
                  System.err.println("Произошла ошибка при перемещении файла");
                
               }   
                
            }      
        }       
    } 
}