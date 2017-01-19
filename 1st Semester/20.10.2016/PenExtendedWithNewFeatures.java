

public class PenExtendedWithNewFeatures extends PenExtended implements Cloneable{

	

	public int calculateSize(int size){//function for calculating the size of pen

		return size + 20;

	}

	public Object equals(Object obj1, Object obj2){ // function for checking if objects are equal

		return obj1 == obj2;

	}

	public String toString(){// this function outputs the description of object

		return "Description: " + this.getTypeOfPen() + " pen, " + this.getSizeOfPen()
		        + " centimeters, " + this.getColorOfPen() + " color, " + " price : " + this.getPrice() + " rubles." ;

	}

	public int getHashCode(){// this function generates a hash code to object

		int result;

		result = (int)(Math.random() * 1000000);

		result *= 20;

		result += 5;

		return result;

	}

	
	public Object clone() throws CloneNotSupportedException{// this function clones object

		return super.clone(); 

	}
    
} 
