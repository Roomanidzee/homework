

public class Pi {
    public static void main(String[] args){
    	double r = Double.parseDouble(args[0]); //радиус
    	double alpha = Double.parseDouble(args[1]); //угол
		double arc = 2 * alpha;//дуга окружности
		double calc = r * r + r * r - 2 * r * r * Math.cos(alpha); //теорема косинусов

    	double l = 0;
    	while(arc < 360){

    		l += calc;
    		arc += arc;

    	}
    	
    	
    	double pi; //вычисление пи
    	pi = l / (2 * r);
    	System.out.println("Pi : " + pi);
    }
}
