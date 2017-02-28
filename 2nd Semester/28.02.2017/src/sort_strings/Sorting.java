package sort_strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Sorting {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите количество строк: ");
        
        String n = sc.nextLine();
        
        String[] strings = new String[Integer.parseInt(n)];
        
        
        for(int i = 0; i < strings.length; i++){
            
            strings[i] = sc.nextLine();
              
        }
        
        System.out.println("Исходный массив: " + Arrays.toString(strings));
        
        Arrays.parallelSort(strings);
        
        System.out.println("Отсортированный массив: " + Arrays.toString(strings));
        
    }
    
}
