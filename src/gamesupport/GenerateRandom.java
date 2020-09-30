package gamesupport;
import java.util.Random;
 public class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
       int upperbound = 25;// upperbound means the limit from 0-25
        //generate random values from 0-24
       int num = rand.nextInt(upperbound);// num is the actual number that gets used
      
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ num); //num is the actual number we use
    }
}