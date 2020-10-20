package com.vailsys.elchicagovoid.gamesupport;

public class SuperHero {
    
    private String Ability;
    
    public String getAbility(){
        return Ability;
    }
    public void setAblity(String heroAblity ) {
        this.Ability = heroAblity;
    }
    private int Health;
    
    public int getHealth(){
        return Health;
    }

    public void setHealth(int healthSetter){
        this.Health= healthSetter;
    }

    private String heroName;
    
    public String getHeroName(){
        return heroName;
    }
    
    public void setHeroName(String nameOfHeroSetter) {
        this.heroName = nameOfHeroSetter;
    }
    private Weapon heroWeapon;
    
    private Weapon heroWeapon2;
    
    private String characterName;
    
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String nameOfCharacterSetter){
        this.characterName = nameOfCharacterSetter;
    }
    
    public int damagePerTurn;
    
    public SuperHero(final String heroNameFromApp, final Weapon heroWeaponFromApp, final Weapon heroWeapon2FromApp, final int heroHealthFromApp, final String characterNameFromApp, final int damagePerTurnFromApp) {
        this.heroName = heroNameFromApp;
        this.heroWeapon = heroWeaponFromApp;
        this.heroWeapon2 = heroWeapon2FromApp;
        this.Health = heroHealthFromApp;
        this.characterName = characterNameFromApp;
        this.damagePerTurn = damagePerTurnFromApp;
        
    }
}