

public class Sum {
    public static void main(String[] args){
    	int n = Integer.parseInt(args[0]); //entering the limit of sequence

    	double s = 0;

    	double fact1 = 1;//numerator
    	double fact2 = 1;//denomerator

    	for(int i = 2; i < n; i++){
    		fact1 *= (i - 1);
    		fact2 *= 2*i;

    		s += fact1 * fact1/fact2;
    	}
    	System.out.println("Amount = " + s);
    }
}
