
package ownstring;

/**
 *The {@code MyStringViewer} class shows work of overwritten methods and
 * costructors from {@code MyString} class.
 * 
 * @author Andrey Romanov 
 * @version 1.0
 */
public class MyStringViewer {
    
    /**
     * This is just a main method, which shows the work of methods and constructors 
     * @param args the command-line arguments
     */
    public static void main(String[] args){
        
        MyString str = new MyString("testing");//initialization of object
        
        String s = "gsdfgsdfg";//string for checking
        
        System.out.print("Concacting of strings : ");
        str.concat(str);
        
        System.out.println();
        
        System.out.print("To char array: ");
        
        System.out.println(str.toCharArray());
        
        System.out.println();
        
        System.out.print("Index of \"t\" : ");
        System.out.println(str.indexOf('t'));
        
        System.out.println();
        
        
        System.out.print("Substring from first position: ");
        System.out.println(str.substr(0, 4));
        
        System.out.println();
        
        System.out.print("To string: ");
        System.out.println(str.toString());
        
        System.out.println();
        
        System.out.println("Is it equals to \"s\" object?");
        System.out.println(str.equals(s));
        
        System.out.println();
        
        System.out.print("Length: ");
        System.out.println(str.length());
        
        System.out.println();
        
        System.out.println("Split \"e\" letter");
        str.split('e');
        
        System.out.println();
    }
}
