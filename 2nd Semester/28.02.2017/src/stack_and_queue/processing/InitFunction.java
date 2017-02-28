package stack_and_queue.processing;

/**
 *
 * @author Андрей Романов
 */
public class InitFunction {
    
    public static void init(){
        
        StackRealizer<Integer> sr = new StackRealizer<>();
        QueueRealizer<Integer> qr = new QueueRealizer<>();
        
        for(int i = 0; i < 25; i+=5){
            
            sr.add(i);
            
        }
        
        System.out.println("Stack size: " + sr.size());
        System.out.println("Pop element: " + sr.pop());
        System.out.println("Peek element: " + sr.peek());
        System.out.println("Stack size: " + sr.size());
        
        System.out.println();
        
        for(int i = 0; i < 40; i+=10){
            
            qr.add(i);
            
        }
        
        System.out.println("Queue size: " + qr.size());
        System.out.println("Pop element: " + qr.pop());
        System.out.println("Peek element: " + qr.peek());
        System.out.println("Queue size: " + qr.size());
        
    }
    
}
