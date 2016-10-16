import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PointViewerFromFile {
    public static void main(String[] args) throws FileNotFoundException{
    	File f = new File("data.txt");//initializing the file
    	Scanner sc = new Scanner(f);//reading the file

    	int size = 4;//limit for the loop

    	double [] coordArray = new double[4];// array for coordinates

    	while(sc.hasNext()){

    		for(int i = 0; i < size; i++){

    			coordArray[i] = sc.nextDouble();

    		}

    	}	
        //initializing points
    	Point p1 = new Point();
    	p1.setX0(coordArray[0]);
    	p1.setY0(coordArray[1]);
    	p1.setX(coordArray[2]);
    	p1.setY(coordArray[3]);

    	DistanceCalculator calc1 = new DistanceCalculator();
        //viewing the results
    	System.out.println("Distance: " +  calc1.calculate(p1.getX0(), p1.getY0(), p1.getX(), p1.getY()));
    }
}
