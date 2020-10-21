package com.vailsys.elchicagovoid.gamesupport;

public class Weapon {
    

    int numOfAllowedAttacks;
    private int attackCounter;
    private String weaponName;
    private String attackType;


    public int getWeaponnumOfAllowedAttacks(){
        return this.numOfAllowedAttacks;
    }

    public void setWeaponnumOfAllowedAttacks(int numOfAttackSetter){
        this.numOfAllowedAttacks = numOfAttackSetter;
    }

    public int getattackCounter(){
        return this.attackCounter;
    }

    public void setattackCounter(int atkCounterSetter){
        this.attackCounter = atkCounterSetter;
    }

    public String getweaponName(){
        return this.weaponName;
    }

    public void setWeaponName(String wpnNameSetter){
        this.weaponName = wpnNameSetter;
    }
    public String getattackType(){
        return this.weaponName;
    }

    public void setAttackType(String attackTypeSetter){
        this.attackType = attackTypeSetter;
    }



    public Weapon(int allowedAttacksFromApp, int attackCounterFromApp, String weaponNameFromApp, String attackTypeFromApp)
    {
        this.numOfAllowedAttacks = allowedAttacksFromApp;
        this.attackCounter = attackCounterFromApp;
        this.weaponName = weaponNameFromApp;
        this.attackType = attackTypeFromApp;
    }

    public String PrintWeaponStatus(){
    
        return "The " + weaponName + " has " + numOfAllowedAttacks + "/" + attackCounter + " remaining.\n"+
        "This " + weaponName + " is using " + attackType + " type of attack. \n";
        
         
    }    
}
