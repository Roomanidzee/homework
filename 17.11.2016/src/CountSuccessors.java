/**
 *
 * @author Андрей
 */

import java.util.Scanner;

public class CountSuccessors {
    
    public static int count(int n, int sum, int q, int now){
        
        int calc = (now + 1) % 2;
        
        sum = sum * q;
        
        
        if( calc == 0){
            
            q -= 2;
            
        }
        
        else {
            
            q += 1;
            
        }
        
        if( q < 2){
            
            q = 2;
            
        }
        
        
        
        if(now < n){
            
            return count(n, sum, q ,(now + 1));
            
        }else{
            
            return sum;
            
        }
        
        
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please, enter the number of generation: ");
        
        int n = sc.nextInt();// number of calculating  generation
        
        int sum = 1;//variable for sum of successors
        int q = 10;//successors in first generation
        int now = 1;//first generation
        
        System.out.println("Number of successors: " + count(n,sum, q, now ));
        
    }
    
}
