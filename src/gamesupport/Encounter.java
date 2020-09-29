package gamesupport;

public class Encounter {
    
    private SuperHero heroFighting;
    private Monster monsterHeFights;
    public Encounter(SuperHero herofightingfromapp, Monster monsterhefightsfromapp) { 
        this.heroFighting = herofightingfromapp;
        this.monsterHeFights = monsterhefightsfromapp; 
        
        Console.WriteLine("A "+ monsterHeFights.primaryWeapon + " is thrown at him but he was able to dodge it. A " + monsterHeFights.MonsterName + " has appeared" );
        Console.WriteLine(monsterHeFights.MonsterSpeak());
        Console.WriteLine(monsterHeFights.WriteLnMonsterSummary());
        Console.WriteLine(monsterHeFights.primaryWeapon.PrintWeaponStatus());
        Console.Write("Press ENTER to Continue\n");
        
        Console.ReadLine();
    }

    public void StartFighting() {
        
        while (monsterHeFights.NumberofHearts > 0)
        {
            Console.WriteLine("What will he do");
            Console.WriteLine("[1]Fight\n[2]Recover");
                    
            string combatchoice;
            combatchoice = Console.ReadLine();
        
            switch(combatchoice)
            {
                case "1":
                    Console.WriteLine("Time to kick this guys butt.");
                    break;
            
                case "2":
                    Console.WriteLine("Gotta keep defending myself.");
                    break;
            }
            if (combatchoice=="1")
            {                
                Console.WriteLine(heroFighting.characterName + " Has " + heroFighting.Health + " Left.");
                Console.WriteLine("He used " + heroFighting.HeroWeapon.weaponName + ".");
                monsterHeFights.NumberofHearts -= heroFighting.damagePerTurn; //reduces the amount of health the monster has
                Console.WriteLine(monsterHeFights.MonsterName + " has " + monsterHeFights.NumberofHearts + " health."); 

                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                Console.WriteLine(heroFighting.characterName + " has " + heroFighting.HeroWeapon.numOfAllowedAttacks + " attacks remaining.");
                Console.WriteLine("\n");  
            } 
             if (monsterHeFights.NumberofHearts > 0) {
                Console.WriteLine("\n");
                Console.WriteLine("Press ENTER to Continue");
                Console.ReadLine();
                Console.WriteLine("\n" + monsterHeFights.MonsterName + " attacks again, "+ monsterHeFights.primaryWeapon.weaponName);
                System.Random random = new System.Random(); 
                int num = random.Next(10,20);
                heroFighting.Health -= num;
                Console.WriteLine("Ouch, " + heroFighting.characterName + " shouts: ''AHHH'' I have " + heroFighting.Health + " health left! \n");
            }
            if (heroFighting.Health < 0 || heroFighting.HeroWeapon.numOfAllowedAttacks == 0) {
                Console.WriteLine("You ran out of health and/or ammo");
                Console.WriteLine("GAMEOVER!");
                System.Environment.Exit(0x0);
            }
            if(combatchoice == "2" && heroFighting.Health < 100){                
                heroFighting.Health += 20; 
                Console.WriteLine(heroFighting.characterName + " has blocked attack, received 25 Hp, and another " + heroFighting.HeroWeapon.weaponName);
                heroFighting.HeroWeapon.numOfAllowedAttacks = heroFighting.HeroWeapon.attackCounter; 
            }
            Console.WriteLine(heroFighting.characterName + " has attacked the " + monsterHeFights.MonsterName + " with " + heroFighting.HeroWeapon.PrintWeaponStatus());
            Console.WriteLine("Press Enter To Continue");
            Console.ReadLine();
        }
    } 
}
