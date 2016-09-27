

public class Point {
    public static void main(String[] args){
    	double x0 = Double.parseDouble(args[0]);//центр окружности
    	double y0 = Double.parseDouble(args[1]);

    	double x = Double.parseDouble(args[2]); //координаты точки
    	double y = Double.parseDouble(args[3]); 

    	double r = Double.parseDouble(args[4]); //радиус

    	if (((x - x0) * (x - x0) + (y - y0)* (y - y0)) < r*r ){
    		System.out.println("Point is in the circle");
    	}else{
    		System.out.println("Point is not in the circle");
    	}
    }
}
