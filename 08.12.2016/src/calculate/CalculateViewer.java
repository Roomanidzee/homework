package calculate;

import java.util.Scanner;

/**
 *
 * @author Андрей
 */
public class CalculateViewer {
    
    public static void main(String[] args){
        
        Calculations calc1 = new Calculations();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please, enter a and b");
        
        System.out.print("a : ");
        final float a = sc.nextFloat();//borders for function
        System.out.print("b : ");
        final float b = sc.nextFloat();
        System.out.println();
        final int N1 = 10;//limits for checking
        final int N2 = 100;
        final int N3 = 1000;
        
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        
        System.out.println("N = 10");
        
        System.out.println("Rectangle method: " + calc1.calculateRectangle(a , b, N1, new SinFunc()));
        System.out.println("Trapeze method: " + calc1.calculateTrapeze(a, b, N1,new SinFunc()));
        System.out.println("Simpson method: " + calc1.calculateSimpson(a, b, N1,new SinFunc()));
        System.out.println("Mathematical exactness: " + calc1.exactness(a, b, N1, new SinFunc()));
        
        System.out.println();
        
        System.out.println("N = 100");
        
        System.out.println("Rectangle method: " + calc1.calculateRectangle(a , b, N2, new SinFunc()));
        System.out.println("Trapeze method: " + calc1.calculateTrapeze(a, b, N2,new SinFunc()));
        System.out.println("Simpson method: " + calc1.calculateSimpson(a, b, N2,new SinFunc()));
        System.out.println("Mathematical exactness: " + calc1.exactness(a, b, N2, new SinFunc()));
        
        System.out.println();
        
        System.out.println("N = 1000");
        
        System.out.println("Rectangle method: " + calc1.calculateRectangle(a , b, N3, new SinFunc()));
        System.out.println("Trapeze method: " + calc1.calculateTrapeze(a, b, N3,new SinFunc()));
        System.out.println("Simpson method: " + calc1.calculateSimpson(a, b, N3,new SinFunc()));
        System.out.println("Mathematical exactness: " + calc1.exactness(a, b, N3, new SinFunc()));
        
    }   
}