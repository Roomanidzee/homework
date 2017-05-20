package notifyExample.processing;

import notifyExample.interfaces.BankInterface;
import notifyExample.interfaces.StateInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Bank implements BankInterface, StateInterface{
    
    private final double ADD_LIMIT = 1000;
    private final double GET_LIMIT = 100;
    
    private final double MONEY_LIMIT = 500000.0;
    
    private boolean status = false;
    
    private double capacity;
    
    public Bank(double bankCapacity){
        
        this.capacity = bankCapacity;
        
    }
    
    @Override
    public boolean isReady(){
        
        return this.status;
        
    }
    
    @Override
    public boolean isPerformed(){
        
        return !this.status;
        
    }
    
    @Override
    public void produce(){
        
        this.status = true;
        
    }
    
    @Override
    public void perform(){
        
        this.status = false;
        
    }
    
    public double getCapacity(){
        
        return this.capacity;
        
    }
    
    public double getMoneyLimit(){
        
        return this.MONEY_LIMIT;
        
    }
    
    public void setCapacity(double newCapacity){
        
        this.capacity = newCapacity;
        
    }
    
    @Override
    public void getMoney(){            
            
            this.capacity -= this.GET_LIMIT;
            
            System.out.println("Клиент забрал " + this.GET_LIMIT + " рублей.");
            
            System.out.println("Остаток на счёте: " + this.capacity);   
            
            System.out.println();
        
    }
    
    @Override
    public void addMoney(){       
            
            this.capacity += this.ADD_LIMIT;
        
            System.out.println("Банк добавил " + this.ADD_LIMIT + " рублей");
            
            System.out.println("Остаток на счёте: " + this.capacity);
            
            System.out.println();
        
    }
    
}
