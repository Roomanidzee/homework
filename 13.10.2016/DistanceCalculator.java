

public class DistanceCalculator {
    
    double calculate(double x0, double y0, double x, double y){ //function for calculating the distance between the points

    	return Math.sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0));

    }
}
