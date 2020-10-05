package gamesupport;
import java.util.Random;
 public class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
       int upperbound = 25;// upperbound means the limit from 0-25
        //generate random values from 0-24
       int num = rand.nextInt(upperbound);// num is the actual number that gets used
       int min = 50;
       int max = 100;
       //Generate random double value from 50 to 100 
       int random_int = (int)(Math.random() * (max - min + 1) + min);
       System.out.println(random_int);

      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ num); //num is the actual number we use
    }
}