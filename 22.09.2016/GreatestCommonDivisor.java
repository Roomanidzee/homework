

public class GreatestCommonDivisor {
    public static void main(String[] args){
    	int a = Integer.parseInt(args[0]);  //numbers a and b
    	int b = Integer.parseInt(args[1]);

    	int a1 = a; //re-assignment for another method
    	int b1 = b;

    	int x; // temp variable
    	long calc1,calc2; //variables for calculation of time

    	long start1, finish1, start2, finish2; // variables for countdown of time

    	start1 = System.nanoTime();
    	while(a != b){
    		if(a > b){

    			a = a - b;

    		}else{

    			b = b - a;

    		}
    	}
    	finish1 = System.nanoTime();
    	calc1 = finish1 - start1;

    	System.out.println();

    	System.out.println("Greatest Common Divisor, founded by the method of Evklid:  " + a);
    	System.out.println("Time of evaluating: " + calc1 + " ns");
    	System.out.println();

    	start2 = System.nanoTime();
    	while (b1 != 0){

    		x = a1 % b1;
    		a1 = b1;
    		b1 = x;

    	}
    	finish2 = System.nanoTime();
    	calc2 = finish2 - start2;

    	System.out.println("Greatest Common Divisor, founded by the method of enumeration of rests :  " + a1);
    	System.out.println("Time of evaluating: " + calc2 + " ns");
    	System.out.println();

    	if(calc2 > calc1){
    		System.out.println("Difference of Time: " + (calc2 - calc1) + " ns");
    	}

    	if(calc1 > calc2){
    		System.out.println("Difference of Time: " + (calc1 - calc2) + " ns");
    	}

    	

    }
}
