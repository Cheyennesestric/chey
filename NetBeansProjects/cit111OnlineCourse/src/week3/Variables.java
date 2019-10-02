package week3;

/**
 * 
 * @author Cheyenne Sestric
 */
public class Variables {
    
    public static void main(String[] args) {
        // declare varibles and give them a type (they are all int type)
        int yearsEleSchl;
        int yearsMS;
        int yearsHS;
        int yearsCollege;
        int totalYears;
        
        // now initialize them with a value
        yearsEleSchl = 5;
        yearsMS = 3;
        yearsHS = 4;
        yearsCollege = 2;
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // and print the value of totalYears to the console with some text
        System.out.println("Total years in school: " + totalYears);
    }
    
}
