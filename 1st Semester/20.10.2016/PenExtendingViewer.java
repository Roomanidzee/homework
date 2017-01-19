

public class PenExtendingViewer {

	public static void main(String[] args) throws CloneNotSupportedException{

		PenExtendedWithNewFeatures pen1 = new PenExtendedWithNewFeatures();//initializationn of object

		int size = 10;
		int price = 20;

		pen1.setTypeOfPen("ballpoint");
		pen1.setSizeOfPen(size);
		pen1.setColorOfPen("red");
		pen1.setPrice(price);

		System.out.println();

		System.out.println("Price: " + pen1.calculatePrice(pen1.getPrice()) + " rubles.");
		System.out.println("Size: " + pen1.calculateSize(pen1.getSizeOfPen()) + " centimeters.");

		pen1.toString();

		PenExtendedWithNewFeatures pen2 = (PenExtendedWithNewFeatures)pen1.clone(); 
    	System.out.println(pen2);
    	System.out.println("Equality of count of size and price: " + pen1.equals(pen1.getSizeOfPen(), pen1.getPrice()));
    	System.out.println("Hash code: " + pen1.getHashCode());

    	System.out.println();

	}
    
}
