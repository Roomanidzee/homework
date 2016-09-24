

public class Pyramid {
    public static void main(String[] args){
       try{ //check if user wrote whole number
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
    }catch(NumberFormatException e){

        System.out.println("Please, enter the whole number");

    }
  }
 }