
package fishinggame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shanell Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 4
 * Date:  10/16/2020
 * Description: Create a program that simulates a fishing game. 
 * Purpose: Practice using switch cases, random generators, loops, and if-statements.
 */
public class FishingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Die die1 = new Die(6);
        int numberOfPoints = 0;
        int continueFishing = 0; // 0 equals yes. this is needed for the while loop as joption pane is string, but y/n converted via int. 
        
        continueFishing = JOptionPane.showConfirmDialog(null,"Wanna go fishing?", "Fishing Game App", JOptionPane.YES_NO_OPTION);
        
        while(continueFishing == JOptionPane.YES_OPTION){
            die1.roll();
            switch(die1.getDieValue()){
                case 1:
                    numberOfPoints += 60; // this is the shorthand writing of   numberOfPoints = numberOfPoints + 60;
                    JOptionPane.showMessageDialog(null, "Nice, You caught a huge fish.");
                    break;
                case 2:
                    numberOfPoints += 0; 
                    JOptionPane.showMessageDialog(null, "Haha, You caught an old shoe.");
                    break;
                case 3:
                    numberOfPoints += 10; 
                    JOptionPane.showMessageDialog(null, "Aww, You caught a little fish.");
                    break;
                case 4:
                    numberOfPoints += 100; 
                    JOptionPane.showMessageDialog(null, "Wow, You caught a whale.");
                    break;
                case 5:
                    numberOfPoints += 40; 
                    JOptionPane.showMessageDialog(null, "Ouch, You caught a piranha.");
                    break;
                case 6:
                    numberOfPoints += 5; 
                    JOptionPane.showMessageDialog(null, "Eww, You caught a barnacle.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Out of Range.");
                    break;         
            }
            continueFishing = JOptionPane.showConfirmDialog(null,"Do you want to continue fishing?", "Fishing Game App", JOptionPane.YES_NO_OPTION);
        }
        if(numberOfPoints >= 150){
            JOptionPane.showMessageDialog(null, "Total fishing points: " + numberOfPoints + "\nYou are experienced. Great Job!");
        } else{
            JOptionPane.showMessageDialog(null, "Total fishing points: " + numberOfPoints + "\nYou need practice. Better luck next time!");
        }
        
        System.exit(0);
    }
    
}
