

public class MaxZero {
    public static void main(String[] args){
    	int number = Integer.parseInt(args[0]);// entering the number for calculating

    	int k = 0;
    	int binary = 1;// variable for binary form
    	int x;// temp variable

    	while(number > 0){
    		x = number % 2;

    		if(x == 0){
    			k++;
    		}

    		number = number / 2;
    	}
    	System.out.println("Count of zeros : " + k);
    }
}
