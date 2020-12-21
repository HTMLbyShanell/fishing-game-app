
package fishinggame;
import java.util.Random;

/**
 *
 * @author Shanell Spann
 */
public class Die {
    private int numberOfSides;
    private int dieValue;
    
    public void roll(){
        Random r = new Random();
        dieValue = r.nextInt(numberOfSides) + 1;
    }
    
    public int getDieValue(){
        return dieValue;
    }
    
    public Die(int numberOfSidesGiven){
        numberOfSides = numberOfSidesGiven;
        roll();
    }
}
