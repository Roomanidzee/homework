

public class Pen {
    
    protected String typeOfPen;//variable for type of pen
    protected int sizeOfPen;//variable for size of pen
    protected String colorOfPen;//variable for color of pen
	protected int price;//variable for price of pen

    //getters and setters for variables

    protected void setTypeOfPen(String penType){

    	this.typeOfPen = penType;

    }

    protected String getTypeOfPen(){

    	return typeOfPen;

    }

    protected void setSizeOfPen(int penSize){

    	this.sizeOfPen = penSize;

    }

    protected int getSizeOfPen(){

    	return sizeOfPen;

    }

    protected void setColorOfPen(String penColor){

    	this.colorOfPen = penColor;

    }

    protected String getColorOfPen(){

    	return colorOfPen;

    }

    

	protected void setPrice(int penPrice){

		this.price = penPrice;

	}
    
    protected int getPrice(){

    	return price;

    }
}
