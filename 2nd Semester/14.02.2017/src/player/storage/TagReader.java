package player.storage;

import java.util.Arrays;
/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class TagReader {
    
    private Object[] tagArray;
    private int size = 0;
    
    public TagReader(){
        
       tagArray = new Object[20]; 
        
    }
    
    private void increaseArraySize(){
        
        this.tagArray = Arrays.copyOf(tagArray, tagArray.length * 2);
        
    }
    
    public void add(Object obj){
        
        if(this.tagArray.length - this.size <= 10){
            
            increaseArraySize();
            
        }
        
        this.tagArray[this.size] = obj;
        this.size++;
    }
    
    public Object get(Object obj){
        
        for(int i = 0; i < this.size; i++){
            
            if(this.tagArray[i] == obj){
                
                return this.tagArray[i];
                
            }
            
        }
        
        throw new NullPointerException("No such tag");
        
    }
}
