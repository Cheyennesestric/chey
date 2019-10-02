package creatureloops;

/**
 *
 * @author Cheyenne Sestric
 */
public class Bacteria {
    public static void main(String[] args){
        int bacteria = 10;
        int virus = 2;
        if(bacteria / virus > 4){
            System.out.println(bacteria/virus);
            while(virus > 0){
                System.out.println("v: " + virus);
                virus --;
                
            }
            System.out.println(bacteria/virus);
        }
    }
    
}
