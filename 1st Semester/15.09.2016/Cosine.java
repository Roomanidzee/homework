

public class Cosine {
    public static void main(String[] args){
    	int n = Integer.parseInt(args[0]);

    	double s = 0;// переменная суммы
    	double x = 30;// значение угла

    	for(int i = 0; i < n; i++){

    		s += Math.cos(s + x);

    	}

    	System.out.println("Amount : " + s);
    }
}
