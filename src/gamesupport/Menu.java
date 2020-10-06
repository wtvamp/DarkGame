package gamesupport;

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
                System.out.println("Wizard");
                hero = new SuperHero("Wizard",  new Weapon(8, 8, "Staff", "Magic"), new Weapon(4, 4, "Potion", "Magic"), 100,"Alex", 45);
                break;
            case "2":
                System.out.println("Ninja");
                hero = new SuperHero("Ninja",  new Weapon(10, 10, "Ninja Star", "Combat"), new Weapon(2, 2, "Sword", "Physical"), 100, "Jaime", 35);
                break;
            case "3":
                System.out.println("Vampire Hunter");
                hero = new SuperHero("Vampire Hunter", new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), new Weapon(5, 5, "Garlic", "Holy"), 100,"Angel", 25);
                break;
            case "4":
                System.out.println("Soldier");
                hero = new SuperHero("Soldier", new Weapon(6, 6, "Revolver", "Pistol Whip"), new Weapon(1, 1, "Grenade", "Explosive"), 100, "Miguel", 75);
                break;
            case "5":
                System.out.println("SuperHero");
                hero = new SuperHero("SuperHero", new Weapon(20, 20, "Super Genetics", "Stamina"), new Weapon(3, 3, "People's eyebrow", "The people's attack"),100,"Emanuel", 20);
                break;
            default:
                hero = new SuperHero("Just some guy",  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), new Weapon(6, 6, "Beer", "Drunk"), 100, "Warren", 100);
                System.out.println("Other");
                break;        
        }
        System.out.println("You have selected " + hero.HeroName + "\n \nYour name is " + hero.characterName + "\n \n");
        return hero;
    }

}
