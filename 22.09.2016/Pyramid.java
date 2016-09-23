

public class Pyramid {
    public static void main(String[] args){
    	int limit = Integer.parseInt(args[0]); // variable for the count of rows

    	for(int i = 1; i <= limit; i++){

    		for(int j = 1; j <= limit - i; j++){
    			System.out.print(" ");
    		}

    		for(int j = 1; j <= 2 * i - 1; j++){
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
