package runnables;

import interfaces.CalcInterface;
import java.util.Random;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CalcRunnable implements Runnable, CalcInterface{
    
    private volatile double total;
    private volatile int order = 1;
    
    public synchronized double getTotal(){
        
        return this.total;
        
    }
    
    public synchronized void setTotal(double newTotal){
        
        this.total = newTotal;
        
    }
    
    public synchronized int getOrder(){
        
        return this.order;
        
    }
    
    public synchronized void setOrder(int newOrder){
        
        this.order = newOrder;
        
    }
    
    @Override
    public void run() {
        
        int orderNumber = getOrder();
        
        double result = getTotal();
        
        System.out.println("Работает поток №" + orderNumber + ": ");
        
        System.out.println();
        
        System.out.println("Текущий итог: " + result);
        
        System.out.println();
        
        Random r = new Random();
        
        double temp = r.nextDouble();       
        
        temp = Math.rint(100.0 * temp) / 100.0;
        
        double coef1 = temp * r.nextInt(10);
        
        coef1 = Math.rint(100.0 * coef1) / 100.0;
        
        result = addNewCost(result, coef1);       
        
        System.out.println("Прибавлено значение: " + coef1);
        
        System.out.println();
        
        temp = r.nextDouble();
        
        temp = Math.rint(100.0 * temp) / 100.0;        
        
        double coef2 = temp * r.nextInt(10);
        
        coef2 = Math.rint(100.0 * coef2) / 100.0;
        
        result = subtractNewCost(result, coef2);
        
        System.out.println("Отнято значение: " + coef2);
        
        System.out.println();
        
        result = Math.rint(100.0 * result) / 100.0;
        
        setTotal(result);
        
        orderNumber++;
        
        setOrder(orderNumber);
        
    }

    @Override
    public double addNewCost(double previousResult, double difference) {
        
        double newResult = previousResult + difference;
        
        return newResult;
        
    }

    @Override
    public double subtractNewCost(double previousResult, double difference) {
        
        double result = previousResult - difference;
        
        return result;
        
    }
    
}
