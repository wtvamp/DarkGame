package com.vailsys.elchicagovoid;

import java.util.ArrayList;

import com.vailsys.elchicagovoid.gamesupport.Encounter;
import com.vailsys.elchicagovoid.gamesupport.IVehicle;
import com.vailsys.elchicagovoid.gamesupport.Menu;
import com.vailsys.elchicagovoid.gamesupport.Monster;
import com.vailsys.elchicagovoid.gamesupport.PartnerMenu;
import com.vailsys.elchicagovoid.gamesupport.SuperHero;
import com.vailsys.elchicagovoid.gamesupport.Vehicle;
import com.vailsys.elchicagovoid.gamesupport.Weapon;
import com.vailsys.elchicagovoid.gamesupport.SceneGenerator;

/**
 * Hello world!
 */
public final class App {
    private final static String PRESSENTER = "PRESSENTER";
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // WJT: Leave comments like this at points where you get stuck and need me to take a look
        //Begining of game - scene 1 
        SuperHero hero;   
        SuperHero sidekick; 
        System.out.println ("========================================");
        System.out.println ("----------A-WORLD-OF-FATE----------");
        System.out.println ("========================================");
        
        System.out.println("Welcome to your demise! >:D");
        System.out.println("Try to survive as long as you can you wretched humans!");
        System.out.println("Press Enter to Continue!");
        System.console().readLine();    
        
        Menu heroChoice = new Menu();
        PartnerMenu partnerChoice = new PartnerMenu();

        System.out.println("Please choose your character to start:");
        heroChoice.printMenu();
        hero = heroChoice.chooseHero();

        System.out.println("Please choose a sidekick to accompany you on this journey:");
        partnerChoice.printMenu();
        sidekick = partnerChoice.chooseHero();

        if(hero.equals(sidekick)){
            System.out.println("You got your own doppleganger to kill you and replaced you");
            System.console().readLine();
            System.exit(0);
        }
        
        String choiceTeamMate;

        choiceTeamMate = System.console().readLine();
        
        switch (choiceTeamMate)
        { 
            case "1":
                System.out.println(hero.characterName + " left him behind \n");
                break;
            case "2":
                System.out.println(hero.characterName + " decided to carry the poor thing \n");
                break;
        }
                //first scene
        String firstSceneDesc = hero.HeroName + " wakes up in a body bag and notices that he is in a dark forest";
        firstSceneDesc += " all he knows is that he must escape, even if it cost’s his life.\n";
        firstSceneDesc += " The air is full of fog and all he sees is nothing but dead animals and ";
        firstSceneDesc += " human body parts scattered across the branches of the trees. \n";
        firstSceneDesc += hero.characterName;
        firstSceneDesc += " is going to have to figure out a way of this death maze.";


        String firstSceneChoice = "As he was walking, he stumbled across a teammate that is severely injured.\nWhat should he do?\n";
        ArrayList<String> firstScenelistOfChoices = new ArrayList<>();
            firstScenelistOfChoices.add("[1]Leave him\n");
            firstScenelistOfChoices.add("[2]Carry him\n");
        ArrayList<String> firstSceneListOfResponses = new ArrayList<>();
            firstSceneListOfResponses.add(hero.characterName + " left him behind \n");
            firstSceneListOfResponses.add(hero.characterName + " decided to carry the poor thing \n");
        Monster firstSceneMonster = new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical"));

        SceneGenerator firstScene = new SceneGenerator(firstSceneDesc, firstSceneChoice, firstScenelistOfChoices, firstSceneListOfResponses, hero, sidekick, firstSceneMonster);
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
            System.out.println("Press Enter To Continue");
            System.console().readLine();
        }
        
        if (choiceTeamMate.equals("1"))
        {
            Encounter fightGoblinOneAtAtime = new Encounter(hero, sidekick, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
            fightGoblinOneAtAtime.StartFighting();
            
            System.out.println("Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \nSomething has to be up with this forest. \nHe starts wandering in the forest, everything starts looking the same. \nHe powers through because he remembers that he has something to fight for. \nHe starts to see stone structures in the distance. \nHe walks towards them.");
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
        secondSceneDes += hero.characterName + " witnessed the dead become animated crawling out of their graves. \n";
        secondSceneDes += " the graveyard had become a corpse party. \nDetermined with the fierce will to live, ";
        secondSceneDes += hero.characterName + " ready your weapon for the next encounter.\n";
        IVehicle mysteryVehicle = new Vehicle(hero);
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
            secondScenelistOfResponses.add(hero.characterName + " has found a mysterious Television floating");
            secondScenelistOfResponses.add(hero.characterName + " gets bitten by a Zombie");

        
        Monster secondSceneMonster = new Monster("Television", 100, "ZZzzzZ *Static*", "White", new Weapon(3, 3, "Electrecution", "Electric"));
        SceneGenerator secondScene = new SceneGenerator(secondSceneDes, secondSceneChoice, secondScenelistOfChoices, secondScenelistOfResponses, hero, sidekick, secondSceneMonster);
        
        secondScene.printStoryline();

        String secondSceneChoiceAnswer = secondScene.makeChoice();

        if (secondSceneChoiceAnswer.equals("1")){
            System.out.println(hero.characterName + " needs to rest so " + sidekick.characterName + " has to step in");
            secondScene.runEncounter();
        } else {
            System.out.println("GAMEOVER you died to dysentry");
        }
        //Second End

        //Third Start
        String thirdSceneDes = "He runs out of the graveyard." + hero.characterName;
        thirdSceneDes += " stops to close his eyes and pray to the gods for their guidance. ";
        thirdSceneDes += "He feels a cold chill pass through his body." + hero.characterName + " ";
        thirdSceneDes += "opens his eyes and sees his own body lying on the floor. A humanoid ";
        thirdSceneDes += "figure in the form of mist is trying to take his soul away from his body. ";
        thirdSceneDes += hero.characterName + "s determined soul chases the entity to confront the ghost.";
        thirdSceneDes += "\n";

        String thirdSceneChoice = ("\nThere is another fork in the road");        
        ArrayList<String> thirdScenelistOfChoices = new ArrayList<>();
            thirdScenelistOfChoices.add("[1]Go left");
            thirdScenelistOfChoices.add("[2]Go right");

        ArrayList<String> thirdScenelistOfResponses = new ArrayList<>();
            thirdScenelistOfResponses.add(hero.characterName + "A ghost has appeared");
            thirdScenelistOfResponses.add(hero.characterName + "A death spell has been summon upon thou");

        Monster ghost = new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss"," Mental"));
        SceneGenerator thirdScene = new SceneGenerator(thirdSceneDes, thirdSceneChoice, thirdScenelistOfChoices, thirdScenelistOfResponses, hero, sidekick, ghost);
        thirdScene.printStoryline();
        
        String thirdSceneChoiceAnswer = thirdScene.makeChoice();

        if (thirdSceneChoiceAnswer.equals("1")) {
            thirdScene.runEncounter();
            System.out.println("The final hit makes the ghost realize " + hero.characterName + " ");
            System.out.println("is worthy of living and fades away from his sight. " + hero.characterName + " ");
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