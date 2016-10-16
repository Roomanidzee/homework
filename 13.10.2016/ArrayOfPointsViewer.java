

public class ArrayOfPointsViewer {

    public static void main(String[] args){ 
        //I decided to divide code in two classes, because  I already send the
        //array in the ArrayOfPointsMethods.java
        
        ArrayOfPointsMethods calc = new ArrayOfPointsMethods();   	

    	System.out.println("Original array: ");
        int x = (int)(Math.random()*10);//getting theelements of array
        int k = 0;

        for(int i = 0; i < 20; i++){//filling the array

            

                calc.add(new Integer(k));
                k+=x;

            
        }

    	for(int i = 0; i < calc.newSize(); i++){//output of original array

    		

    			System.out.print(calc.get(i) + " ");

    		
    	}

    	System.out.println();

    	

    	calc.add(new Integer(x));
        calc.add(new Integer(x));

    	System.out.println("Changed array(use of method add): ");

    	for(int i = 0; i < calc.newSize(); i++){

            

                System.out.print(calc.get(i) + " ");

            
    	}

    	System.out.println();
        System.out.println();

    	calc.remove(1);

    	System.out.println("Changed array(use of method remove): ");

    	for(int i = 0; i < calc.newSize(); i++){

            

                System.out.print(calc.get(i) + " ");

            
        }

    	System.out.println();
        System.out.println();

        System.out.println("Get element with index 3: ");
    	System.out.println(calc.get(3));

    }
}
