package com.vailsys.elchicagovoid.gamesupport;

public class Weapon {
    

public int numOfAllowedAttacks;
    public int attackCounter;
    public String weaponName;
    public String attackType;

    public Weapon(int allowedAttacksFromApp, int attackCounterFromApp, String weaponNameFromApp, String attackTypeFromApp)
    {
        this.numOfAllowedAttacks = allowedAttacksFromApp;
        this.attackCounter = attackCounterFromApp;
        this.weaponName = weaponNameFromApp;
        this.attackType = attackTypeFromApp;
    }

    public String PrintWeaponStatus(){
    
        return "" + weaponName + " has " + numOfAllowedAttacks + "/" + attackCounter + " remaining.\n"+
        "This " + weaponName + " is using " + attackType + " type of attack. \n";
        
         
    }    
}
