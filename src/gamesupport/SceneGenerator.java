package gamesupport;

import gamesupport.SuperHero; 

public class SceneGenerator {
    
    int minScene = 1;
    int maxScene = 3;
    //Generate random double value from 50 to 100 
    int randomScene = (int)(Math.random() * (maxScene - minScene + 1) + minScene);{
    SuperHero hero;
    SuperHero sidekick; 
    Monster monsterEncounter; 
    //String choiceQuestion; 
    //String choiceAnswer;
    String randomScene;
        
    randomScene = System.console().readLine();

    
    // Scene 1 
        System.out.println(hero.characterName + " wakes up in a body bag and notices that he is in a dark forest, all he knows is that he must escape, even if it cost’s his life.\nThe air is full of fog and all he sees is nothing but dead animals and human body parts scattered across the branches of the trees. \n" + hero.characterName + " is going to have to figure out a way of this death maze.");
        System.out.println("\n");
        System.out.println("Press ENTER to continue \n");

        System.out.println("As he was walking, he stumbled across a teammate that is severely injured.");
        System.out.println("What should he do? \n");
        System.out.println("[1]Leave him");
        System.out.println("[2]Carry him");
        
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
         
        if (choiceTeamMate.equals("2"))
        {
            System.out.println("While he was carrying him,\nAn unknown spear came and wasn't able to dodge it fast enough");
            System.out.println("GAME OVER");
            System.exit(0);
    
        } else {
            System.out.println("\n");
            System.out.println("Press Enter To Continue");
    
            System.console().readLine();
        }
        
        if (choiceTeamMate.equals("1"))
        {
                Encounter fightGoblinOneAtAtime = new Encounter(hero, sidekick, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
                fightGoblinOneAtAtime.StartFighting();
    //Scene 2 
        System.out.println("After exiting the forest, his shoes crunched to the sound of bones and gravel.\n " + hero.characterName + " witnessed the dead become animated crawling out of their graves. \nThe graveyard had become a corpse party. \nDetermined with the fierce will to live, " + hero.characterName + " ready your weapon for the next encounter.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();
    //Scene 3 
        System.out.println("He runs out of the graveyard." + hero.characterName + " stops to close his eyes and pray to the gods for their guidance. He feels a cold chill pass through his body." + hero.characterName +
     " opens his eyes and sees his own body lying on the floor. A humanoid figure in the form of mist is trying to take his soul away from his body." + hero.characterName + "s determined soul chases the entity to confront the ghost.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();
        
        }
    }
}



