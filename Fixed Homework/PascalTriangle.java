

public class PascalTriangle {
    public static void main(String[] args){

    	int number;//variable for first number
    	int n = Integer.parseInt(args[0]);// number of rows

    	for(int i = 0; i < n; i++){

    		number = 1;
    		System.out.format("%" + (n-i)*2 + "s", "");//output of triangle(space)

    		for(int j = 0; j <= i; j++){

    			System.out.printf("%4d", number);//output of triangle(numbers)
    			number = number * (i - j)/(j + 1);
    			
    		}

    		System.out.println("");
    	}
    }
}
