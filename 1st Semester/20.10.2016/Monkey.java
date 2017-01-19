

public class Monkey {
    
    protected String color;// variable for color of skin of monkey
    private String typeOfBrain;// variable for type of brain of monkey
    private int pointsOfIntellect; // variable for points of intellect

    //getters and setters for variables

    protected void setColor(String monkeyColor){

    	this.color = monkeyColor;

    }

    protected String getColor(){

    	return  "Color of monkey: " + color;

    }

    protected void setTypeOfBrain(String monkeyTypeOfBrain){

    	this.typeOfBrain = monkeyTypeOfBrain;

    }

    protected String getTypeOfBrain(){

    	return "Human's type of brain: "  + typeOfBrain;

    }

    protected void setPointsOfIntellect(int monkeyIntellect){

    	this.pointsOfIntellect = monkeyIntellect;

    }

    protected int getPointsOfIntellect(){

    	return pointsOfIntellect;

    }



    protected int calculateIQ(int points){//this function calculates IQ of Monkey

    	return points + 50;

    }

    protected String showRelatives(String person){ // this function show relatives of human

    	return "Relatives of " + person + ": gorrilla, chimpanzee, orangutan.";

    }

    protected String showActions(String actions){// this fucntion shows what human can do  

        return "Human can " + actions + " to support his life and friends";

    }

}
