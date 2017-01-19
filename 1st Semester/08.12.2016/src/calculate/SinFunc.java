package calculate;

/**
 *
 * @author Андрей
 */
public class SinFunc implements Function{
    
    @Override
    public float func(float x){
        
        return (float) (x * Math.sin(x));//function for calculating
        
    }
    
}
