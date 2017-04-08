package functions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import interfaces.DeleteFile;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class DeleteFileImplementation implements DeleteFile{

    @Override
    public void deleteSimple(String pathToDirectory) {
        
        try {
            
            Path path = Paths.get(pathToDirectory).toRealPath();
            
            Files.delete(path);
            
        } catch (IOException ex) {
            
            System.err.println("Файл не найден");
            System.exit(1);
            
        }
        
    }

    @Override
    public void deleteRecursive(String pathToDirectory) {
        
        Path path = null;
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
           System.err.println("Нет такого пути");
           
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        
        if(dir.exists() && dir.canRead()){
            
            filesArray = dir.listFiles();
            
        }else{
            
            System.err.println("Нет такого пути");
            System.exit(1);
            
        }
        
        for(File filesArray1 : filesArray){
            
            try {
                
                Files.delete(filesArray1.toPath());
                
            } catch (IOException ex) {
                
                System.err.println("Произошла ошибка при удалении файла");
                
            }
            
        }
    }

    @Override
    public void deleteFolder(String pathToDirectory) {
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        File dir = path.toFile();
        
        if(dir.exists() && dir.canRead() && dir.isDirectory()){
            
            try {
                
                Files.delete(dir.toPath());
                
            } catch (IOException ex) {
                
                System.err.println("Данный объект - не папка");
                System.exit(1);
                
            }
            
        }
        
    }

    @Override
    public void deleteAll(String pathToDirectory) {
        
        Path path = null;
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого пути");
            
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        
        if(dir.exists() && dir.canRead() && dir.isDirectory()){
            
            filesArray = dir.listFiles();
            
            for(File filesArray1 : filesArray){
                
                try{
                    
                    Files.delete(filesArray1.toPath());
                    
                }catch(IOException ex){
                    
                    System.err.println("Произошла ошибка при удалении файлов");
                    System.exit(1);
                    
                }   
                
            }
            
            try{
                
                Files.delete(dir.toPath());
                
            }catch(IOException e){
                
                System.err.println("Произошла ошибка при удалении папки");
                System.exit(1);
                
            }
        }else{
            
            System.err.println("Данный объект - не папка");
            
        }
        
    }    
}