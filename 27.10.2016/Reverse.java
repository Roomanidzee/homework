import java.util.Random; // all imports, what I need
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

    private static String myRealizationOfReverse(Integer[] array, int size){// function of my realization of Reverse

        Integer[] array1 = new Integer[size];//creating an array of integer

        for(int i = 0; i < size; i++){

            array1[i] = array[size - i - 1];
            

        }

        return Arrays.toString(array1);

    }

    private static String javaRealizationOfReverse(Integer[] array){// function of java realization of reverse

        List list = Arrays.asList(array);// creating a List for array
        Collections.reverse(list);
        Integer[] arrayReversed = new Integer[list.size()];// creating an array for coping

        for(Integer i = 0; i < list.size(); i++){

            arrayReversed[i] = (Integer)list.get(i);//filling this array

        }

        return Arrays.toString(arrayReversed);

    }

     public static void main(String[] args){

    	Random r = new Random();//random initialization

    	Integer size = r.nextInt(100);

    	Integer[] array = new Integer[size];
    

    	for(int i = 0; i < size; i++){

    		array[i] = r.nextInt(100);//filling of array

    	}

        System.out.println();


    	System.out.println("Original array: ");

    	System.out.println(Arrays.toString(array));

    	System.out.println();

        System.out.print("Reversed original array (my realization): ");

        System.out.println();

        System.out.println(myRealizationOfReverse(array, size));

        System.out.println();

        System.out.println("Reversed original array (java realization): ");

        System.out.println(javaRealizationOfReverse(array));

        System.out.println();

    }
}
