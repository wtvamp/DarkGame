package com.vailsys.elchicagovoid;

import java.util.Collections;

import com.vailsys.elchicagovoid.gamesupport.Menu;
import com.vailsys.elchicagovoid.gamesupport.Monster;
import com.vailsys.elchicagovoid.gamesupport.PartnerMenu;
import com.vailsys.elchicagovoid.gamesupport.RandomScenes;
import com.vailsys.elchicagovoid.gamesupport.Scene;
import com.vailsys.elchicagovoid.gamesupport.SceneGenerator;
import com.vailsys.elchicagovoid.gamesupport.SuperHero;
import com.vailsys.elchicagovoid.gamesupport.Weapon;

/**
 * Dark Game!
 */
public final class App {
    private static final String PRESS_ENTER = "Press enter to continue...";
    private static final String FILE_LOCATION = "src/main/java/com/vailsys/elchicagovoid/scenes/scenes.txt";

    private App() {
    }

    /**
     * Welcome to a world of fate...
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        //Begining of game - scene 1 
        SuperHero hero;   
        SuperHero sidekick; 
        System.out.println ("========================================");
        System.out.println ("----------A-WORLD-OF-FATE----------");
        System.out.println ("========================================");
        
        System.out.println("Welcome to your demise! >:D");
        System.out.println("Try to survive as long as you can you wretched humans!");
        System.out.println(PRESS_ENTER);
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

        RandomScenes randomScenes = new RandomScenes();

        randomScenes.loadScenesFromTextFile(FILE_LOCATION);

        Collections.shuffle(randomScenes.getScenes());

        for (Scene randomScene : randomScenes.getScenes()) {
            SceneGenerator sceneGen = new SceneGenerator(
                randomScene, 
                hero, 
                sidekick, 
                new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical"))
            );

            sceneGen.printStoryline();
            sceneGen.makeChoice();
            sceneGen.choiceResponse();
        }
    }
}