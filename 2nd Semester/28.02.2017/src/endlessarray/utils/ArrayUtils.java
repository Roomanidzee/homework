package endlessarray.utils;

import endlessarray.parameter_endless_array.ParameterEndlessArray;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ArrayUtils {
    
    public static <T> void showArray(ParameterEndlessArray<T> array){
        //Выводит массив, полученный из коллекции
        for(int i = 0; i < array.size(); i++){
            
            System.out.print(array.get(i) + " ");
            
        }
        
    }
    
    public static <T> void fill(ParameterEndlessArray<T> array, T value){
        
        for(int i = 0; i < array.size(); i++){
            
            array.set(i, value);//заполняем массив определенным значением
            
        }
        
    }
    
    public static <T> ParameterEndlessArray<T> merge(ParameterEndlessArray<T> array1,
            ParameterEndlessArray<T> array2)
    {
        
        //соединяет 2 массива в 1
        
        ParameterEndlessArray<T> array3 = new ParameterEndlessArray<>();
        
        
        for(int i = 0; i < array1.size(); i++){
            
            array3.add(array1.get(i));
            
        }
        
        for(int j = 0; j < array2.size(); j++){
            
            array3.add(array2.get(j));
            
            
        }
        
        return array3;
    }
    
    public static <T> void reverse(ParameterEndlessArray<T> array){
        //переворачивает массив        
        for(int i = 0; i < array.size()/2; i++){
            
            array.set(i, array.get(array.size() - i - 1));
            
        }       
        
    }
}
