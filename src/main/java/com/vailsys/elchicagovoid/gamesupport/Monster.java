package com.vailsys.elchicagovoid.gamesupport;

public class Monster {
    
        public String MonsterName;
        public static int MonstersCreated = 0; 
        public static int MonstersAlive = 0; 
        
        public int NumberofHearts; 
        public String MonsterSoundEffects; 
        // what the monster will say upon being killed 
        public String MonsterColor; 
        public int MonsterHealth = 100; 
        //Makes it so that Mons health will always be 100hp 
        public boolean MonsterIsAlive = true;
        //public int damageofMonster =  
    
        public Weapon primaryWeapon;
    
        public Monster(String monsterName, int numHearts, String monsterSoundEffect, String monsterColor, Weapon primaryWeapon) { 
            this.MonsterName = monsterName;
            this.NumberofHearts = numHearts; 
            this.MonsterSoundEffects = monsterSoundEffect; 
            this.MonsterColor = monsterColor; 
            this.primaryWeapon = primaryWeapon;
            MonstersCreated++; 
            MonstersAlive++; 
        } 

        public String MonsterSpeak() { 
            if (this.MonsterIsAlive) { 
                return "The monster says " + this.MonsterSoundEffects;
            } 
            else {
                return "The monster doesn't say anything 'cause it's dead";
            }
        } 
    
        public String WriteLnMonsterSummary() {
            return "The monster's name is " + this.MonsterName + " and his health is " + this.MonsterHealth;
        }
    }
