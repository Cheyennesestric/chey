package loopingpractice;
import java.util.Scanner;
/**
 *
 * @author Cheyenne Sestric
 */
public class RetirementAge {
    public static void main(String[] args){
        int age;
        Scanner inputScanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your age to see if you can retire!");
            age = inputScanner.nextInt();
            if(age > 65.5){
                System.out.println("Wahoo! Grab the newspaper and martini!");
                if(age < 0){
                    break;
                    System.out.println("Thanks for checking your retirement "
                            + "status.");
                }else{
                            
                }
                
            }else{
                System.out.println("Sorry, Keep working...");
            }
        }
    }
    
}
