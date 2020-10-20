package com.vailsys.elchicagovoid.gamesupport;

import java.util.ArrayList;
import java.util.List;

import com.vailsys.elchicagovoid.gamesupport.interfaces.ISpell;

public class SuperHero {
    
    private String Ability;
    
    public String getAbility(){
        return Ability;
    }
    public void setAblity(String heroAblity ) {
        this.Ability = heroAblity;
    }
    private int Health;
    
    public int getHealth() {
        return Health;
    }

    // monsterHeFights.setnumberOfHearts(monsterHeFights.getnumberOfHearts() - heroFighting.damagePerTurn);
    // current health is 90
    // addHealth = 25
    // if( this.Health + addHealth > 100){}
    public void addHealth(int addHealth) {
        if(this.Health + addHealth > 100){
            this.setHealth(100);
        } else {
            this.Health += addHealth;
        }
    }


    public void setHealth(int healthSetter){
        this.Health = healthSetter;
    }

    private String heroName;
    
    public String getHeroName(){
        return heroName;
    }
    
    public void setHeroName(String nameOfHeroSetter) {
        this.heroName = nameOfHeroSetter;
    }
    public Weapon heroWeapon;
    
    public Weapon heroWeapon2;
    
    private String characterName;
    
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String nameOfCharacterSetter){
        this.characterName = nameOfCharacterSetter;
    }
    
    public int damagePerTurn;
    
    private List<ISpell> heroSpellChoices;
    
    
    public List<ISpell> getHeroSpellChoices(){
        return this.heroSpellChoices;        
    }

    public SuperHero(final String heroNameFromApp, final Weapon heroWeaponFromApp, 
    final Weapon heroWeapon2FromApp, final int heroHealthFromApp, final String characterNameFromApp, final int damagePerTurnFromApp) {
        this.heroName = heroNameFromApp;
        this.heroWeapon = heroWeaponFromApp;
        this.heroWeapon2 = heroWeapon2FromApp;
        this.Health = heroHealthFromApp;
        this.characterName = characterNameFromApp;
        this.damagePerTurn = damagePerTurnFromApp;
        this.heroSpellChoices = new ArrayList<>();
    }
}