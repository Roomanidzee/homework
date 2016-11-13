

public class FurnitureViewer {
    
    public static void main(String[] args){

    	FurnitureWooden fw = new FurnitureWooden(); //iitializing of furniture

    	int age = 2;

    	System.out.println(fw.getTitle());
    	System.out.println("Age: " + fw.calculateAge(age));
    }
}
