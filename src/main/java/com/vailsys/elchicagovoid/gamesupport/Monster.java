package com.vailsys.elchicagovoid.gamesupport;

public class Monster {
    
        public String monsterName;
        public static int monstersCreated = 0; 
        public static int monstersAlive = 0; 
        
        public int numberOfHearts; 
        private String monsterSoundEffects; 

        public String getMonsterSoundEffects(){
            return monsterSoundEffects;
        }

        public void setMonsterSoundEffects(String monsterSoundEffectSetter){
            this.monsterSoundEffects = monsterSoundEffectSetter;
        }
        // what the monster will say upon being killed 
        public String monsterColor;
        //Makes it so that Mons health will always be 100hp 
        public boolean monsterIsAlive = true;
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

        public String monsterSpeak() { 
            if (this.MonsterIsAlive) { 
                return "The monster says " + this.MonsterSoundEffects;
            } 
            else {
                return "The monster doesn't say anything 'cause it's dead";
            }
        } 
    
        public String writeLnMonsterSummary() {
            return "The " + this.MonsterName + " has " + this.NumberofHearts + " hearts.";
        }
    }
