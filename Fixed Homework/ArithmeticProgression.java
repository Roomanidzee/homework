

public class ArithmeticProgression {
    public static void main(String[] args){
    	double a1 = Double.parseDouble(args[0]);// first number of progression
    	double a2 = Double.parseDouble(args[1]);// second number of progression
    	double k = Double.parseDouble(args[2]);// index

    	double d = a2 - a1;
        double count = 2;

    	double Ak = 0;
        if(k == 0){

            System.out.println("a[k] = " + a1);
            System.exit(0);

        }

        if(k == 1){

            System.out.println("a[k] = " + a2);
            System.exit(0);

        }

    	for(int i = 2; i < k; i++){

    		Ak += a1 + d * count;
                count++;

    	}
    	System.out.println("a[k] = " + Ak);

    }
}
