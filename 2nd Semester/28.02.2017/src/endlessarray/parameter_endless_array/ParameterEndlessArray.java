package endlessarray.parameter_endless_array;

import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 *  
 */
public class ParameterEndlessArray<T> {  
    
    private T[] valueArray;//массив для хранения данных
    private int size = 0;//счетчик для размера массива
    
    
    public ParameterEndlessArray(){
        
        this.valueArray = (T[]) new Object[20]; // приведение массива к типу Т
        
    }
    
    public void add(T obj){
        
        if(this.valueArray.length - this.size <= 10){
            
            increaseArraySize();//если разность длины массива и счетчика больше 10,
                                //увеличиваем длину массива в 2 раза
            
        }
        
        this.valueArray[this.size] = obj;
        this.size++;
    }
    
     private void increaseArraySize(){
        
        this.valueArray = Arrays.copyOf(this.valueArray, this.valueArray.length * 2);
        
    }
     
    public T get(int index){
        
        if(index > this.size){
            
            throw new NullPointerException("No such element");
            
        }
        
        return (T) this.valueArray[index];
        
    }
    
    public void set(int index, T value){
        
        if(index > this.size){
            
            throw new ArrayIndexOutOfBoundsException("No such index");
            
        }
        
        this.valueArray[index] = value;//присваиваем определенному индексу 
                                       //определенное значение
        
    }
    
    public int size(){
        
        return this.size;//возвращает фактический размер массива
        
    }
}
