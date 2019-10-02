package creatureloops;

/**
 *
 * @author Cheyenne Sestric
 */
public class Snakes {
    public static void main(String[] args){
        int rhinos = 0;
        int snakes = 4;
        while(rhinos <= snakes){
            System.out.println("Rhino: " + rhinos);
            rhinos = rhinos + 1;
        }
        System.out.println("Snakes: " + snakes);
        System.out.println("Rhinos: " + rhinos);
        if(rhinos == snakes){
            System.out.println("Equal!");
        }
    }
    
}
