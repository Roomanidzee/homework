

public class FurnitureWooden extends Furniture{

	@Override//checking if methods overriden
	public String getTitle(){

		return "Type : wooden furniture";

	}

	@Override
	public int calculateAge(int age){

               return age + 6;

	}
    
}
