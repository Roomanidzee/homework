
public class MainClassForHuman {

	public static void main(String[] args){

		Human h1 = new Human();// initialization of Human

		int points = 100;// setting points

		System.out.println();

		h1.setColor("white");
		h1.setTypeOfBrain("more developed, that monkey's brain");
		h1.setPointsOfIntellect(points);

		
		System.out.println(h1.getColor());
		System.out.println(h1.getTypeOfBrain());

		System.out.println(h1.showRelatives("Human"));
		System.out.println("Level of IQ: " +  h1.calculateIQ(h1.getPointsOfIntellect()));
		System.out.println(h1.showActions("think"));

		System.out.println();


	}
    
}
