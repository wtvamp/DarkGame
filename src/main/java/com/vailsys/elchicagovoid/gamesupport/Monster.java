package com.vailsys.elchicagovoid.gamesupport;

public class Monster {
    
        private String monsterName;
        public String getMonsterName(){
            return monsterName;
        }

        public void setMonsterName(String monsterNameSetter){
            this.monsterName = monsterNameSetter;
        }
        // private static int monstersCreated = 0; 
        // private static int monstersAlive = 0; 
        
        private int numberOfHearts; 
        public int getnumberOfHearts(){
            return numberOfHearts;
        }

        public void monsterIntakeDamage(int damageValue) {
            // monsterHeFights.setnumberOfHearts(monsterHeFights.getnumberOfHearts() - heroFighting.damagePerTurn);
            this.numberOfHearts -= damageValue;
        }

        public void setnumberOfHearts(int monsternumberOfHearts){
            this.numberOfHearts = monsternumberOfHearts;
        }
        private String monsterSoundEffects; 

        public String getMonsterSoundEffects(){
            return monsterSoundEffects;
        }

        public void setMonsterSoundEffects(String monsterSoundEffectSetter){
            this.monsterSoundEffects = monsterSoundEffectSetter;
        }
        // what the monster will say upon being killed 
        private String monsterColor;

        public String getMonsterColor(){
            return monsterColor;
        }

        public void setMonsterColor(String monsterCOlorSetter){
            this.monsterColor = monsterCOlorSetter;
        }

        //Makes it so that Mons health will always be 100hp 
        private boolean monsterIsAlive = true;
        //public int damageofMonster =  
        //public int damageofMonster =  
        public boolean getmonsterIsAlive(){
            return monsterIsAlive;
        }

        public void setmonsterIsAlive(boolean monsterIsAlive){
            this.monsterIsAlive = monsterIsAlive;
        }
    
        private Weapon primaryWeapon;
        public Weapon getPrimaryWeapon(){
            return primaryWeapon;
        }

        public void setPrimaryWeapon(Weapon PrimaryWeapon){
            this.primaryWeapon = PrimaryWeapon;
        }

    
        public Monster(String monsterName, int numHearts, String monsterSoundEffect, String monsterColor, Weapon primaryWeapon) { 
            this.monsterName = monsterName;
            this.numberOfHearts = numHearts;
            this.monsterSoundEffects = monsterSoundEffect;
            this.monsterColor = monsterColor;
            this.primaryWeapon = primaryWeapon;
        }

        public String monsterSpeak() {
            if (this.monsterIsAlive) {
                return "The monster says " + this.monsterSoundEffects;
            } else {
                return "The monster doesn't say anything 'cause it's dead";
            }
        }

        public String writeLnMonsterSummary() {
            return "The " + this.monsterName + " has " + this.numberOfHearts + " hearts.";
        }
    }
