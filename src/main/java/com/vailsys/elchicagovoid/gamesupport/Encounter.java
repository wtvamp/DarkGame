package com.vailsys.elchicagovoid.gamesupport;

import java.util.Random;

public class Encounter {

    int a = 1;
    private SuperHero herofighting2;
    private SuperHero heroFighting;
    private Monster monsterHeFights;
    private Random randomAttack = new Random();
    
    public Encounter(SuperHero herofightingfromapp, SuperHero herofighting2fromapp, Monster monsterhefightsfromapp ) { 
        this.heroFighting = herofightingfromapp;
        this.monsterHeFights = monsterhefightsfromapp; 
        this.herofighting2 = herofighting2fromapp;
    }

    public void setMonsterHeFights(Monster monsterHeFights) {
        this.monsterHeFights = monsterHeFights;
    }

    public void monsterTaunts() {
        System.out.println("A " + this.monsterHeFights.MonsterName + " appears");
        System.out.println(monsterHeFights.monsterSpeak());
        System.out.println(monsterHeFights.writeLnMonsterSummary());
        System.out.println("The " + this.monsterHeFights.MonsterName + " carries a " + monsterHeFights.primaryWeapon.weaponName);
        System.out.println(monsterHeFights.primaryWeapon.PrintWeaponStatus());
        System.out.print("Press ENTER to Continue\n");
        System.console().readLine();
    }

    public void startFighting() {
        
        while (monsterHeFights.NumberofHearts > 0)
        {
            System.out.println("===================================================");
            System.out.println("== " + this.heroFighting.characterName + " health: " + this.heroFighting.Health);
            System.out.println(
                "== " + this.heroFighting.characterName + "'s " + 
                this.heroFighting.HeroWeapon.weaponName + 
                " attacks remaining: " 
                + this.heroFighting.HeroWeapon.numOfAllowedAttacks +
                "/" + this.heroFighting.HeroWeapon.attackCounter
            );
            System.out.println("== " + this.herofighting2.characterName + " health: " + this.heroFighting.Health);
            System.out.println(
                "== " + this.herofighting2.characterName + "'s " + 
                this.herofighting2.HeroWeapon.weaponName + 
                " attacks remaining: " 
                + this.herofighting2.HeroWeapon.numOfAllowedAttacks +
                "/" + this.herofighting2.HeroWeapon.attackCounter
            );
            
            System.out.println("===================================================");
            System.out.println("== " + this.monsterHeFights.MonsterName + " hearts: " + this.monsterHeFights.NumberofHearts);
            System.out.println("===================================================");
            System.out.println("\n");
            System.out.println("What will he do");
            System.out.println(" [1]Fight\n [2]Recover");
            
            String combatchoice = System.console().readLine();

            if (combatchoice.equals("1"))
            {                
                System.out.println("\n");
                System.out.println("'Time to kick this guys butt!!' " + heroFighting.characterName + " the " + heroFighting.HeroName + " shouts.");

                System.out.println(heroFighting.characterName + " used the " + heroFighting.HeroWeapon.attackType + " " + heroFighting.HeroWeapon.weaponName + ".");
                System.out.println("He did " + heroFighting.damagePerTurn + " worth of damage to the " + monsterHeFights.MonsterName);
                monsterHeFights.NumberofHearts -= heroFighting.damagePerTurn; //reduces the amount of health the monster has
                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                System.out.println("\n");  
                
                System.out.println(herofighting2.characterName + " used the " + herofighting2.HeroWeapon.attackType + " " + herofighting2.HeroWeapon.weaponName + ".");
                System.out.println("He did " + herofighting2.damagePerTurn + " worth of damage to the " + monsterHeFights.MonsterName);
                monsterHeFights.NumberofHearts -= herofighting2.damagePerTurn; //reduces the amount of health the monster has
                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                if(monsterHeFights.NumberofHearts > 0){
                    System.out.println("\n");  
                    System.out.println("The " + monsterHeFights.MonsterName + " is preparing his own attack.");
                    System.out.println("\n");
                    System.out.println("Press ENTER to Continue");
                    System.console().readLine();
                    System.out.println("\n" + monsterHeFights.MonsterName + " attacks again, with the "+ monsterHeFights.primaryWeapon.weaponName);
                    int randomAttackDmg = randomAttack.nextInt(10) + 10;
                    heroFighting.Health -= randomAttackDmg;
                    System.out.println("Ouch, " + heroFighting.characterName + " shouts: ''AHHH!!''");
                    System.out.println("The " + monsterHeFights.MonsterName + " attacked " + heroFighting.characterName + " for " + randomAttackDmg + " damange.");
                    System.out.println("\n\n");
                }
            } 

            if (heroFighting.Health < 0 || heroFighting.HeroWeapon.numOfAllowedAttacks == 0) {
                if (this.heroFighting.Health > 0) {
                    System.out.println(this.heroFighting.characterName + " the " + this.heroFighting.HeroName + " ran out of ammo.");
                }
                else {
                    System.out.println(this.heroFighting.characterName + " the " + this.heroFighting.HeroName + " ran out of health.");
                }
                System.out.println("The " + monsterHeFights.MonsterName + " hits " + heroFighting.characterName + " with one final blow.");

                if (this.monsterHeFights.NumberofHearts >= 0) {
                    System.out.println("The " + monsterHeFights.MonsterName + " he was fighting is also fading.");
                    System.out.println("He sees the " + monsterHeFights.MonsterName + " fall over dead next to him.");
                    System.out.println("The world fades to black as he wonders if this battle was worth it.");
                }
                else {
                    System.out.println("The world fades to black as he wonders how ended up down this dark path.");
                }
                System.out.println("GAME OVER!");
                System.exit(0x0);
            }

            if(combatchoice.equals("2") && heroFighting.Health < 100) { 
                System.out.println("\n\n");
                System.out.println(heroFighting.HeroName + " thinks to himself: 'Gotta keep defending myself.'");
                heroFighting.Health += 25; 
                heroFighting.HeroWeapon.numOfAllowedAttacks = heroFighting.HeroWeapon.attackCounter; 
                System.out.println(heroFighting.characterName + " has blocked all attacks, received 25 health, and another " + heroFighting.HeroWeapon.weaponName);
                System.out.println("Press ENTER to Continue");
                System.console().readLine();
            }
        }
        System.out.println("\n\n");
        System.out.println("The " + monsterHeFights.MonsterName + " has been defeated");
        System.out.println("\n");
        System.out.println("Press ENTER to Continue");
        System.console().readLine();
        System.out.println("\n\n");
        System.out.println("\n\n");

    } 
}
