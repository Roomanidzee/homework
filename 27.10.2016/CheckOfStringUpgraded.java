import java.util.Scanner;//all imports, what I need
import java.util.Arrays;

public class CheckOfStringUpgraded {
    
    private static void checkString(String str){//function for checking of string

		char[] checkableString = str.toCharArray();// making an array of symbols from string

		int size = checkableString.length;// size of this array

		int left = 0;// variables for counting of brackets
		int right = 0;
		int left1 = 0;
		int right1 = 0;
		int left2 = 0;
		int right2 = 0;

		for(int i = 0; i < size; i++){

			if(checkableString[i] == '('){

				left++;

			}

			if(checkableString[i] == ')'){

				right++;

			}

			if(checkableString[i] == '{'){

				left1++;

			}

			if(checkableString[i] == '}'){

				right1++;

			}

			if(checkableString[i] == '['){

				left2++;

			}

			if(checkableString[i] == ']'){

				right2++;

			}
		}
		int k = 0;//variable for index of symbol
		int count = 0;

		if(left == right && left1 == right1 && left2 == right2){

			System.out.println("Number of brackets is equal, string is correct by only of this parameter");
			System.out.println("Checking the correctness of positions of brackets..");
			System.out.println();

			for(int i = 0; i < size; i++){

				if(checkableString[0] == ')' && checkableString[i + k] == '('){

					System.out.println("String is not correct(wrong positions of brackets)");
					break;

				}else{

					i++;
					count++;
					

				}

				if(checkableString[0] == '}' && checkableString[i + k] == '{'){

					System.out.println("String is not correct(wrong positions of brackets)");
					break;

				}else{

					i++;
					count++;
					

				}

				if(checkableString[0] == ']' && checkableString[i + k] == '['){

					System.out.println("String is not correct(wrong positions of brackets)");
					break;

				}else{

					i++;
					count++;
					

				}

			}

			if(count == size){

			     System.out.println("String is correct(positions of brackets)");

		     }

		}else{

			System.out.println("String is not correct(number of brackets is not equal)");

		}

		
	}	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println();		

		System.out.println("Input: " + str);
		System.out.println();

		checkString(str);
	 } 	      
}
