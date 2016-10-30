
public class Dividers {
    public static void main(String[] args){
       try{	//check if user wrote a whole number
    	int number = Integer.parseInt(args[0]); // enter the number

        if(number < 0){

            number = number / (-1);

        }

    	for(int i = 1; i <= number / 2; i++){

    		if((number % i) == 0){ //if it divides without a rest, show it

    			System.out.print(i + " ");

    		}
    	}

    	System.out.println();
    }catch(NumberFormatException e){

    	System.out.println("Please, enter the whole number");

    }
  }
}