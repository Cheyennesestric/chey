package loopingpractice;

/**
 *
 * @author Cheyenne Sestric
 */
public class SimpleLoop {
    public static void main(String[] looping){
        int count = 0;
        int numLoops = 300000;
        long startTime = System.currentTimeMillis();
        long endTime; //declare all vars at top of method 
        long loopTime ;
        
        
        
        System.out.println("Start looping at: " + startTime);
        //as long as count < numLoops execute my block
        while (count < numLoops){
            System.out.println("Change oil");
            System.out.println("Val of count: " + count);
            count = count + 1;
        }
        endTime = System.currentTimeMillis();        
        System.out.println("Stopped looping at " + endTime);
        
        loopTime = (endTime - startTime) / 1000;
        System.out.println("Loop time: " + loopTime);
    }
    
}
