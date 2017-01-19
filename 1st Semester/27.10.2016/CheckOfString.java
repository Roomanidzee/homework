import java.util.Scanner;// all imports, what I need
import java.util.Arrays;

public class CheckOfString {

	private static void checkString(String str){//function for checking of string

		char[] checkableString = str.toCharArray();// making an arrat of simbols from a string

		int size = checkableString.length;//size of an array

		int left = 0;//variable for count of first bracket
		int right = 0;//variable for count of second bracket

		for(int i = 0; i < size; i++){

			if(checkableString[i] == '('){

				left++;

			}

			if(checkableString[i] == ')'){

				right++;

			}
		}
		int k = 0;//variable of index of symbol
		int count = 0;//variable for checks of string

		if(left == right){

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

			}

			if(count == size){

			      System.out.println("String is correct");

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
