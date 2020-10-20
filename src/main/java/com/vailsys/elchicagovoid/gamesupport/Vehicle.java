package com.vailsys.elchicagovoid.gamesupport;

import com.vailsys.elchicagovoid.gamesupport.interfaces.IVehicle;

public class Vehicle implements IVehicle {
    public boolean isDriving = false;
    public SuperHero driver;

    public Vehicle(SuperHero hero) {
        this.driver = hero;
        System.out.println(driver.characterName + " the " + driver.HeroName + " stumbled across a vehicle.");
    }

    public Boolean drive() {
        isDriving = true;
        System.out.println(driver.characterName + " the " + driver.HeroName + " is driving the vehicle.");
        return isDriving;
    }

    public Boolean brake() {
        isDriving = false;
        System.out.println(driver.characterName + " the " + driver.HeroName + " has stopped the vehicle");
        return isDriving; 
    }

    @Override
    public String turn() {
        System.out.println(driver.characterName + " the " + driver.HeroName + " did a Tokyo drift. Skeet skeet.");
        return turn();
    }

    @Override
    public void honk() {
        System.out.println(driver.characterName + " the " + driver.HeroName + " Honks the horn. Honk Honk");
    }

    @Override
    public void hold(Object item) {
        System.out.println(driver.characterName + " the " + driver.HeroName + " is carrying x with him in the car");
    }

    @Override
    public void shield() {
        System.out.println(driver.characterName + " the " + driver.HeroName + " blocked attack by hiding behind a vehicle.");
    }

    @Override
    public void crash() {
        System.out.println("Oh no " + driver.characterName + " the " + driver.HeroName + " crashed.  They could save 15% or more on car insurance if they switch to Geico.");
    }

}

