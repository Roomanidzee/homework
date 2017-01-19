

public class Factorial {
    public static void main(String[] args){
    	int n = Integer.parseInt(args[0]);// entering the number of factorial

    	if( n == 0){
    		System.out.println("1");
    	}

    	int fact = 1;

    	for(int i = 1; i < n; i++){

    		fact *= i;

    	}
    	System.out.println("Factorial is " + fact);
    }
}
