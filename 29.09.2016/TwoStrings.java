

public class TwoStrings {
    public static void main(String[] args){
    	String str1 = args[0];//input of strings
    	String str2 = args[1];

    	char[] chars1 = str1.toCharArray();//sending strings to arrays
    	char[] chars2 = str2.toCharArray();

    	System.out.println("First String: " + str1);
    	System.out.println("Second String: " + str2);
    	System.out.println();

    	if(chars1.length != chars2.length){

    		System.out.println("Please, enter the strings of equal length");
    		System.exit(1);

    	}

    	int n = chars1.length;//variable for limit of loop
    	boolean flag = false;

    	for(int i = 0; i < n && !flag; i++){

    		if(chars1[i] == chars2[i]){

    			System.out.println("Index: " + i);
    			flag = true;

    		}

    	}



    	System.out.println();




    }
}
