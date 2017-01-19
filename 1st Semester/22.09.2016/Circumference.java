

public class Circumference {
    public static void main(String[] args){
       try{ //check if user wrote a number
    	double n = Double.parseDouble(args[0]);// radius of circle
    	double half1;// right half of the circle
    	double half2;// left halfof the circle


    	for(int i = 1; i <= 2 * n; i++){

    	  for(int j = 1; j <= 2 * n; j++){

    	  	half1 = n + Math.sqrt(n * n - (n - j) * (n - j));
    	  	half2 = n - Math.sqrt(n * n - (n - j) * (n - j));

    	  	if(i > half2 && i < half1){

    	  		System.out.print("**");

    	  	}else{

    	  		System.out.print("  ");

    	  	}

    	  }

    	  System.out.println();

       }

    }catch(NumberFormatException e){

        System.out.println("Please, enter the number");

    }
  }
}