

public class BackpackExtendingViewer {

    public static void main(String[] args) throws CloneNotSupportedException{

    	ExtendedBackpack back1 = new ExtendedBackpack();//initialization of object
    	

    	back1.setNumberOfPockets(10);
    	back1.setAppearance("simple");
    	back1.setCapacity(15);

        System.out.println();

    	System.out.println("Capacity: " + back1.calculateCapacity(back1.getCapacity()) + " litres.");
    	System.out.println("Number of pockets: " + back1.calculatePockets(back1.getNumberOfPockets()));

    	back1.toString();

    	ExtendedBackpack back2 = (ExtendedBackpack)back1.clone();
    	System.out.println(back2);
    	System.out.println("Equality of count of pockets and capacity: " + back1.equals(back1.getNumberOfPockets(), back1.getCapacity()));
    	System.out.println("Hash code: " + back1.getHashCode());

        System.out.println();


    }
}
