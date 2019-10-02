package week4;

import java.util.Scanner;

/**
 * This quiz will determine friend compatability
 *
 * @author Cheyenne Sestric
 */
public class MightWeBeFriends {

    public static void main(String[] args) {
        System.out.println("Might we be friends?");
        int response;
        int compScore = 0;

        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Q1/8: Do you like dogs? (0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Me too!");
            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore - 00;
            System.out.println("Sad");
            System.out.println("Your compatability score is: " + compScore);
        }//close if else dogs 

        System.out.println("Q2/8: Have you been camping? (0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Camping is fun!");
            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatablility score is: " + compScore);
        }//close if else camping

        System.out.println("Q3/8: Do you like the ocean? (0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Me too!");
            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatability score is: " + compScore);
        }//close if else ocean

        System.out.println("Q4/8: Do you like cotton candy? (0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 0) {
            compScore = compScore + 10;
            System.out.println("Cotton candy is gross!");
            System.out.println("Your compatability score is:" + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatability score is: " + compScore);
        }//close if else cotton candy

        System.out.println("Q5/8: Have you been to an amusement park?"
                + " (0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("They are so much fun!");

            System.out.println("...Are you scared of roller coasters?"
                    + "(0 = no, (1 = yes)");
            response = keyboardReader.nextInt();
            if (response == 0) {
                System.out.println("Me either!");
                compScore = compScore + 10;
            } else {
                compScore = compScore - 0;
                System.out.println("You're missing out!");
            }

            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatability score is:" + compScore);
        }//close if else roller coasters

        System.out.println("Q6/8: Do you like sushi? (0 = no, 1 = yes");
        response = keyboardReader.nextInt();
        if (response == 0) {
            compScore = compScore - 0;
            
                    
            if (response == 0) {
            System.out.println("...Have you even given it a chance?"
            + "(0 = no, 1 = yes)");
            response = keyboardReader.nextInt ();
                    
                System.out.println("That is probably why!");
                compScore = compScore - 0;
            }else{
                System.out.println("Try a different kind!");
                compScore = compScore + 10;
            }
            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore + 10;
            System.out.println("Me too!");
            System.out.println("Your compatability score is: " + compScore);
        }//close if else sushi

        System.out.println("Q7/8: How many concerts have you been to?");
        response = keyboardReader.nextInt();
        if (response >= 5) {
            compScore = compScore + 10;
            System.out.println("They are so much fun!");
            System.out.println("Your compatability score is:" + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatabilit score is: " + compScore);
        }//close if else concerts

        System.out.println("Q8/8: Have you been out of the country? "
                + "(0 = no, 1 = yes)");
        response = keyboardReader.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Same!");
            System.out.println("Your compatability score is: " + compScore);
        } else {
            compScore = compScore - 0;
            System.out.println("Sad");
            System.out.println("Your compatability score is: " + compScore);
        }//close if else country

        if (compScore >= 50) {
            System.out.println("Based on your compatability score..."
                    + "We might be friends!");
        } else {
            System.out.println("Based on your compatability score..."
                    + "We wouldnt be friends! " + "Sad...");
        }//close if else ending 

    }

}
