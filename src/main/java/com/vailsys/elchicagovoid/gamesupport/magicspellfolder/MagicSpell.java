package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;
import com.vailsys.elchicagovoid.gamesupport.Encounter;

public class MagicSpell implements IMagicSpell{
    protected int spellDamage;
    protected String spellType;
    protected int fullhealthRecovery;
    protected Boolean dealDamage;
    protected int damageToHero;
    public void Spells(String spellsFromApp) {
        this.spellType = spellsFromApp;
        
    }
    
    public Boolean activateDamage(int spellDamageFromApp){
        this.spellDamage = spellDamageFromApp;
        dealDamage = !dealDamage;
        return dealDamage;
         
    }
    
    public void fullhealthRecovery(int healthRecievedFromApp){
        this.fullhealthRecovery = healthRecievedFromApp;
    
    }
   // public void heroTakesDamage(int heroDamageFromApp) {
    //}

}
