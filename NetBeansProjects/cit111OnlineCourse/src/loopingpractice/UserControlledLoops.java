
package loopingpractice;
import java.util.Scanner;
/**
 *
 * @author Cheyenne Sestric
 */
public class UserControlledLoops {
    public static void main(String[] userloops){
        int numLoops = 0;
        int loopControl = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        }
        System.out.println("...After the while loop");
    }
    
}
