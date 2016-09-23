

public class LeastCommonMultiply {
 public static void main(String[] args){
    int a = Integer.parseInt(args[0]); // numbers a and b
    int b = Integer.parseInt(args[1]);

    int fold1; // first fold
    int fold2; // second fold
    int x = 1; // constant ratio
    int k = 1; // changeble ratio

    while(true){

    	fold1 = x * a * k; // multiply the folds for iteration
    	fold2 = x * b * k;
    	k++;

    	if((fold1 - a) == fold2||fold1 == (fold2 - b)){

    		System.out.println("Least Common Multiply: " + fold1);
    		break;

        }

        if( k > 8 ){// there are 8 tries to find the least common multiply
            System.out.println("No such number");
        }
    }
  }
}