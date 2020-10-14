package com.vailsys.elchicagovoid.gamesupport;

public class Encounter {

    int a = 1;
    private SuperHero herofighting2;
    private SuperHero heroFighting;
    private Monster monsterHeFights;
    
    public Encounter(SuperHero herofightingfromapp, SuperHero herofighting2fromapp, Monster monsterhefightsfromapp ) { 
        this.heroFighting = herofightingfromapp;
        this.monsterHeFights = monsterhefightsfromapp; 
        this.herofighting2 = herofighting2fromapp;
    }   

    public void monsterTaunts() {
        System.out.println("A "+ monsterHeFights.primaryWeapon.weaponName + " is thrown at him but he was able to dodge it. A " + monsterHeFights.MonsterName + " has appeared" );
        System.out.println(monsterHeFights.MonsterSpeak());
        System.out.println(monsterHeFights.WriteLnMonsterSummary());
        System.out.println(monsterHeFights.primaryWeapon.PrintWeaponStatus());
        System.out.print("Press ENTER to Continue\n");
    }

    public void StartFighting() {
        
        while (monsterHeFights.NumberofHearts > 0)
        {
            System.out.println("What will he do");
            System.out.println("[1]Fight\n[2]Recover");
            
            String combatchoice;
            combatchoice = System.console().readLine();
        
            switch(combatchoice)
            {
                
                case "1":
                    System.out.println("Time to kick this guys butt.");
                    break;
            
                case "2":
                    System.out.println("Gotta keep defending myself.");
                    break;
            }

            if (combatchoice.equals("1"))
            {                
                System.out.println(heroFighting.characterName + " has " + heroFighting.Health + " left.");
                System.out.println("He used " + heroFighting.HeroWeapon.weaponName + ".");
                monsterHeFights.NumberofHearts -= heroFighting.damagePerTurn; //reduces the amount of health the monster has
                System.out.println(monsterHeFights.MonsterName + " has " + monsterHeFights.NumberofHearts + " health."); 

                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                System.out.println(heroFighting.characterName + " has " + heroFighting.HeroWeapon.numOfAllowedAttacks + " attacks remaining.");
                System.out.println("\n");  
            } 
            if(monsterHeFights.NumberofHearts > 0){
                System.out.println(herofighting2.characterName + " has " + herofighting2.Health + " left.");
                System.out.println("He used " + herofighting2.HeroWeapon.weaponName + ".");
                monsterHeFights.NumberofHearts -= herofighting2.damagePerTurn; //reduces the amount of health the monster has
                System.out.println(monsterHeFights.MonsterName + " has " + monsterHeFights.NumberofHearts + " health."); 

                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                System.out.println(heroFighting.characterName + " has " + heroFighting.HeroWeapon.numOfAllowedAttacks + " attacks remaining.");
                System.out.println("\n");  
            }
             if (monsterHeFights.NumberofHearts > 0) {
                System.out.println("\n");
                System.out.println("Press ENTER to Continue");
                System.console().readLine();
                System.out.println("\n" + monsterHeFights.MonsterName + " attacks again, "+ monsterHeFights.primaryWeapon.weaponName);
                int min = 10;
                int max = 20;
                int random_int = (int)(Math.random() * (max - min + 1) + min);
                System.out.println(random_int);
                heroFighting.Health -= random_int;
                
                System.out.println("Ouch, " + heroFighting.characterName + " shouts: ''AHHH'' I have " + heroFighting.Health + " health left! \n");
            }
            if (heroFighting.Health < 0 || heroFighting.HeroWeapon.numOfAllowedAttacks == 0) {
                System.out.println("You ran out of health and/or ammo");
                System.out.println("GAMEOVER!");
                System.exit(0x0);
            }
            if(combatchoice.equals("2") && heroFighting.Health < 100){                
                heroFighting.Health += 20; 
                System.out.println(heroFighting.characterName + " has blocked attack, received 25 Hp, and another " + heroFighting.HeroWeapon.weaponName);
                heroFighting.HeroWeapon.numOfAllowedAttacks = heroFighting.HeroWeapon.attackCounter; 
            }
            System.out.println(heroFighting.characterName + " has attacked the " + monsterHeFights.MonsterName + " with " + heroFighting.HeroWeapon.PrintWeaponStatus());
            System.out.println("Press Enter To Continue");
            System.console().readLine();
        }
    } 
}
