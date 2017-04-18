package classes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class SerializableClass implements Serializable{

    private static final long serialVersionUID = 1527L;
    
    private int[] dataArray = new int[10];
    
    public void fillAndShowArray(){
        
        Random r = new Random();
        
        for(int i = 0; i < this.dataArray.length; i++){
            
            this.dataArray[i] = r.nextInt(10);
            
        }
        
        System.out.println("Сгенерированный массив со случайными числами: " + Arrays.toString(this.dataArray));
        
    } 
    
}
