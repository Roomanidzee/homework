package info.istamendil.notebook.data;

import java.util.Arrays;

/**
 *
 * @author Андрей Романов
 */
public class DB1 implements Db{
    
    private String[] data;
    private String[] newData;
    private int size = 0;
    
    public DB1(String[] data, int size){
        
        this.data = data;
        this.size = size;
        
    }
    
    public DB1(){
        
        this.data = new String[10];
        
    }
    
    
    @Override
    public void save(Object obj){
            
       if(this.data.length - this.size <= 5){
           
           increaseArraySize();
           
       }      
       
            this.data[this.size] = (String)obj;
            this.size++;
         
    }
    
    public void increaseArraySize(){
        
        this.data = Arrays.copyOf(this.data, this.data.length * 2);
        
    }
    
    @Override
    public Object[] findAll(){
        
        this.newData = new String[this.size];
        
        System.arraycopy(this.data, 0, this.newData, 0, this.size);
        
        return this.newData;
        
    }
}
