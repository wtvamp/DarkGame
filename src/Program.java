import gamesupport.Encounter;
import gamesupport.Menu;
import gamesupport.Monster;
import gamesupport.PartnerMenu;
import gamesupport.SuperHero;
import gamesupport.Weapon;
import gamesupport.Vehic;

public class Program {

public static void main(String[] args){
{
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
    //if statement
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
            
            System.out.println("Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \nSomething has to be up with this forest. \nHe starts wandering in the forest, everything starts looking the same. \nHe powers through because he remembers that he has something to fight for. \nHe starts to see stone structures in the distance. \nHe walks towards them.");
            System.out.println("\n");
            System.out.println("Press Enter To Continue");
            System.console().readLine();
        }

        System.out.println("After exiting the forest, his shoes crunched to the sound of bones and gravel.\n " + hero.characterName + " witnessed the dead become animated crawling out of their graves. \nThe graveyard had become a corpse party. \nDetermined with the fierce will to live, " + hero.characterName + " ready your weapon for the next encounter.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();

        System.out.println("There's a fork in the road");
        System.out.println("[1]Go left");
        System.out.println("[2]Go right");
        
        
        String choiceForkInTheRoad2;

        choiceForkInTheRoad2 = System.console().readLine();
        switch (choiceForkInTheRoad2)
        { 
        case "1":
            System.out.println(hero.characterName + " has found a mysterious Television floating");
            break;
        case "2":
            System.out.println(hero.characterName + " gets bitten by a Zombie");
            break;
        }
                   
        if (choiceForkInTheRoad2.equals("1")){
            System.out.println(hero.characterName + " needs to rest so " + sidekick.characterName + " has to step in");
            choiceForkInTheRoad2 = System.console().readLine();
            Encounter fightTV = new Encounter(hero, sidekick, new Monster("Television", 100, "ZZzzzZ *Static*", "White", new Weapon(3, 3, "Electrecution", "Electric")));
            fightTV.StartFighting();
        }
        
        if (choiceForkInTheRoad2.equals("2")){
            System.out.println("GAMEOVER you died to dysentry");
        }

        String choiceForkInTheRoad;
        choiceForkInTheRoad = System.console().readLine();

        switch (choiceForkInTheRoad)
        {
        case "1":
            System.out.println(hero.characterName + " stumbled against a zombie.");
            break;
        case "2":
            System.out.println(hero.characterName + " got wrecked by numerous forces.");
            System.exit(0x0);
            break;
        }
        Encounter fightzombie = new Encounter(hero, sidekick, new Monster("Zombie", 100,"rauggghh", "grey", new Weapon( 3,3, "Bite","physical"))); 
        fightzombie.StartFighting();

        System.out.println("After killing the zombie, He rushes through the endless forces of the undead. \nTired and fatigued, he decides to take a nap in a coffin which is out of sight of the undead. \nHe closes his eyes seeing the sunset. \nHe’s disturbed by the sound of chattering teeth. \nHe sits up and looks through the empty eye sockets of a human, a skeleton.");
        Encounter fightskeleton = new Encounter(hero, sidekick, new Monster( "Skeleton",100, "crackel", "white", new Weapon(4,4, "Bone", "physical")));
        fightskeleton.StartFighting();
        System.out.println("The last hit disassembled all the joints of the skeleton. It falls apart laughing. He begins running to the exit. \n");
        System.out.println("\n");

        System.out.println("\nThere is another fork in the road");
        System.out.println("[1]Go left");
        System.out.println("[2]Go right");
        
        System.out.println("He runs out of the graveyard." + hero.characterName + " stops to close his eyes and pray to the gods for their guidance. He feels a cold chill pass through his body." + hero.characterName +
        " opens his eyes and sees his own body lying on the floor. A humanoid figure in the form of mist is trying to take his soul away from his body." + hero.characterName + "s determined soul chases the entity to confront the ghost.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();
        Encounter fightghost = new Encounter(hero, sidekick,new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss"," Mental")));
        fightghost.StartFighting();
        System.out.println("The final hit makes the ghost realize " + hero.characterName + " is worthy of living and fades away from his sight. " + hero.characterName + " returns to his body and continues forward.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();

        System.out.println ("================================================");
        System.out.println ("----------WINNER-WINNER-CHICKEN-DINNER----------");
        System.out.println ("================================================");                
        }       
    }
}
