import java.util.Arrays;//all imports, what I need
import java.util.Random;

public class SquaredArray {
    
    private static String makeSquareElements(long[] array, int size){//function for make square of elements

    	for(int i = 1; i < size; i++){

    		array[i] = array[i - 1] * array[i - 1];

    	}

    	return Arrays.toString(array);

    }

    public static void main(String[] args){

    	Random r = new Random();//initialization of random

    	int size = r.nextInt(25);//getting size

    	long[] array = new long[size];

    	array[0] = r.nextInt(10);

    	System.out.println("First element of array: "  + array[0]);

    	System.out.println("Squared Array: ");
    	System.out.println(makeSquareElements(array, size));
    	System.out.println();
    }
}
