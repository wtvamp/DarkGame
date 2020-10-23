package com.vailsys.elchicagovoid.gamesupport;

import com.vailsys.elchicagovoid.gamesupport.interfaces.IVehicle;

public class Vehicle implements IVehicle {
    public boolean isDriving = false;
    public SuperHero driver;

    public Vehicle(SuperHero hero) {
        this.driver = hero;
        System.out.println(driver.getCharacterName() + " the " + driver.getHeroName() + " stumbled across a vehicle.");
    }

    public Boolean drive() {
        isDriving = true;
        System.out.println(driver.getCharacterName() + " the " + driver.getHeroName() + " is driving the vehicle.");
        return isDriving;
    }

    public Boolean brake() {
        isDriving = false;
        System.out.println(driver.getCharacterName() + " the " + driver.getHeroName() + " has stopped the vehicle");
        return isDriving; 
    }

    @Override
    public String turn() {
        String returnTurnMessage = driver.getCharacterName() + " the " + driver.getHeroName() + " did a Tokyo drift. Skeet skeet.";
        System.out.println(returnTurnMessage);
        return returnTurnMessage;
    }

    @Override
    public void honk() {
        System.out.println(driver.getCharacterName() + " the " + driver.getHeroName() + " Honks the horn. Honk Honk");
    }

    @Override
    public String hold(Object item) {
        String returnHoldMessage = driver.getCharacterName() + " the " + driver.getHeroName() + " is carrying x with him in the car";
        System.out.println(returnHoldMessage);
        return returnHoldMessage;
    }

    @Override
    public String shield() {
        String returnShieldMessage = driver.getCharacterName() + " the " + driver.getHeroName() + " blocked attack by hiding behind a vehicle.";
        System.out.println(returnShieldMessage);
        return returnShieldMessage;
    }

    @Override
    public String crash() {
        String returnCrashMessage = "Oh no " + driver.getCharacterName() + " the " + driver.getHeroName() + " crashed.  They could save 15% or more on car insurance if they switch to Geico.";
        System.out.println(returnCrashMessage);
        return returnCrashMessage;
    }

}

