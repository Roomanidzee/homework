package format;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CheckPictureFunctions {
    //необходимые константы
    private final byte bmpSize = 54;
    private final byte[] pngTemp = {0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A};
    private final byte[] jpgTemp = {(byte)0xFF, (byte)0xD8, (byte)0xFF};  
    private final char[] gifCheck = {'G','I','F','8'};
    
    public boolean checkJpeg(String pathToFile){
        //проверка формата jpeg
        int isJpeg = 0;
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToFile).normalize().toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого файла");
            
        }
        
        byte[] charArr = new byte[3];
        
        try(InputStream fr = new FileInputStream(path.toFile())){
            
            fr.read(charArr);
            fr.close();
            
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        for(int i = 1; i < charArr.length; i++){
                
                if(charArr[i] == this.jpgTemp[i - 1]){
                    
                    ++isJpeg;
                    
                }
                
            }
            
            return isJpeg == 2;
    }
    
    public boolean checkPng(String pathToFile){
        //проверка формата png
        int isPng = 0;
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToFile).normalize().toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого файла");
            
        }
        
        byte[] temp = new byte[8];
        
        try(InputStream fr = new FileInputStream(path.toFile())){
            
            fr.read(temp);
            fr.close();
            
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        for(int i = 1; i < temp.length; i++){
            
           if(temp[i] == this.pngTemp[i-1]){
               
               ++isPng;
               
           }
              
        }
        
        return isPng == 7;
        
    }
    
    public boolean checkBmp(String pathToFile){
        //проверка формата bmp
        int isBmp = 0;
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToFile).normalize().toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого файла");
            
        }
        
        byte[] temp = new byte[8];
        
         try(InputStream fr = new FileInputStream(path.toFile())){
            
            fr.read(temp);
            fr.close();
            
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода - вывода");
            
        }
        
        for(int i = 1; i < temp.length; i++){
            
           if(temp[i] == this.bmpSize){
               
               ++isBmp;
               
           }
              
        }
        
        return isBmp == 7;
    }
    
    public boolean checkGif(String pathToFile){
        //проверка формата gif
        int isGif = 0;
        
        Path path = null;
        
        try {
            
            path = Paths.get(pathToFile).normalize().toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Нет такого файла");
            
        }
        
        char[] temp = new char[4];
        
        try(Reader fr = new FileReader(path.toString())){
            
            fr.read(temp);
            fr.close();
            
        }catch(IOException err){
            
            System.err.println("Ошибка ввода-вывода");
            
        }
        
        for(int i = 0; i < this.gifCheck.length; i++){
            
            if(temp[i] == this.gifCheck[i]){
                
                isGif++;
                
            }
            
        }
        
        return isGif == 4;
    }
}
