package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;


import java.util.Random;

public class SummonCreatureSpell extends MagicSpell {
        public static void main( String args[] ) {
        //generate random values from 0-24
        // num is the actual number that gets used
            int minSummonSpell = 1;
            int maxSummonSpell= 2;
       //Generate random double value from 50 to 100 
            int random_int = (int)(Math.random() * (maxSummonSpell - minSummonSpell + 1) + minSummonSpell);
            System.out.println(random_int);

            if (random_int == 1){
                this.MagicSpell.activateDamage(15);
            } else {

        }
    }
    