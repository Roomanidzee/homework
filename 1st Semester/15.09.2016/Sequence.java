

public class Sequence {
    public static void main(String[] args){
    	int n = Integer.parseInt(args[0]);

    	double s = 0; // переменнная суммы
    	double k = 3;
    	double p = 5;
    	

    	for(int i = 1; i < n; i++){

    		
    	    if( (i % 2) == 0){

    	    	s += 1/(p*p);
    	    	p += 4;

    	    }
    	    else{

    	    	s += -1/(k*k);
    	    	k += 4;
    	    	
    	    }    			  		
    		
    	}
    	System.out.println("Amount : " + s);
    }
}
