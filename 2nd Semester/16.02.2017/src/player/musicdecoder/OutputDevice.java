package player.musicdecoder;

import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class OutputDevice{

    private boolean getFormats;
    
    private Object[] formatsArray;
    private int size = 0;
    
    public OutputDevice(){
        
        this.formatsArray = new Object[20];
        
    }
    
    public void add(Object format){
        
         if(this.formatsArray.length - this.size <= 10){
            
            increaseArraySize();
            
        }
        
        this.formatsArray[this.size] = format;
        this.size++;
        
    }
    
     private void increaseArraySize(){
        
       this.formatsArray = Arrays.copyOf(this.formatsArray, this.formatsArray.length * 2);
        
    }
    
    public void decoding(){
        
         while(this.getFormats){
    
              String what = FormatGenerator.generate();
              add(FormatGenerator.getFormat(what));
           
         }
        
    }
    
    

    
}
