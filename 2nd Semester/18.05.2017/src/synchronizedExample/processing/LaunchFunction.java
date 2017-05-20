package synchronizedExample.processing;

import synchronizedExample.runnables.CalcRunnable;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    public static void launch(){
        
        CalcRunnable calcRun = new CalcRunnable();
        
        Thread t1 = new Thread(calcRun);
        Thread t2 = new Thread(calcRun);
        Thread t3 = new Thread(calcRun);
        Thread t4 = new Thread(calcRun);
        Thread t5 = new Thread(calcRun);
        
        try {
            
            t1.start();
            Thread.sleep(1000);
            
            t2.start();
            Thread.sleep(1000);
            
            t3.start();
            Thread.sleep(1000);
            
            t4.start();
            Thread.sleep(1000);
            
            t5.start();
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            
            System.err.println("Поток ожидания был прерван");
            
        }
        
    }
    
}
