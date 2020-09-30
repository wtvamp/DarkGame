package gamesupport;

public class Encounter {
    
    private SuperHero heroFighting;
    private Monster monsterHeFights;
    public Encounter(SuperHero herofightingfromapp, Monster monsterhefightsfromapp) { 
        this.heroFighting = herofightingfromapp;
        this.monsterHeFights = monsterhefightsfromapp; 
        
        System.out.println("A "+ monsterHeFights.primaryWeapon + " is thrown at him but he was able to dodge it. A " + monsterHeFights.MonsterName + " has appeared" );
        System.out.println(monsterHeFights.MonsterSpeak());
        System.out.println(monsterHeFights.WriteLnMonsterSummary());
        System.out.println(monsterHeFights.primaryWeapon.PrintWeaponStatus());
        System.out.print("Press ENTER to Continue\n");
        
        System.out.ReadLine();
    }

    public void StartFighting() {
        
        while (monsterHeFights.NumberofHearts > 0)
        {
            System.out.println("What will he do");
            System.out.println("[1]Fight\n[2]Recover");
                    
            String combatchoice;
            combatchoice = Console.ReadLine();
        
            switch(combatchoice)
            {
                case "1":
                    System.out.println("Time to kick this guys butt.");
                    break;
            
                case "2":
                    System.out.println("Gotta keep defending myself.");
                    break;
            }
            if (combatchoice=="1")
            {                
                System.out.println(heroFighting.characterName + " Has " + heroFighting.Health + " Left.");
                System.out.println("He used " + heroFighting.HeroWeapon.weaponName + ".");
                monsterHeFights.NumberofHearts -= heroFighting.damagePerTurn; //reduces the amount of health the monster has
                System.out.println(monsterHeFights.MonsterName + " has " + monsterHeFights.NumberofHearts + " health."); 

                heroFighting.HeroWeapon.numOfAllowedAttacks--; //Decreases durability on weapon
                System.out.println(heroFighting.characterName + " has " + heroFighting.HeroWeapon.numOfAllowedAttacks + " attacks remaining.");
                System.out.println("\n");  
            } 
             if (monsterHeFights.NumberofHearts > 0) {
                System.out.println("\n");
                System.out.println("Press ENTER to Continue");
                Console.ReadLine();
                System.out.println("\n" + monsterHeFights.MonsterName + " attacks again, "+ monsterHeFights.primaryWeapon.weaponName);
                System.Random random = new System.Random(); 
                int num = random.Next(10,20);
                heroFighting.Health -= num;
                System.out.println("Ouch, " + heroFighting.characterName + " shouts: ''AHHH'' I have " + heroFighting.Health + " health left! \n");
            }
            if (heroFighting.Health < 0 || heroFighting.HeroWeapon.numOfAllowedAttacks == 0) {
                System.out.println("You ran out of health and/or ammo");
                System.out.println("GAMEOVER!");
                System.Environment.Exit(0x0);
            }
            if(combatchoice == "2" && heroFighting.Health < 100){                
                heroFighting.Health += 20; 
                System.out.println(heroFighting.characterName + " has blocked attack, received 25 Hp, and another " + heroFighting.HeroWeapon.weaponName);
                heroFighting.HeroWeapon.numOfAllowedAttacks = heroFighting.HeroWeapon.attackCounter; 
            }
            System.out.println(heroFighting.characterName + " has attacked the " + monsterHeFights.MonsterName + " with " + heroFighting.HeroWeapon.PrintWeaponStatus());
            System.out.println("Press Enter To Continue");
            Console.ReadLine();
        }
    } 
}
