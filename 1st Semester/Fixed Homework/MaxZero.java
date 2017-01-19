

public class MaxZero {
    public static void main(String[] args){
    	int number = Integer.parseInt(args[0]);// entering the number for calculating

        int k = 0;
        int k1 = -1;//first coefficient
        String binary = "";// variable for binary form
        int x;
        int max;
        int[] maxes = new int[10];
        

        while(number != 0){

            x = number % 2;
            binary = x + binary;
            number = number / 2;

        }

        char[] str = binary.toCharArray();

        for(int i = 0; i < str.length; i++){

            if(str[i]  == '0'){

                k++;

            }else{

                k1++;
                maxes[k1] = k;
                k = 0;

            }
        }

        max = maxes[0];

        for(int i = 0; i < k1; i++){

            if(maxes[i] > max){

                max = maxes[i];

            }

        }

    	System.out.println("Count of zeros : " + max);
    }
}
