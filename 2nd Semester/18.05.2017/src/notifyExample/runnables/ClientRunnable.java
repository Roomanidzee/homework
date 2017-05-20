package notifyExample.runnables;

import notifyExample.processing.Bank;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ClientRunnable implements Runnable{

    private final Bank bank;
    
    public ClientRunnable(Bank clientBank){
        
        this.bank = clientBank;
        
    }
    
    @Override
    public void run() {
        
        while(true){           
            
          synchronized(this.bank){
                
              if(this.bank.getCapacity() != this.bank.getMoneyLimit()){  
                
                while(!bank.isReady()){
                    
                    try{
                        
                        this.bank.wait();
                        this.bank.getMoney();
                        
                    }catch(InterruptedException e){
                        
                        System.err.println("Поток ожидания был прерван");
                        
                    }
                    
                }
                
                this.bank.perform();
                this.bank.notify();
                
            }else{
                  
                System.out.println("Процесс транзакций завершен");
                break;
                  
            }
            
          }
       } 
    }    
}
