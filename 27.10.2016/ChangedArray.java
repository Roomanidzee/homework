import java.util.Arrays;// all imports,what I need
import java.util.Random;

public class ChangedArray {

	private static String changingOfArray(long[] array, int size){// function for changing of array

		for(int i = 2; i < size; i++){

			array[i] = array[i-1] * array[i-2];// change of elements of array

		}

		return Arrays.toString(array);

	}

	public static void main(String[] args){

		Random r = new Random();//random initialization

		int size = r.nextInt(25);//getting size

		long[] array = new long[size];//initialization of array

		for(int i = 0; i < size; i++){

			array[i] = r.nextInt(50);

		}

		System.out.println("Original array: ");

		System.out.println(Arrays.toString(array));

		System.out.println();

		System.out.println("Changed array: ");

		System.out.println(changingOfArray(array, size));

		System.out.println();

	}  
}
