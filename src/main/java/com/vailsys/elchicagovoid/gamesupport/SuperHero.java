package com.vailsys.elchicagovoid.gamesupport;

import java.util.ArrayList;
import java.util.List;

import com.vailsys.elchicagovoid.gamesupport.interfaces.ISpell;

public class SuperHero {
    
    public String Ability;
    
    public int Health;
    
    public String HeroName;
    
    public Weapon HeroWeapon;
    
    public Weapon HeroWeapon2;
    
    public String characterName;
    
    public int damagePerTurn;
    
    private List<ISpell> heroSpellChoices;
    
    
    public List<ISpell> getHeroSpellChoices(){
        return this.heroSpellChoices;        
    }

    public SuperHero(final String heroNameFromApp, final Weapon heroWeaponFromApp, final Weapon heroWeapon2FromApp, final int heroHealthFromApp, final String characterNameFromApp, final int damagePerTurnFromApp) {
        this.HeroName = heroNameFromApp;
        this.HeroWeapon = heroWeaponFromApp;
        this.HeroWeapon2 = heroWeapon2FromApp;
        this.Health = heroHealthFromApp;
        this.characterName = characterNameFromApp;
        this.damagePerTurn = damagePerTurnFromApp;
        this.heroSpellChoices = new ArrayList<>();
    }
}