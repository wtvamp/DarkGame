package gamesupport;

public class Vehicle implements IVehicle {
    private Boolean isDriving;
    private SuperHero driver;

    public Vehicle(SuperHero hero) {
        this.driver = hero;
        System.out.println(driver.characterName + " the " + driver.HeroName + " stumbled across a vehicle.");
    }

    public void drive() {
        System.out.println(driver.characterName + " the " + driver.HeroName + " is driving the vehicle.");
        isDriving = true;
    }

    public Boolean brake() {
        isDriving = false;
        System.out.println(driver.characterName + " the " + driver.HeroName + " has stopped the vehicle");
        return isDriving; 
    }

    @Override
    public void turn() {
        System.out.println(driver.characterName + " the " + driver.HeroName + " did a Tokyo drift. Skeet skeet.");
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

