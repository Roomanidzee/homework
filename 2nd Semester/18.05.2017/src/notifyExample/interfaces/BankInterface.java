package notifyExample.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface BankInterface {
    
    default void addMoney(){
        
        System.out.println("Not implemented yet");
        
    }
    
    
    default void getMoney(){
        
        System.out.println("Not implemented yet");
        
    }
    
}
