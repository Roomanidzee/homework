

public class ExtendedBackpack extends Backpack implements Cloneable{

	public int calculateCapacity(int capacity){//this function calculates capacity

		return capacity + 10;

	}

	public int calculatePockets(int numberOfPockets){//this function calculates number of pockets
		
		return numberOfPockets + 2;

	}

	public Object equals(Object obj1, Object obj2){// this function checks if obj1 equal to obj2

		return obj1 == obj2;

	}

	public String toString(){//this function outputs all information about object

		return "Description: " + this.getNumberOfPockets() + " pockets, " + this.getAppearance()
		        + " appearance, " + this.getCapacity() + " liters capacity.";

	}

	public int getHashCode(){// this function generates a hashcode to object

		int result;

		result = (int)(Math.random() * 1000000);

		result *= 20;

		result += 5;

		return result;

	}

	@Override
	public Object clone() throws CloneNotSupportedException{// this function clones objects and methods

		return super.clone();

	}
    
}
