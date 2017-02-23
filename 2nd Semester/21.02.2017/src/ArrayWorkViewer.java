import parameter_endless_array.ParameterEndlessArray;
import utils.ArrayUtils;
import java.util.Random;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ArrayWorkViewer {
    
    public static void main(String[] args){
        
        ParameterEndlessArray<Integer> array = new ParameterEndlessArray<>();
        Random r = new Random();
        
        final int LIMIT = 20;
        final int NUMBER = r.nextInt(LIMIT);
        
        System.out.print("Исходный массив: ");
        
        for(int i = 0; i < 20; i++){
            
            array.add(r.nextInt(LIMIT));
            System.out.print(array.get(i) + " ");
            
        }
        System.out.println();
        
        System.out.println("Элемент с индексом 7 : " + array.get(7));
        
        System.out.println();
        
        System.out.println("Заполним массив случайным числом ");
        
        ArrayUtils.fill(array, NUMBER);
        
        System.out.print("Измененный массив: ");
        
        for(int i = 0; i < array.size(); i++){
            
            System.out.print(array.get(i) + " ");
            
        }
        System.out.println();
    }
    
}
