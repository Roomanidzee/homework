

public class TwoStrings {
    public static void main(String[] args){
    	String str1 = args[0];//input of strings
    	String str2 = args[1];

    	char[] chars1 = str1.toCharArray();//sending strings to arrays
    	char[] chars2 = str2.toCharArray();

    	System.out.println("First String: " + str1);
    	System.out.println("Second String: " + str2);
    	System.out.println();

    	

    	int n = chars1.length;//variable for limit of loop
    	

        int k = 0;
        int limit = 0;
        int size = 0;

        for(int i = 0; i < (n/2) + 1; i++){

            if(chars2[i] == chars1[i + 3]){

                k++;
                limit = i;
                i++;

                while( i < n){

                    if(chars2[i] == chars1[i]){

                        k++;


                    }else{

                        break;

                    }

                    i++;

                }               

            }

            size++;

        }

        if(k == (n - limit)){

            System.out.println("Second string included in first string");

        }else{

            System.out.println("Second string didn't include in first string");

        }



    	System.out.println();




    }
}
