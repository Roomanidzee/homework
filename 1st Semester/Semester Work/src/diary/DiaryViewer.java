package diary;

import diary.functions.InitFunction;
import java.io.FileNotFoundException;

/**
 * 
 * The{@code DiaryViewer} class launch the whole diary
 * 
 * @author Andrey Romanov
 * @version 1.0
 */

public class DiaryViewer{
    
    /**
     * 
     * @param args main method, which launch full app
     * @throws FileNotFoundException 
     */
     public static void main(String[] args) throws FileNotFoundException{        
        
        InitFunction.init(); //main function
    	
    }     
    
   
   
}
