package gamesupport;
public class Program {

public static void main(String[] args)
{
    // WJT: Leave comments like this at points where you get stuck and need me to take a look
    //Begining of game - scene 1 
    
    System.out.println ("========================================");
    System.out.println ("----------A-WORLD-OF-FATE----------");
    System.out.println ("========================================");
    
    System.out.println("Welcome to your demise! >:D");
    System.out.println("Try to survive as long as you can you wretched humans!");
    System.out.println("Press Enter to Continue!");
    System.console().readLine();
    System.out.println("Choose Your Character \n Each character has differnt abilities so choose wisely.");
    System.out.println("[1]Wizard");
    System.out.println("[2]Ninja");
    System.out.println("[3]Vampire Hunter");
    System.out.println("[4]Soldier");
    System.out.println("[5]Superhero");
    System.out.println("[6]Just some guy");            
    Weapon secondaryWeapon = new Weapon(0, 8, "Garlic", "Holy");
    
    SuperHero hero1;          
    String choice;
    
    choice = System.console().readLine();
    
    switch (choice)
    {
        case "1":
            System.out.println("Wizard");
            hero1 = new SuperHero("Wizard",  new Weapon(8, 8, "Staff", "Magic"), secondaryWeapon, 100,"Alex", 45);
            break;
        case "2":
            System.out.println("Ninja");
            hero1 = new SuperHero("Ninja",  new Weapon(10, 10, "Ninja Star", "Combat"), secondaryWeapon, 100, "Jaime", 35);
            break;
        case "3":
            System.out.println("Vampire Hunter");
            hero1 = new SuperHero("Vampire Hunter", new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), secondaryWeapon, 100,"Angel", 25);
            break;
        case "4":
            System.out.println("Soldier");
            hero1 = new SuperHero("Soldier", new Weapon(6, 6, "Revolver", "Pistol Whip"), secondaryWeapon, 100, "Miguel", 75);
            break;
        case "5":
            System.out.println("SuperHero");
            hero1 = new SuperHero("SuperHero", new Weapon(20, 20, "Super Genetics", "Stamina"), secondaryWeapon,100,"Emanuel", 20);
            break;
        default:
            hero1 = new SuperHero("Just some guy",  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), secondaryWeapon, 100, "Warren", 100);
            System.out.println("Other");
            break;        
    }
    System.out.println("You have selected " + hero1.HeroName + "\n \nYour name is " + hero1.characterName + "\n \n");
    System.out.println( hero1.characterName + " wakes up in a body bag and notices that he is in a dark forest, all he knows is that he must escape, even if it cost’s his life.\nThe air is full of fog and all he sees is nothing but dead animals and human body parts scattered across the branches of the trees. \n" + hero1.characterName + " is going to have to figure out a way of this death maze.");
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
            System.out.println(hero1.characterName + " left him behind \n");
            break;
        case "2":
            System.out.println(hero1.characterName + " decided to carry the poor thing \n");
            break;
    }
     
    if (choiceTeamMate=="2")
    {
        System.out.println("While he was carrying him,\nAn unknown spear came and wasn't able to dodge it fast enough");
        System.out.println("GAME OVER");
        System.exit(0x0);

    } else {
        System.out.println("\n");
        System.out.println("Press Enter To Continue");

        System.console().readLine();
    }
    
    if (choiceTeamMate=="1")
    {
        
         //for (int countGoblins = 1; countGoblins != 0; countGoblins--) {
            //System.out.println("There is " + countGoblins + " monster left");
            Encounter fightGoblinOneAtAtime = new Encounter(hero1, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
            fightGoblinOneAtAtime.StartFighting();
            
            System.out.println("Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \nSomething has to be up with this forest. \nHe starts wandering in the forest, everything starts looking the same. \nHe powers through because he remembers that he has something to fight for. \nHe starts to see stone structures in the distance. \nHe walks towards them.");
            System.out.println("\n");
            System.out.println("Press Enter To Continue");
            System.console().readLine();
        }

        System.out.println("After exiting the forest, his shoes crunched to the sound of bones and gravel.\n " + hero1.characterName + " witnessed the dead become animated crawling out of their graves. \nThe graveyard had become a corpse party. \nDetermined with the fierce will to live, " + hero1.characterName + " ready your weapon for the next encounter.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();

        System.out.println("There's a fork in the road");
        System.out.println("[1]Go left");
        System.out.println("[2]Go right");
        
        
        String choiceForkInTheRoad;

        choiceForkInTheRoad = System.console().readLine();
        switch (choiceForkInTheRoad)
        { 
        case "1":
            System.out.println(hero1.characterName + " stumbled against a zombie.");
            break;
        case "2":
            System.out.println(hero1.characterName + " got wrecked by numerous forces.");
            System.exit(0x0);
            break;
        }
        Encounter fightzombie = new Encounter(hero1, new Monster("Zombie", 100,"rauggghh", "grey", new Weapon( 3,3, "Bite","physical"))); 
        fightzombie.StartFighting();
        // System.out.println("\n");
        // System.out.println("Press Enter to Continue");
        // System.console().readLine();
        System.out.println("After killing the zombie, He rushes through the endless forces of the undead. \nTired and fatigued, he decides to take a nap in a coffin which is out of sight of the undead. \nHe closes his eyes seeing the sunset. \nHe’s disturbed by the sound of chattering teeth. \nHe sits up and looks through the empty eye sockets of a human, a skeleton.");
        Encounter fightskeleton = new Encounter(hero1, new Monster( "Skeleton",100, "crackel", "white", new Weapon(4,4, "Bone", "physical")));
        fightskeleton.StartFighting();
        System.out.println("The last hit disassembled all the joints of the skeleton. It falls apart laughing. He begins running to the exit. \n");
        System.out.println("\n");
        //System.out.println("Press Enter To Continue");
        //System.console().readLine();

        System.out.println("\nThere is another fork in the road");
        System.out.println("[1]Go left");
        System.out.println("[2]Go right");
        
        String choiceForkInTheRoad2;

        choiceForkInTheRoad2 = System.console().readLine();
        switch (choiceForkInTheRoad2)
        { 
        case "1":
            System.out.println(hero1.characterName + " Death by eternal slumber spell.");
            System.exit(0x0);
            break;
        case "2":
            System.out.println(hero1.characterName + " Boss fight: Ghost.");
            break;
        }
        System.out.println("He runs out of the graveyard." + hero1.characterName + " stops to close his eyes and pray to the gods for their guidance. He feels a cold chill pass through his body." + hero1.characterName +
        " opens his eyes and sees his own body lying on the floor. A humanoid figure in the form of mist is trying to take his soul away from his body." + hero1.characterName + "s determined soul chases the entity to confront the ghost.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine();
        Encounter fightghost = new Encounter(hero1,new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss"," Mental")));
        fightghost.StartFighting();
        System.out.println("The final hit makes the ghost realize " + hero1.characterName + " is worthy of living and fades away from his sight. " + hero1.characterName + " returns to his body and continues forward.");
        System.out.println("\n");
        System.out.println("Press Enter To Continue");
        System.console().readLine(); //im so bored of this

        System.out.println ("================================================");
        System.out.println ("----------WINNER-WINNER-CHICKEN-DINNER----------");
        System.out.println ("================================================");                

        // WJT:I didn't show you this yet - but because you are using System; on the first 
        // line of this program, you get Random from the System library - so you could 

        
        /*
        System.Random random = new System.Random(); 
        int num = random.Next(10,50); //makes random number between 10 and 50
        System.out.println(num); //writes the random number (Monster attack)
        int health = 100; //our example health would be 100
        num =- health; //subracts the mosnter attck from our health
        System.out.println(health); //Writes our health after attck
        */

        
        //scene 1 compete
        // for (int countGoblins = 1; countGoblins != 0; countGoblins--) {
        //     System.out.println("There are " + countGoblins + " monsters left");
        //      Encounter fightGoblinOneAtAtime = new Encounter(hero1, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
        //     fightGoblinOneAtAtime.StartFighting();
}
}
