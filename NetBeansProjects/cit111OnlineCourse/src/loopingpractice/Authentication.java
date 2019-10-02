package loopingpractice;

import java.util.Scanner;

/**
 *
 * @author Cheyenne Sestric
 */
public class Authentication {

    public static void main(String[] args) {
        int attempts = 5;
        int tries = 0;
        int response;
        int password = 1234;

        Scanner keyboardReader = new Scanner(System.in);
        while(tries < attempts){

            System.out.println("Enter password (4 digits)");
            
           
            response = keyboardReader.nextInt();
            tries = tries + 1;
            if (response == password) {
                System.out.println("Correct password!");
                System.out.println("You're logged in!");
            } else {
            
                System.out.println("Inncorrect password!");
                System.out.println("Number of attempts: " + tries);
                System.out.println("Number attempts allowed: " + attempts);
                System.out.println("Please try again:");

            }//close if/else

        }//close while
        System.out.println("You're locked out!");
    }//close main

}//close class
