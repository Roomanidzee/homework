import java.util.Random;

public class TwoArrays {
    public static void main(String[] args){
    	Random r = new Random();//initialization

    	int n = 10;
    	int[] a = new int[n];
    	int[] b = new int[n];

    	for(int i = 0; i < n; i++){

    		a[i] = r.nextInt(10);//filling of arrays
    		b[i] = r.nextInt(10);

    	}

    	System.out.print("First array: ");
    	for(int i = 0; i < n; i++){

    		System.out.print(a[i] + " ");

    	}
    	System.out.println();

    	System.out.print("Second array: ");
    	for(int i = 0; i < n; i++){

    		System.out.print(b[i] + " ");

    	}

    	System.out.println();

    	boolean flag = false;

    	for(int i = 0; i < n && !flag; i++){

    		if(b[i] == a[i]){

    			System.out.println("Index: " + i);
    			flag = true;
    			System.exit(1);

    		}

    	}

    	System.out.println("No such Index");

    	System.out.println();
    }
}
