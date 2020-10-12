import java.util.ArrayList;
import gamesupport.Encounter;
import gamesupport.IVehicle;
import gamesupport.Menu;
import gamesupport.Monster;
import gamesupport.PartnerMenu;
import gamesupport.SuperHero;
import gamesupport.Vehicle;
import gamesupport.Weapon;
import gamesupport.SceneGenerator;

public class Program {

    public static void main(String[] args){
        final String PRESSENTER = "Press enter to continue...";
        final String CLASS1 = "Wizard";
        final String CLASS2 = "Ninja";
        final String CLASS3 = "Vampire Hunter";
        final String CLASS4 = "Soldier";
        final String CLASS5 = "Superhero";
        final String CLASS6 = "Just some guy";
        
        System.out.println ("========================================");
        System.out.println ("----------A-WORLD-OF-FATE----------");
        System.out.println ("========================================");
        
        System.out.println("Welcome to your demise! >:D");
        System.out.println("Try to survive as long as you can you wretched humans!");
        System.out.println("Press Enter to Continue!");
        System.console().readLine();
        System.out.println("Choose Your Character \nEach character has different abilities so choose wisely.");
        System.out.println("[1]"+CLASS1);
        System.out.println("[2]"+CLASS2);
        System.out.println("[3]"+CLASS3);
        System.out.println("[4]"+CLASS4);
        System.out.println("[5]"+CLASS5);
        System.out.println("[6]"+CLASS6);            
        Weapon secondaryWeapon = new Weapon(0, 8, "Garlic", "Holy");
        
        SuperHero hero1;          
        String choice;
        SuperHero hero2;
        String choice2;
        
        choice = System.console().readLine();
        
        switch (choice)
        {
            case "1":
                hero1 = new SuperHero(CLASS1,  new Weapon(8, 8, "Staff", "Magic"), secondaryWeapon, 100,"Alex", 45);
                break;
            case "2":
                hero1 = new SuperHero(CLASS2,  new Weapon(10, 10, "Ninja Star", "Combat"), secondaryWeapon, 100, "Jaime", 35);
                break;
            case "3":
                hero1 = new SuperHero(CLASS3, new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), secondaryWeapon, 100,"Angel", 25);
                break;
            case "4":
                hero1 = new SuperHero(CLASS4, new Weapon(6, 6, "Revolver", "Pistol Whip"), secondaryWeapon, 100, "Miguel", 75);
                break;
            case "5":
                hero1 = new SuperHero(CLASS5, new Weapon(20, 20, "Super Genetics", "Stamina"), secondaryWeapon,100,"Emanuel", 20);
                break;
            default:
                hero1 = new SuperHero(CLASS6,  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), secondaryWeapon, 100, "Warren", 100);
                break;        
        }
        System.out.println("You have selected " + hero1.HeroName + "\n \nYour name is " + hero1.characterName + "\n \n");
        
        //2nd character
        System.out.println("Select " + hero1.HeroName + "'s partner");
        System.out.println("[1]"+CLASS1);
        System.out.println("[2]"+CLASS2);
        System.out.println("[3]"+CLASS3);
        System.out.println("[4]"+CLASS4);
        System.out.println("[5]"+CLASS5);
        System.out.println("[6]"+CLASS6);    
        choice2 = System.console().readLine();
        
        switch (choice2)
        {
            case "1":
                System.out.println(CLASS1);
                hero2 = new SuperHero(CLASS1,  new Weapon(8, 8, "Staff", "Magic"), secondaryWeapon, 100,"Alex", 45);
                break;
            case "2":
                System.out.println(CLASS2);
                hero2 = new SuperHero(CLASS2,  new Weapon(10, 10, "Ninja Star", "Combat"), secondaryWeapon, 100, "Jaime", 35);
                break;
            case "3":
                System.out.println(CLASS3);
                hero2 = new SuperHero(CLASS3, new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), secondaryWeapon, 100,"Angel", 25);
                break;
            case "4":
                System.out.println(CLASS4);
                hero2 = new SuperHero(CLASS4, new Weapon(6, 6, "Revolver", "Pistol Whip"), secondaryWeapon, 100, "Miguel", 75);
                break;
            case "5":
                System.out.println(CLASS5);
                hero2 = new SuperHero(CLASS5, new Weapon(20, 20, "Super Genetics", "Stamina"), secondaryWeapon,100,"Emanuel", 20);
                break;
            default:
                hero2 = new SuperHero(CLASS6,  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), secondaryWeapon, 100, "Warren", 100);
                System.out.println(CLASS6);
                break;        
        }
        System.out.println("Your partner is " + hero2.characterName + "\n \nAnd he is a " + hero2.HeroName + "\n \n");
        //End
        if (choice.equals(choice2)) {
            System.out.println("You got your own doppleganger to kill you and replaced you");
            System.exit(0);
        }
        
        //first scene
        String firstSceneDesc = hero1.HeroName + " wakes up in a body bag and notices that he is in a dark forest";
        firstSceneDesc += " all he knows is that he must escape, even if it cost’s his life.\n";
        firstSceneDesc += " The air is full of fog and all he sees is nothing but dead animals and ";
        firstSceneDesc += " human body parts scattered across the branches of the trees. \n";
        firstSceneDesc += hero1.characterName;
        firstSceneDesc += " is going to have to figure out a way of this death maze.";


        String firstSceneChoice = "As he was walking, he stumbled across a teammate that is severely injured.\nWhat should he do?\n";
        ArrayList<String> firstScenelistOfChoices = new ArrayList<>();
            firstScenelistOfChoices.add("[1]Leave him\n");
            firstScenelistOfChoices.add("[2]Carry him\n");
        ArrayList<String> firstSceneListOfResponses = new ArrayList<>();
            firstSceneListOfResponses.add(hero1.characterName + " left him behind \n");
            firstSceneListOfResponses.add(hero1.characterName + " decided to carry the poor thing \n");
        Monster firstSceneMonster = new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical"));

        SceneGenerator firstScene = new SceneGenerator(firstSceneDesc, firstSceneChoice, firstScenelistOfChoices, firstSceneListOfResponses, hero1, hero2, firstSceneMonster);
        firstScene.printStoryline();
        String firstSceneChoiceAnswer = firstScene.makeChoice(); 
        
        
        if (firstSceneChoiceAnswer.equals("2"))
        {
            System.out.println("While he was carrying him,\nAn unknown spear came and wasn't able to dodge it fast enough");
            System.out.println("GAME OVER");
            System.exit(0);
        } else {
            System.out.println("A Spear is thrown at him but he was able to dodge it. A Goblin has appeared\n");
            System.out.println("\n");
            System.out.println(PRESSENTER);
            System.console().readLine();
            firstScene.runEncounter();
            System.out.println("Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \n");
            System.out.println("Something has to be up with this forest.  He starts wandering in the forest, everything starts \n");
            System.out.println("looking the same.  He powers through because he remembers that he has something to fight for. \n");
            System.out.println("He starts to see stone structures in the distance. \n\nHe walks towards them.");
            System.out.println("\n");
            System.out.println(PRESSENTER);
            System.console().readLine();
        }
        //first end

        //Second Start
        String secondSceneDes = "After exiting the forest, his shoes crunched to the sound of bones and gravel.\n "; 
        secondSceneDes += hero1.characterName + " witnessed the dead become animated crawling out of their graves. \n";
        secondSceneDes += " the graveyard had become a corpse party. \nDetermined with the fierce will to live, ";
        secondSceneDes += hero1.characterName + " ready your weapon for the next encounter.\n";
        IVehicle mysteryVehicle = new Vehicle(hero1);
        mysteryVehicle.drive();
        mysteryVehicle.brake();
        mysteryVehicle.turn();
        mysteryVehicle.honk();        
        mysteryVehicle.crash();

        String secondSceneChoice = "There's a fork in the road";
        
        ArrayList<String> secondScenelistOfChoices = new ArrayList<>();
            secondScenelistOfChoices.add("[1]Go left");
            secondScenelistOfChoices.add("[2]Go right");
        
        ArrayList<String> secondScenelistOfResponses = new ArrayList<>();
            secondScenelistOfResponses.add(hero1.characterName + " has found a mysterious Television floating");
            secondScenelistOfResponses.add(hero1.characterName + " gets bitten by a Zombie");
        
        Monster secondSceneMonster = new Monster("Television", 100, "ZZzzzZ *Static*", "White", new Weapon(3, 3, "Electrecution", "Electric"));
        SceneGenerator secondScene = new SceneGenerator(secondSceneDes, secondSceneChoice, secondScenelistOfChoices, secondScenelistOfResponses, hero1, hero2, secondSceneMonster);
        
        secondScene.printStoryline();

        String secondSceneChoiceAnswer = secondScene.makeChoice();

        if (secondSceneChoiceAnswer.equals("1")){
            System.out.println(hero1.characterName + " needs to rest so " + hero2.characterName + " has to step in");
            secondScene.runEncounter();
        } else {
            System.out.println("GAMEOVER you died to dysentry");
        }
        //Second End

        //Third Start
        String thirdSceneDes = "He runs out of the graveyard." + hero1.characterName;
        thirdSceneDes += " stops to close his eyes and pray to the gods for their guidance. ";
        thirdSceneDes += "He feels a cold chill pass through his body." + hero1.characterName + " ";
        thirdSceneDes += "opens his eyes and sees his own body lying on the floor. A humanoid ";
        thirdSceneDes += "figure in the form of mist is trying to take his soul away from his body. ";
        thirdSceneDes += hero1.characterName + "s determined soul chases the entity to confront the ghost.";
        thirdSceneDes += "\n";

        String thirdSceneChoice = ("\nThere is another fork in the road");        
        ArrayList<String> thirdScenelistOfChoices = new ArrayList<>();
            thirdScenelistOfChoices.add("[1]Go left");
            thirdScenelistOfChoices.add("[2]Go right");

        ArrayList<String> thirdScenelistOfResponses = new ArrayList<>();
            thirdScenelistOfResponses.add(hero1.characterName + "A ghost has appeared");
            thirdScenelistOfResponses.add(hero1.characterName + "A death spell has been summon upon thou");

        Monster ghost = new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss"," Mental"));
        SceneGenerator thirdScene = new SceneGenerator(thirdSceneDes, thirdSceneChoice, thirdScenelistOfChoices, thirdScenelistOfResponses, hero1, hero2, ghost);
        thirdScene.printStoryline();
        
        String thirdSceneChoiceAnswer = thirdScene.makeChoice();

        if (thirdSceneChoiceAnswer.equals("1")) {
            thirdScene.runEncounter();
            System.out.println("The final hit makes the ghost realize " + hero1.characterName + " ");
            System.out.println("is worthy of living and fades away from his sight. " + hero1.characterName + " ");
            System.out.println("returns to his body and continues forward.");
            System.out.println("\n");
            System.out.println("Press Enter To Continue");

            System.out.println ("================================================");
            System.out.println ("----------WINNER-WINNER-CHICKEN-DINNER----------");
            System.out.println ("================================================");   
        } else {
            System.exit(0x0);
        } 
    }
}