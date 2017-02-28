package endlessarray;

import endlessarray.parameter_endless_array.ParameterEndlessArray;
import endlessarray.utils.ArrayUtils;

import java.util.Random;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ArrayWorkViewer {
    
    public static void main(String[] args){
        
        ParameterEndlessArray<Integer> array = new ParameterEndlessArray<>();
        ParameterEndlessArray<Integer> array1 = new ParameterEndlessArray<>();
        Random r = new Random();
        
        final int LIMIT = 20;
        final int NUMBER = r.nextInt(LIMIT);  
        final int NUMBER_1 = r.nextInt(LIMIT);
        
        for(int i = 0; i < LIMIT; i++){
            
            array.add(r.nextInt(LIMIT));
            array1.add(r.nextInt(LIMIT));
            
        }
        
        System.out.print("Оригинальный массив №1 : ");
        
        ArrayUtils.showArray(array);
        
        System.out.println();
        
        System.out.print("Оригинальный массив №2 : "); 
        
        ArrayUtils.showArray(array1);
        
        System.out.println();
        System.out.println();
                
        System.out.println("Элемент массива №1 с индексом 7 : " + array.get(7));
        System.out.println("Элемент массива №2 с индексом 7 : " + array1.get(7));
        
        System.out.println();
        
        System.out.println("Соединим массивы №1 и №2");
        
        System.out.print("Массив № 3 : ");
        
        ArrayUtils.showArray(ArrayUtils.merge(array, array1));
        
        System.out.println();
        System.out.println();
        
        System.out.println("Перевернем массивы №1 и №2");
        
        ArrayUtils.reverse(array);
        ArrayUtils.reverse(array1);
        
        System.out.print("Изменённый массив №1 : ");
        
        ArrayUtils.showArray(array);
        
        System.out.println();
        
        System.out.print("Изменённый массив №2 : "); 
        
        ArrayUtils.showArray(array1);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Заполним массив №1 и №2 случайным числом ");
        
        ArrayUtils.fill(array, NUMBER);
        ArrayUtils.fill(array1, NUMBER_1);
        
        System.out.print("Изменённый массив №1 : ");
        
        ArrayUtils.showArray(array);
        
        System.out.println();
        
        System.out.print("Изменённый массив №2 : "); 
        
        ArrayUtils.showArray(array1);
        
        System.out.println();
    }
    
}
