package functions;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import interfaces.ShowFileInfo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ShowFileInfoImplementation implements ShowFileInfo{
    
    private long folderSize(File directory){
        
        long length = 0;
        for(File file : directory.listFiles()){
            
            if(file.isFile()){
                
                length += file.length();
                
            }else{
                
                length += folderSize(file);
                
            }      
            
        }
        
        return length;
    }
    
    @Override
    public void showFiles(String pathToDirectory) {
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет таких путей");
            
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        
        if(dir.exists() && dir.canRead()){
            
            filesArray = dir.listFiles();
            
        }else{
            
            System.err.println("Нет такого пути");
            System.exit(1);
            
        }
        
        System.out.println("Файлы по пути " + path + ": ");
        System.out.println();
        
        for (File filesArray1 : filesArray) {
            
            System.out.println(filesArray1.getName());
            
        }
    }

    @Override
    public void showFilesWithInfo(String pathToDirectory) {
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет таких путей");
            
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        
        if(dir.exists() && dir.canRead()){
            
            filesArray = dir.listFiles();
            
        }else{
            
            System.err.println("Нет такого пути");
            System.exit(1);
            
        }
        
        System.out.println("Файлы по пути " + path + ": ");
        System.out.println();
        
        long bytes, kilobytes, megabytes;
        
        UserPrincipal owner = null;
        FileTime time = null;
        
        for (File filesArray1 : filesArray) {
            
            if(filesArray1.isDirectory()){
                
                bytes = folderSize(filesArray1);
                
            }else{
                
                bytes = filesArray1.length();
                
            }           
            
            kilobytes = bytes / 1024;
            megabytes = kilobytes / 1024;
            
            try{
                
                owner = Files.getOwner(filesArray1.toPath());
                time = Files.getLastModifiedTime(filesArray1.toPath());
                
            }catch(IOException e){
                
                System.err.println("Произошла ошибка при получении параметра");
                
            }           
                
            if(megabytes == 0){
                
                 System.out.printf("%d Кб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", kilobytes,owner.toString(),
                        time.toString(),
                        filesArray1.getName());
                
            }else{
                
                System.out.printf("%d Мб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", megabytes,owner.toString(),
                        time.toString(),
                        filesArray1.getName());
                
            }
                         
        }      
    }

    @Override
    public void showAllFiles(String pathToDirectory) {
       
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет таких путей");
            
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        File[] filesHiddenArray = null;
        
        if(dir.exists() && dir.canRead()){
            
            filesArray = dir.listFiles();
            
        }
        
        int k = 0;
        
        for (File filesArray1 : filesArray) {
            
            if (filesArray1.isHidden()) {
                k++;
            }
            
        }
        
        filesHiddenArray = new File[k];
        
        int counter = 0;
        
        for (File filesArray1 : filesArray) {
            
            if (filesArray1.isHidden()) {
                
                filesHiddenArray[counter] = filesArray1;
                counter++;
                
            }
        }
        
        System.out.println("Файлы по пути " + path + ": ");
        System.out.println();
        
        for (File filesArray1 : filesArray) {
            
            System.out.println(filesArray1.getName());
            
        }
        
        for (File filesHiddenArray1 : filesHiddenArray){
            
            System.out.println(filesHiddenArray1.getName());
            
        }
    }

    @Override
    public void showAllFilesFull(String pathToDirectory) {
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToDirectory).toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет таких путей");
            
        }
        
        File dir = path.toFile();
        
        File[] filesArray = null;
        File[] filesHiddenArray = null;
        
        if(dir.exists() && dir.canRead()){
            
            filesArray = dir.listFiles();
            
        }
        
        int k = 0;
        
        for (File filesArray1 : filesArray) {
            
            if (filesArray1.isHidden()) {
                k++;
            }
            
        }
        
        filesHiddenArray = new File[k];
        
        int counter = 0;
        
        for (File filesArray1 : filesArray) {
            
            if (filesArray1.isHidden()) {
                
                filesHiddenArray[counter] = filesArray1;
                counter++;
                
            }
        }
        
        System.out.println("Файлы по пути " + path + ": ");
        System.out.println();
        
        long bytes, kilobytes, megabytes;
        
        UserPrincipal owner = null;
        FileTime time = null;
        
        for (File filesArray1 : filesArray) {
            
            if(filesArray1.isDirectory()){
                
                bytes = folderSize(filesArray1);
                
            }else{
                
                bytes = filesArray1.length();
                
            } 
            kilobytes = bytes / 1024;
            megabytes = kilobytes / 1024;
            
            try{
                
                owner = Files.getOwner(filesArray1.toPath());
                time = Files.getLastModifiedTime(filesArray1.toPath());
                
            }catch(IOException e){
                
                System.err.println("Произошла ошибка при получении параметра");
                
            }
            
           if(megabytes == 0){
                
                 System.out.printf("%d Кб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", kilobytes,owner.toString(),
                        time.toString(),
                        filesArray1.getName());
                
            }else{
                
                System.out.printf("%d Мб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", megabytes,owner.toString(),
                        time.toString(),
                        filesArray1.getName());
                
            }                       
        
        for (File filesHiddenArray1 : filesHiddenArray) {
            
            if(filesHiddenArray1.isDirectory()){
                
                bytes = folderSize(filesArray1);
                
            }else{
                
                bytes = filesHiddenArray1.length();
                
            } 
            kilobytes = bytes / 1024;
            megabytes = kilobytes / 1024;
            
            try{
                
                owner = Files.getOwner(filesHiddenArray1.toPath());
                time = Files.getLastModifiedTime(filesHiddenArray1.toPath());
                
            }catch(IOException e){
                
                System.err.println("Произошла ошибка при получении параметра");
                
            }
            
            if(megabytes == 0){
                
                 System.out.printf("%d Кб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", kilobytes,owner.toString(),
                        time.toString(),
                        filesHiddenArray1.getName());
                
            }else{
                
                System.out.printf("%d Мб, Владелец Файла: %s, Время последнего "
                        + "изменения: %s, %s\n", megabytes,owner.toString(),
                        time.toString(),
                        filesHiddenArray1.getName());
                
            }
            
        }
     }    
  }
}    
