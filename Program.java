public class Program {
    
}
static void Main(string[] args)
{
    // WJT: Leave comments like this at points where you get stuck and need me to take a look
    //Begining of game - scene 1 
    
    Console.WriteLine ("========================================");
    Console.WriteLine ("----------A-WORLD-OF-FATE----------");
    Console.WriteLine ("========================================");
    
    Console.WriteLine("Welcome to your demise! >:D");
    Console.WriteLine("Try to survive as long as you can you wretched humans!");
    Console.WriteLine("Press Enter to Continue!");
    Console.ReadLine();
    Console.WriteLine("Choose Your Character \n Each character has differnt abilities so choose wisely.");
    Console.WriteLine("[1]Wizard");
    Console.WriteLine("[2]Ninja");
    Console.WriteLine("[3]Vampire Hunter");
    Console.WriteLine("[4]Soldier");
    Console.WriteLine("[5]Superhero");
    Console.WriteLine("[6]Just some guy");            
    Monster Goblinmonster = new Monster("Goblin", 100, "heeehe", "green", new Weapon(3, 3, "Goblin Spear", "Physical"));
    Weapon primaryWeapon = new Weapon(0, 3, "Cross", "Holy");
    Weapon secondaryWeapon = new Weapon(0, 8, "Garlic", "Holy");
    
    SuperHero hero1;          
    string choice;
    
    choice = Console.ReadLine();
    
    switch (choice)
    {
        case "1":
            Console.WriteLine("Wizard");
            hero1 = new SuperHero("Wizard",  new Weapon(8, 8, "Staff", "Magic"), secondaryWeapon, 100,"Alex", 45);
            break;
        case "2":
            Console.WriteLine("Ninja");
            hero1 = new SuperHero("Ninja",  new Weapon(10, 10, "Ninja Star", "Combat"), secondaryWeapon, 100, "Jaime", 35);
            break;
        case "3":
            Console.WriteLine("Vampire Hunter");
            hero1 = new SuperHero("Vampire Hunter", new Weapon(12, 12, "Hunter's Crossbow", "Arrow"), secondaryWeapon, 100,"Angel", 25);
            break;
        case "4":
            Console.WriteLine("Soldier");
            hero1 = new SuperHero("Soldier", new Weapon(6, 6, "Revolver", "Pistol Whip"), secondaryWeapon, 100, "Miguel", 75);
            break;
        case "5":
            Console.WriteLine("SuperHero");
            hero1 = new SuperHero("SuperHero", new Weapon(20, 20, "Super Genetics", "Stamina"), secondaryWeapon,100,"Emanuel", 20);
            break;
        default:
            hero1 = new SuperHero("Just some guy",  new Weapon(4, 4, "Skyrim Shout", "Sore throat"), secondaryWeapon, 100, "Warren", 100);
            Console.WriteLine("Other");
            break;        
    }
    Console.WriteLine("You have selected " + hero1.HeroName + "\n \nYour name is " + hero1.characterName + "\n \n");
    Console.WriteLine( hero1.characterName + " wakes up in a body bag and notices that he is in a dark forest, all he knows is that he must escape, even if it cost’s his life.\nThe air is full of fog and all he sees is nothing but dead animals and human body parts scattered across the branches of the trees. \n" + hero1.characterName + " is going to have to figure out a way of this death maze.");
    Console.WriteLine("\n");
    Console.WriteLine("Press ENTER to continue \n");

    Console.WriteLine("As he was walking, he stumbled across a teammate that is severely injured.");
    Console.WriteLine("What should he do? \n");
    Console.WriteLine("[1]Leave him");
    Console.WriteLine("[2]Carry him");
    
    string choiceTeamMate;

    choiceTeamMate = Console.ReadLine();
     
    switch (choiceTeamMate)
    { 
        case "1":
            Console.WriteLine(hero1.characterName + " left him behind \n");
            break;
        case "2":
            Console.WriteLine(hero1.characterName + " decided to carry the poor thing \n");
            break;
    }
     
    if (choiceTeamMate=="2")
    {
        Console.WriteLine("While he was carrying him,\nAn unknown spear came and wasn't able to dodge it fast enough");
        Console.WriteLine("GAME OVER");
        System.Environment.Exit(0x0);

    } else {
        Console.WriteLine("\n");
        Console.WriteLine("Press Enter To Continue");

        Console.ReadLine();
    }
    
    if (choiceTeamMate=="1")
    {
        
         //for (int countGoblins = 1; countGoblins != 0; countGoblins--) {
            //Console.WriteLine("There is " + countGoblins + " monster left");
            Encounter fightGoblinOneAtAtime = new Encounter(hero1, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
            fightGoblinOneAtAtime.StartFighting();
            
            Console.WriteLine("Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \nSomething has to be up with this forest. \nHe starts wandering in the forest, everything starts looking the same. \nHe powers through because he remembers that he has something to fight for. \nHe starts to see stone structures in the distance. \nHe walks towards them.");
            Console.WriteLine("\n");
            Console.WriteLine("Press Enter To Continue");
            Console.ReadLine();
        }

        Console.WriteLine("After exiting the forest, his shoes crunched to the sound of bones and gravel.\n " + hero1.characterName + " witnessed the dead become animated crawling out of their graves. \nThe graveyard had become a corpse party. \nDetermined with the fierce will to live, " + hero1.characterName + " ready your weapon for the next encounter.");
        Console.WriteLine("\n");
        Console.WriteLine("Press Enter To Continue");
        Console.ReadLine();

        Console.WriteLine("There's a fork in the road");
        Console.WriteLine("[1]Go left");
        Console.WriteLine("[2]Go right");
        
        
        string choiceForkInTheRoad;

        choiceForkInTheRoad = Console.ReadLine();
        switch (choiceForkInTheRoad)
        { 
        case "1":
            Console.WriteLine(hero1.characterName + " stumbled against a zombie.");
            break;
        case "2":
            Console.WriteLine(hero1.characterName + " got wrecked by numerous forces.");
            System.Environment.Exit(0x0);
            break;
        }
        Encounter fightzombie = new Encounter(hero1, new Monster("Zombie", 100,"rauggghh", "grey", new Weapon( 3,3, "Bite","physical"))); 
        fightzombie.StartFighting();
        // Console.WriteLine("\n");
        // Console.WriteLine("Press Enter to Continue");
        // Console.ReadLine();
        Console.WriteLine("After killing the zombie, He rushes through the endless forces of the undead. \nTired and fatigued, he decides to take a nap in a coffin which is out of sight of the undead. \nHe closes his eyes seeing the sunset. \nHe’s disturbed by the sound of chattering teeth. \nHe sits up and looks through the empty eye sockets of a human, a skeleton.");
        Encounter fightskeleton = new Encounter(hero1, new Monster( "Skeleton",100, "crackel", "white", new Weapon(4,4, "Bone", "physical")));
        fightskeleton.StartFighting();
        Console.WriteLine("The last hit disassembled all the joints of the skeleton. It falls apart laughing. He begins running to the exit. \n");
        Console.WriteLine("\n");
        //Console.WriteLine("Press Enter To Continue");
        //Console.ReadLine();

        Console.WriteLine("\nThere is another fork in the road");
        Console.WriteLine("[1]Go left");
        Console.WriteLine("[2]Go right");
        
        string choiceForkInTheRoad2;

        choiceForkInTheRoad2 = Console.ReadLine();
        switch (choiceForkInTheRoad2)
        { 
        case "1":
            Console.WriteLine(hero1.characterName + " Death by eternal slumber spell.");
            System.Environment.Exit(0x0);
            break;
        case "2":
            Console.WriteLine(hero1.characterName + " Boss fight: Ghost.");
            break;
        }
        Console.WriteLine("He runs out of the graveyard." + hero1.characterName + " stops to close his eyes and pray to the gods for their guidance. He feels a cold chill pass through his body." + hero1.characterName +
        " opens his eyes and sees his own body lying on the floor. A humanoid figure in the form of mist is trying to take his soul away from his body." + hero1.characterName + "s determined soul chases the entity to confront the ghost.");
        Console.WriteLine("\n");
        Console.WriteLine("Press Enter To Continue");
        Console.ReadLine();
        Encounter fightghost = new Encounter(hero1,new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss"," Mental")));
        fightghost.StartFighting();
        Console.WriteLine("The final hit makes the ghost realize " + hero1.characterName + " is worthy of living and fades away from his sight. " + hero1.characterName + " returns to his body and continues forward.");
        Console.WriteLine("\n");
        Console.WriteLine("Press Enter To Continue");
        Console.ReadLine(); //im so bored of this

        Console.WriteLine ("================================================");
        Console.WriteLine ("----------WINNER-WINNER-CHICKEN-DINNER----------");
        Console.WriteLine ("================================================");                

        // WJT:I didn't show you this yet - but because you are using System; on the first 
        // line of this program, you get Random from the System library - so you could 

        
        /*
        System.Random random = new System.Random(); 
        int num = random.Next(10,50); //makes random number between 10 and 50
        Console.WriteLine(num); //writes the random number (Monster attack)
        int health = 100; //our example health would be 100
        num =- health; //subracts the mosnter attck from our health
        Console.WriteLine(health); //Writes our health after attck
        */

        
        //scene 1 compete
        // for (int countGoblins = 1; countGoblins != 0; countGoblins--) {
        //     Console.WriteLine("There are " + countGoblins + " monsters left");
        //      Encounter fightGoblinOneAtAtime = new Encounter(hero1, new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
        //     fightGoblinOneAtAtime.StartFighting();
}
}
}