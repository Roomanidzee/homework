package stack_and_queue.processing;

import stack_and_queue.interfaces.SequenceInterface;
import java.util.Arrays;

/**
 *
 * @author Андрей Романов
 */
public class StackRealizer<T> implements SequenceInterface<T>{
    
    private T[] objArray;
    private int size = 0;
    private T variable;
    
    public StackRealizer(){
        
        this.objArray = (T[]) new Object[20];
        
    }
    
    @Override
    public void add(T object){
        
        if(this.objArray.length - this.size <= 10){
            
            increaseArraySize();
            
        }
        
        this.objArray[this.size] = object;
        this.size++;
        
    }
    
    public void increaseArraySize(){
        
        this.objArray = Arrays.copyOf(this.objArray, this.objArray.length * 2);
        
    }
    
    public boolean isEmpty(){
        
        return this.size == 0;
        
    }
    
    @Override
    public int size(){
        
        return this.size;
        
    }
    
    @Override
    public T pop(){
        
        if(!isEmpty()){
            
            this.variable = this.objArray[this.size - 1];
            this.objArray[this.size - 1] = null;
            this.size--;
            return this.variable;
        
        }else{
            
           throw new NullPointerException("There are no elements in Stack");
           
        }
        
    }
    
    @Override
    public T peek(){
        
        if(!isEmpty()){
            
            return this.objArray[this.size - 1];
            
        }else{
            
           throw new NullPointerException("There are no elements in Stack");
           
        }
        
        
    }
}
