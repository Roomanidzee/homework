package notifyExample.processing;

import notifyExample.runnables.BankRunnable;
import notifyExample.runnables.ClientRunnable;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    public static void launch(){
        
        Bank bank = new Bank(500);
        
        BankRunnable bankRun = new BankRunnable(bank);
        ClientRunnable clientRun = new ClientRunnable(bank);
        
        Thread t1 = new Thread(bankRun);
        Thread t2 = new Thread(clientRun);
        
        try{
            
            t1.start();
            
            Thread.sleep(1000);
            
            t2.start();
            
        }catch(InterruptedException e){
            
            System.err.println("Поток выполнения был прерван");
            
        }
        
    }
    
}
