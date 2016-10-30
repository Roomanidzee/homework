

public class Divide {
    public static void main(String[] args){
    	int number = Integer.parseInt(args[0]);// entering the number

    	int k = 0;//first coefficient
    	String binary = "";// variable for binary form
        int x;

        while(number != 0){

            x = number % 2;

            if( x == 1){

                k++;

            }

            binary = x + binary;
            number = number / 2;
        }
    	

    	System.out.println("Number of 1: " + k);
    	System.out.println("Number : " + binary);
    }
}
