package launcher;

import collection_implementation.MyCollection;
import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyCollectionViewer {
    
    public static void main(String[] args){
        
        MyCollection<Integer> collec1 = new MyCollection<>();
        MyCollection<Integer> collec2 = new MyCollection<>();
        
        Object[] array1;
        Object[] array2;
        
        for(int i = 0; i < 40; i++){
            
            collec1.add(i + 10);
            collec2.add(i + 50);
            
        }
        
        array1 =  collec1.toArray();
        array2 =  collec2.toArray();
        
        System.out.println("Оригинальная коллекция №1 : " + Arrays.toString(array1));
        System.out.println("Оригинальная коллекция №2 : " + Arrays.toString(array2));
        
        System.out.println();
        
        System.out.println("Заполняем коллекцию 1 элементами из коллекции 2");
        System.out.println();
        
        collec1.addAll(collec2);
        
        System.out.println("В коллекции 1 есть коллекция 2? " + collec1.containsAll(collec2));
        System.out.println();
        
        array1 =  collec1.toArray();
        
        System.out.println("Измененная коллекция №1 : " + Arrays.toString(array1));
        System.out.println();
        
        collec2.clear();
        
        array2 =  collec2.toArray();
        
        System.out.println("Очищенная коллекция №2 : " + Arrays.toString(array2));
        System.out.println();
        
        System.out.println("Есть ли в коллекции 1 число 0 ? " + collec1.contains(0));
        System.out.println();
        
        
        System.out.println("Hashcode коллекции №1: " + collec1.hashCode());
        System.out.println();
        
        System.out.println("Коллекция 1 равна коллекции 2? " + collec1.equals(collec2));
        System.out.println();
        
        System.out.println("Очищена коллекция 2? " + collec2.isEmpty());
        System.out.println();
        
       
        
        
    }
    
}


