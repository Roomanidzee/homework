

public class PhoneAndComputerViewer {
    
    public static void main(String[] args){

    	Computer com = new Computer();// viewing of results
    	Phone ph = new Phone();

    	ph.readInfo();
    	ph.writeInfo();
        ph.loadInfo();
    	ph.loadMoreInfo();

    	System.out.println();

        com.readInfo();
    	com.writeInfo();
        com.loadInfo();
    	com.loadMoreInfo();    	
    }
}
