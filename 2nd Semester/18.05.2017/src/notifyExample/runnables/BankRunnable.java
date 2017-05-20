package notifyExample.runnables;

import notifyExample.processing.Bank;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class BankRunnable implements Runnable{
    
    private final Bank bank;
    
    public BankRunnable(Bank bankTitle){
        
        this.bank = bankTitle;
        
    }
    
    @Override
    public void run() {
        
        while(true){          
            
            synchronized(this.bank){
              
              if(this.bank.getCapacity() != this.bank.getMoneyLimit()){  
                
                while(!bank.isPerformed()){
                    
                    try{
                        
                        this.bank.wait();
                        this.bank.addMoney();
                        
                    }catch(InterruptedException e){
                        
                        System.err.println("Поток ожидания был прерван");
                        
                    }
                    
                }
                
                this.bank.produce();
                this.bank.notify();
                
            }else{
                  
                System.out.println("Процесс транзакций завершен");
                break;
                  
            }            
         }
      } 
   }    
}
