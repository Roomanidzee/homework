import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
    	String string = args[0];//input of string

    	char[] wholeString = string.toCharArray();
    	int half = wholeString.length / 2;

    	int k = 0;//variable for counter
    	
        for(int i = 0; i < half; i++){

            if(wholeString[i] == wholeString[wholeString.length - i - 1]){

                k++;

            }

        }   	
    	

    	
    	


    	if(k == half){

    		System.out.println("String is Palindrome");

    	}else{

    		System.out.println("String is not Palindrome");
    		
    	}
    }
}