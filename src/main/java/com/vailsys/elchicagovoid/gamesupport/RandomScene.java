package com.vailsys.elchicagovoid.gamesupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class RandomScene {

int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

public static void main(String args[]) {
         
        int[] array = { 1, 2, 3, };
            
        Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
            
            if (i == 0){
                System.out.println("pp");
            }
            
            }
            System.out.println(Arrays.toString(array));
               
     }
} 
