

public class Backpack {
    
    protected int numberOfPockets;//variable for number of pockets
    protected String appearance;// variable for appearance
    protected int capacity;// variable for number of capacity

    //getters and setters for variables

    protected void setNumberOfPockets(int backpackNumberOfPockets){

    	this.numberOfPockets = backpackNumberOfPockets;

    }

    protected int getNumberOfPockets(){

    	return numberOfPockets;

    }

    protected void setAppearance(String backpackAppearance){

    	this.appearance = backpackAppearance;

    }

    protected String getAppearance(){

    	return appearance;

    }

    protected void setCapacity(int backpackCapacity){

    	this.capacity = backpackCapacity;

    }

    protected int getCapacity(){

    	return capacity;

    }	
}