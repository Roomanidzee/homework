import java.util.Random;

public class TwoArrays {
    public static void main(String[] args){
    	Random r = new Random();//initialization

    	int n = 10;
    	int[] a = new int[n];
    	int[] b = new int[n/2];

    	for(int i = 0; i < n; i++){

    		a[i] = r.nextInt(10);//filling of arrays
    		

    	}

        for(int i = 0; i < n/2; i++){

            b[i] = r.nextInt(10);

        }

    	System.out.print("First array: ");
    	for(int i = 0; i < n; i++){

    		System.out.print(a[i] + " ");

    	}
    	System.out.println();

    	System.out.print("Second array: ");
    	for(int i = 0; i < n/2; i++){

    		System.out.print(b[i] + " ");

    	}

    	System.out.println();

    	
        int k = 0;
        int limit = 0;
        int size = 0;

    	for(int i = 0; i < n/2; i++){

    		if(b[i] == a[i]){

                k++;
                limit = i;
                i++;

                while( i < n){

                    if(b[i] == a[i]){

                        k++;


                    }else{

                        break;

                    }

                    i++;

                }    			

    		}

            size++;

    	}

    	if(k == (n - limit)){

            System.out.println("Second array included in first array");

        }else{

            System.out.println("Second array didn't include in first array");

        }

    	System.out.println();
    }
}
