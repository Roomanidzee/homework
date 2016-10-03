import java.util.Random;

public class ArraySortBubble {
    public static void main(String[] args){
    	Random r = new Random();// random initialization

    	int n = 10;//size of array
    	int[] array = new int[n];
    	int temp;//temp variable for sorting

    	for(int i = 0; i < n; i++){

    		array[i] = r.nextInt(100);//filling of array

    		System.out.print(array[i] + " ");

    	}

    	System.out.println();

    	boolean swap = true;

    	while(swap){
    		swap = false;

    		for(int i = 0; i < n - 1; i++){

    			if(array[i] < array[i+1]){

    				temp = array[i];
    				array[i] = array[i+1];
    				array[i+1] = temp;
    				swap = true;
    				
    			}

    		}

    	}

    	for(int i = 0; i < n; i++){

    		System.out.print(array[i] + " ");

    	}

    	System.out.println();
    }
}
