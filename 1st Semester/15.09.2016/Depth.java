

public class Depth {
    public static void main(String[] args){
    	double t = Double.parseDouble(args[0]); //секундомер
        
        double h;

        double g = 9.8; //ускорение свободного падения

        //формула равноускоренного движения из состояния покоя
        h = (g*t*t)/2;
        
        System.out.println("Depth : " + h + " metres");

    }
}
