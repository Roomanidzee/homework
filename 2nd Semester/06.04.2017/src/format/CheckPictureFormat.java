package format;

import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CheckPictureFormat {
    
    public static void main(String[] args){
        
        CheckPictureFunctions func = new CheckPictureFunctions();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите путь до файла: ");
        
        String stringPath = sc.nextLine();
        
        if(func.checkJpeg(stringPath)){
           
            System.out.println("Формат файла - jpg");
           
        }else if(func.checkPng(stringPath)){
            
            System.out.println("Формат файла - png");
            
        }else if(func.checkBmp(stringPath)){
            
            System.out.println("Формат файла - bmp");
            
        }else if(func.checkGif(stringPath)){
            
            System.out.println("Формат файла - gif");
            
        }else{
            
            System.err.println("Не определено");
            
        }
        
    }
    
}
