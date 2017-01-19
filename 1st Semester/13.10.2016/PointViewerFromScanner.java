import java.util.Scanner;

public class PointViewerFromScanner {
     public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);//initializing scanner

    	int size = 4;// limir for the loop of coordinates

    	double [] coordArray = new double[4];

    	for(int i = 0; i < size; i++){

    		coordArray[i] = sc.nextDouble();

    	}

    		
        //initializing coordinates
    	Point p1 = new Point();
    	p1.setX0(coordArray[0]);
    	p1.setY0(coordArray[1]);
    	p1.setX(coordArray[2]);
    	p1.setY(coordArray[3]);

    	DistanceCalculator calc1 = new DistanceCalculator();
        //viewing results
    	System.out.println("Distance: " +  calc1.calculate(p1.getX0(), p1.getY0(), p1.getX(), p1.getY()));
    }
}
