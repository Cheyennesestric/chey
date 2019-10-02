package week3;

/**
 *
 * @author cheyenne.sestric
 */
public class Sandbox {
    
   public static void main(String[] args) {
        int turtle = 4;
        int marmot = 2;
        boolean sloth = false;
        
        while(marmot <= turtle){
            sloth = !sloth;
            marmot = marmot + 1;
        } // end while
        if(sloth){
            marmot = marmot * marmot;
        }    
        System.out.println("Turtle: " + turtle);
        System.out.println("Marmot: " + marmot);
        System.out.println("Sloth: " + sloth);
    } // close main
} // close class
