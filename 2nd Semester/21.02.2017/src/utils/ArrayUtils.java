package utils;

import parameter_endless_array.ParameterEndlessArray;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ArrayUtils {
    
    public static <T> void fill(ParameterEndlessArray<T> array, T value){
        
        for(int i = 0; i < array.size(); i++){
            
            array.set(i, value);//заполняем массив определенным значением
            
        }
        
    }
    
}
