

public class Circumference {
    public static void main(String[] args){
    	double r;// radius of circle
    	double half1;// right half of the circle
    	double half2;// left halfof the circle

    	r = 5;

    	for(int i = 1; i <= 2 * r; i++){

    	  for(int j = 1; j <= 2*r; j++){

    	  	half1 = r + Math.sqrt(r * r - (r - j) * (r - j));
    	  	half2 = r - Math.sqrt(r * r - (r - j) * (r - j));

    	  	if(i > half2 && i < half1){

    	  		System.out.print("**");

    	  	}else{

    	  		System.out.print("  ");

    	  	}

    	  }

    	  System.out.println();

       }

    }
}
