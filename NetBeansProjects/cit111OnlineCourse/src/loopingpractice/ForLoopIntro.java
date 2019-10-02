package loopingpractice;

import java.util.Scanner;

/**
 *
 * @author Cheyenne Sestric
 */
public class ForLoopIntro {

    public static void main(String[] args) {
        int loopControl;

        Scanner userScanner = new Scanner(System.in);
        System.out.println("How many loops shall I print with for()?");
        loopControl = userScanner.nextInt();
        for (int numLoops = 0; numLoops <= loopControl; 
                numLoops = numLoops + 1) {
            System.out.println("The value of numLoops: " + numLoops);
        }
    }
}
