package com.vailsys.elchicagovoid.gamesupport;

public class SuperHero {
    
    public String Ability;
    
    public int Health;
    
    public String HeroName;
    
    public Weapon HeroWeapon;
    
    public Weapon HeroWeapon2;
    
    public String characterName;
    
    public int damagePerTurn;
    
    public SuperHero(final String heroNameFromApp, final Weapon heroWeaponFromApp, final Weapon heroWeapon2FromApp, final int heroHealthFromApp, final String characterNameFromApp, final int damagePerTurnFromApp) {
        this.HeroName = heroNameFromApp;
        this.HeroWeapon = heroWeaponFromApp;
        this.HeroWeapon2 = heroWeapon2FromApp;
        this.Health = heroHealthFromApp;
        this.characterName = characterNameFromApp;
        this.damagePerTurn = damagePerTurnFromApp;
    }
}