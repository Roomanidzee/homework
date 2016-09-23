
public class Dividers {
    public static void main(String[] args){
    	int number = Integer.parseInt(args[0]); // enter the number

    	for(int i = 1; i < number + 1; i++){

    		if((number % i) == 0){ //if it divides without a rest, show it

    			System.out.print(i + " ");

    		}
    	}

    	System.out.println();
    }
}
