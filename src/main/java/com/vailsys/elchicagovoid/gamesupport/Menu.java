package com.vailsys.elchicagovoid.gamesupport;

import com.vailsys.elchicagovoid.gamesupport.magicspellfolder.FireSpell;
import com.vailsys.elchicagovoid.gamesupport.magicspellfolder.HealingSpell;

public class Menu {
    private String choice;
    
    public void printMenu() {
        
        System.out.println("[1]Wizard");
        System.out.println("[2]Ninja");
        System.out.println("[3]Vampire Hunter");
        System.out.println("[4]Soldier");
        System.out.println("[5]Superhero");
        System.out.println("[6]Just some guy");  
        choice = System.console().readLine();
    }

    public SuperHero chooseHero() {
        SuperHero hero;
        switch (choice)
        {
            case "1":
                hero = new SuperHero("Wizard",  new Weapon(8, 8, "Staff", "Magic"), new Weapon(4, 4, "Potion", "Magic"), 100,"Alex", 45);
                hero.getHeroSpellChoices().add(new HealingSpell());
                hero.getHeroSpellChoices().add(new FireSpell());
                break;
            case "2":
                hero = new SuperHero("Ninja",  new Weapon(10, 10, "Ninja Star", "Combat"), new Weapon(2, 2, "Sword", "Physical"), 100, "Jaime", 35);
                hero.getHeroSpellChoices().add(new HealingSpell());
                break;
            case "3":
                hero = new SuperHero("Vampire Hunter", new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), new Weapon(5, 5, "Garlic", "Holy"), 100,"Angel", 25);
                hero.getHeroSpellChoices().add(new HealingSpell());
                break;
            case "4":
                hero = new SuperHero("Soldier", new Weapon(6, 6, "Revolver", "Pistol Whip"), new Weapon(1, 1, "Grenade", "Explosive"), 100, "Miguel", 75);
                hero.getHeroSpellChoices().add(new HealingSpell());
                break;
            case "5":
                hero = new SuperHero("SuperHero", new Weapon(20, 20, "Super Genetics", "Stamina"), new Weapon(3, 3, "People's eyebrow", "The people's attack"),100,"Emanuel", 20);
                hero.getHeroSpellChoices().add(new HealingSpell());
                break;
            default:
                hero = new SuperHero("Just some guy",  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), new Weapon(6, 6, "Beer", "Drunk"), 100, "Warren", 100);
                hero.getHeroSpellChoices().add(new HealingSpell());
                break;        
        }
        System.out.println("\n\nYou have selected " + hero.characterName + " the " + hero.HeroName + "\n\n");
        return hero;
    }

}
