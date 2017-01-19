import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
    	String string = args[0];//input of string

    	char[] wholeString = string.toCharArray();
    	int half = wholeString.length / 2;

    	char[] leftHalfOfString = new char[half];//array for left half of string
    	char[] rightHalfOfString = new char[half];//array for right half of string

    	

    	for(int i = 0; i < half; i++){//intializing the array for left half

    		leftHalfOfString[i] = wholeString[i];
    		

    	}


    	int k = 0;//variable for counter
    	

    	for(int i = half; i < wholeString.length; i++){//initializing the array for right half

    		rightHalfOfString[k] = wholeString[i];
    		
    		k++;//counting the capacity of array

    	}

    	

    	

    	

    	int k1 = 0;//variable for anpther counter
    	
    	int i = 0;
    	int i1 = half;

    	
    	while(i < half){
    		if(leftHalfOfString[i] == rightHalfOfString[i1-1]){

    			k1++;

    		}

    		i++;
    		i1--;

    	}


    	if(k == k1){

    		System.out.println("String is Palindrome");

    	}else{

    		System.out.println("String is not Palindrome");
    		
    	}
    }
}