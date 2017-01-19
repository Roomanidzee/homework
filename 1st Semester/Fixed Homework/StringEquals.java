

public class StringEquals {
    public static void main(String[] args){
    	String str1 = args[0];//input of strings
    	String str2 = args[1];

    	char[] chars1 = str1.toCharArray();//sending strings to arrays
    	char[] chars2 = str2.toCharArray();

    	if(chars1.length != chars2.length){

    		System.out.println("Please, enter the strings of equal length");
    		System.exit(1);

    	}

    	double n = chars1.length;//making the limit of loop
    	int i = 0;
    	int k = 0;
        int k1 = 0;

    	while( i < n){

    	    if( chars1[i] > chars2[i]){

    		k++;

    	    }

            if( chars1[i] < chars2[i]){

                k1++;

            }

    		i++;
    	}

    	if(k > k1){

            System.out.println("First string is bigger, than second string");

        }

        if(k < k1){

            System.out.println("Second string is bigger, than first string");

        }

        if(k == k1){

            System.out.println("Strings are equal");

        }
    	
    }
}
