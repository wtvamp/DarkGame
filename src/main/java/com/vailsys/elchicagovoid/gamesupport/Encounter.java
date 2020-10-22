package com.vailsys.elchicagovoid.gamesupport;

import java.util.Random;

import com.vailsys.elchicagovoid.gamesupport.interfaces.IDamageEnemy;
import com.vailsys.elchicagovoid.gamesupport.interfaces.IRestoreSpell;
import com.vailsys.elchicagovoid.gamesupport.interfaces.ISpell;

public class Encounter {

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
        System.out.println("A " + this.monsterHeFights.getMonsterName() + " appears");
        System.out.println(monsterHeFights.monsterSpeak());
        System.out.println(monsterHeFights.writeLnMonsterSummary());
        System.out.println("The " + this.monsterHeFights.getMonsterName() + " carries a " + monsterHeFights.getPrimaryWeapon().getweaponName());
        System.out.println(monsterHeFights.getPrimaryWeapon().PrintWeaponStatus());
        System.out.print("Press ENTER to Continue\n");
        System.console().readLine();
    }

    public void startFighting() {
        
        while (monsterHeFights.getnumberOfHearts() > 0)
        {
            System.out.println("===================================================");
            System.out.println("== " + this.heroFighting.getCharacterName() + " health: " + this.heroFighting.getHealth());
            System.out.println(
                "== " + this.heroFighting.getCharacterName() + "'s " + 
                this.heroFighting.heroWeapon.getweaponName()
                            + 
                " attacks remaining: " 
                + this.heroFighting.heroWeapon.getWeaponnumOfAllowedAttacks() +
                "/" + this.heroFighting.heroWeapon.getattackCounter()
            );
            System.out.println("== " + this.herofighting2.getCharacterName() + " health: " + this.heroFighting.getHealth());
            System.out.println(
                "== " + this.herofighting2.getCharacterName() + "'s " + 
                this.herofighting2.heroWeapon.getweaponName()
                            + 
                " attacks remaining: " 
                + this.herofighting2.heroWeapon.getWeaponnumOfAllowedAttacks() +
                "/" + this.herofighting2.heroWeapon.getattackCounter()
            );
            
            System.out.println("===================================================");
            System.out.println("== " + this.monsterHeFights.getMonsterName() + " hearts: " + this.monsterHeFights.getnumberOfHearts());
            System.out.println("===================================================");
            System.out.println("\n");
            System.out.println("What will he do");
            System.out.println(" [1]Fight\n [2]Recover\n [3]Cast Spell");
            
            String combatchoice = System.console().readLine();

            if (combatchoice.equals("1"))
            {                
                System.out.println("\n");
                System.out.println("'Time to kick this guys butt!!' " + heroFighting.getCharacterName() + " the "
                        + heroFighting.getHeroName() + " shouts.");

                System.out.println(heroFighting.getCharacterName() + " used the " + heroFighting.heroWeapon.getattackType()
                        + " " + heroFighting.heroWeapon.getweaponName() + ".");
                System.out.println("He did " + heroFighting.damagePerTurn + " worth of damage to the " + monsterHeFights.getMonsterName());
                // monsterHeFights.setnumberOfHearts(monsterHeFights.getnumberOfHearts() - heroFighting.damagePerTurn);
                monsterHeFights.monsterIntakeDamage(heroFighting.damagePerTurn); //reduces the amount of health the monster has
                heroFighting.heroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                System.out.println("\n");  
                
                System.out.println(herofighting2.getCharacterName() + " used the " + herofighting2.heroWeapon.getattackType()
                        + " " + herofighting2.heroWeapon.getweaponName() + ".");
                System.out.println("He did " + herofighting2.damagePerTurn + " worth of damage to the " + monsterHeFights.getMonsterName());
                monsterHeFights.monsterIntakeDamage(herofighting2.damagePerTurn); //reduces the amount of health the monster has
                heroFighting.heroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
               
                if(monsterHeFights.getnumberOfHearts() > 0) {
                    System.out.println("\n");  
                    System.out.println("The " + monsterHeFights.getMonsterName() + " is preparing his own attack.");
                    System.out.println("\n");
                    System.out.println("Press ENTER to Continue");
                    System.console().readLine();
                    System.out.println("\n" + monsterHeFights.getMonsterName() + " attacks again, with the "+ monsterHeFights.getPrimaryWeapon().getweaponName());
                    int randomAttackDmg = randomAttack.nextInt(10) + 10;
                    heroFighting.addHealth(-randomAttackDmg);// TODO remove addhealth and make function for removehealth
                    System.out.println("Ouch, " + heroFighting.getCharacterName() + " shouts: ''AHHH!!''");
                    System.out.println("The " + monsterHeFights.getMonsterName() + " attacked " + heroFighting.getCharacterName() + " for " + randomAttackDmg + " damange.");
                    System.out.println("\n\n");
                }
            } 

            if (heroFighting.getHealth() < 0 || heroFighting.heroWeapon.numOfAllowedAttacks == 0) {
                if (this.heroFighting.getHealth() > 0) {
                    System.out.println(this.heroFighting.getCharacterName() + " the " + this.heroFighting.getHeroName() + " ran out of ammo.");
                }
                else {
                    System.out.println(this.heroFighting.getCharacterName() + " the " + this.heroFighting.getHeroName() + " ran out of health.");
                }
                System.out.println("The " + monsterHeFights.getMonsterName() + " hits " + heroFighting.getCharacterName() + " with one final blow.");

                if (this.monsterHeFights.getnumberOfHearts() >= 0) {
                    System.out.println("The " + monsterHeFights.getMonsterName() + " he was fighting is also fading.");
                    System.out.println("He sees the " + monsterHeFights.getMonsterName()+ " fall over dead next to him.");
                    System.out.println("The world fades to black as he wonders if this battle was worth it.");
                }
                else {
                    System.out.println("The world fades to black as he wonders how ended up down this dark path.");
                }
                System.out.println("GAME OVER!");
                System.exit(0x0);
            }

            if(combatchoice.equals("2") && heroFighting.getHealth() < 100) {
                System.out.println("\n\n");
                System.out.println(heroFighting.getHeroName() + " thinks to himself: 'Gotta keep defending myself.'");
                heroFighting.addHealth(25); 
                heroFighting.heroWeapon.numOfAllowedAttacks = heroFighting.heroWeapon.getattackCounter(); 
                System.out.println(heroFighting.getCharacterName() + " has blocked all attacks, received 25 health, and another "
                    + heroFighting.heroWeapon.getweaponName());
                System.out.println("Press ENTER to Continue");
                System.console().readLine();
            }

            if (combatchoice.equals("3") && heroFighting.getHealth() > 0) {
                int spellIndex = 0;
                for (ISpell spell : heroFighting.getHeroSpellChoices()) {
                    System.out.println("["+spellIndex+"] " + spell.getSpellName() + "\n");
                    spellIndex++;
                }
                Integer choiceSpellIndex = Integer.parseInt(System.console().readLine());

                ISpell chosenSpell = heroFighting.getHeroSpellChoices().get(choiceSpellIndex);
                chosenSpell.spellWarningMessage();

                System.out.println("Does the hero want to continue");
                System.out.println("[Y]Continue\n[N]Go back");
                String choiceSpellContinue;
                choiceSpellContinue = System.console().readLine();
                if (choiceSpellContinue.equals("Y") || choiceSpellContinue.equals("y")){
                    if (chosenSpell instanceof IRestoreSpell) {
                        ((IRestoreSpell) chosenSpell).restoreHealth(heroFighting);
                    }
                    if (chosenSpell instanceof IDamageEnemy) {
                        ((IDamageEnemy) chosenSpell).damageEnemy(monsterHeFights);
                    }
                
                } else{
                    // Redo question    
                }
            }
        }
        System.out.println("\n\n");
        System.out.println("The " + monsterHeFights.getMonsterName() + " has been defeated");
        System.out.println("\n");
        System.out.println("Press ENTER to Continue");
        System.console().readLine();
        System.out.println("\n\n");
        System.out.println("\n\n");
    }
} 

