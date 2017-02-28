package map_realizer.processing;

import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class InitFunction {
    
    public static void init(){
        
        MapRealizer<String, Integer> m = new MapRealizer<>();
        
        System.out.println("Added keys \"test\" , \"test1\" with values 1, 2 ");
        
        System.out.println();
        
        m.add("test", 1);
        
        m.add("test1", 2);
        
        System.out.println("Size: " + m.size());
        
        System.out.println("Keys: " + Arrays.toString(m.getKeys()));
        System.out.println("Values: " + Arrays.toString(m.getValues()));
        
        System.out.println();
        
        System.out.println("Removed key test1");
        
        System.out.println();
        
        m.remove("test1");
        
        System.out.println("Size: " + m.size());
        
        System.out.println("Keys: " + Arrays.toString(m.getKeys()));
        System.out.println("Values: " + Arrays.toString(m.getValues()));
        
        System.out.println();
        
        System.out.println("Value of element with key \"test\" : " + m.get("test"));
        
        System.out.println();
        
        System.out.println("Set to key \"test\" value 100500");
        
        System.out.println();
        
        m.set("test", 100500);
        
        System.out.println("Size: " + m.size());
        
        System.out.println("Keys: " + Arrays.toString(m.getKeys()));
        System.out.println("Values: " + Arrays.toString(m.getValues()));
        
        System.out.println();
        
        System.out.println("Removed all elements: ");
        
        m.removeAll();
        
        System.out.println();
        
        System.out.println("Size: " + m.size());
        
        System.out.println("Keys: " + Arrays.toString(m.getKeys()));
        System.out.println("Values: " + Arrays.toString(m.getValues()));
    }
    
}
