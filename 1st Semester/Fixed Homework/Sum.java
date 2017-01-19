

public class Sum {
    public static void main(String[] args){
    	int n = Integer.parseInt(args[0]); //entering the limit of sequence

    	double s = 0.5;
        double k = 2;

    	double fact1 = 2;//numerator
    	double fact2 = 2;//denomerator

    	for(int i = 2; i <= n; i++){
    		fact1 *= (i - 1);
    		fact2 *= (i * k)*(i * k +1);
            k++;

    		s += fact1 * fact1/fact2;
    	}
    	System.out.println("Amount = " + s);
    }
}
