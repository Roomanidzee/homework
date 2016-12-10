package calculate;

/**
 *
 * @author Андрей
 */
public class Calculations {
    
    protected float calculateRectangle(float a, float b, int N, SinFunc f1){
        
        float dx = (b - a)/N;//calculating dx
        float s = 0;
        
        for(float i = a; i <= b; i+=dx){//calculating integral
            
            s += f1.func(dx);
            
        }
        
        return s;
        
    }
    
    protected float calculateTrapeze(float a, float b, int N, SinFunc f1){
        
       float dx = (b - a)/N;//calculating dx
       float s = 0;
       
       
       for(float i = a; i <= b; i+=dx){
            
            
            s += ((f1.func(dx) + f1.func(2*dx))*dx /2); //calculating integral
            
        } 
       
       return s;
        
        
    }
    
   protected float calculateSimpson(float a, float b, int N, SinFunc f1){
        
       float dx = (b - a)/N;//calculating dx and difference between dx
       float h = (b - a)/(2*N);
       float s1 = 0;
       float s2 = 0;
       
       for(float i = 1; i < N; i+=dx) {
           
           float calc = i % 2;//calculating integral
           
           if(calc != 0){
               
               s1 += f1.func(dx);
               
           }
           
       } 
       
       for(float i = 1; i < N - 1; i+=dx){
           
           float calc = i % 2;
           
           if(calc == 0){
               
               s2 += f1.func(dx);//calculating integral
               
           }
           
       }
       
       return h * (a + 4 * s1 + s2 + b)/3;
        
    }
   
   protected float exactness(float a, float b, int N, SinFunc f1){
       
       float dx = (b - a)/N;//calculating exactness for function
       float calc = (float) Math.pow((b-a), 5) * (float) Math.pow(f1.func(dx),4); 
       
       return calc/2880;
       
   }
    
}
