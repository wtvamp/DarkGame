package com.vailsys.elchicagovoid.gamesupport;

import com.vailsys.elchicagovoid.gamesupport.interfaces.IVehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;

import org.junit.jupiter.api.BeforeEach;

public class VehicleTest  {  
    
    private Vehicle systemUnderTest;

    @BeforeEach
    void assignVehicle() {
        this.systemUnderTest = new Vehicle(new SuperHero("IRS Taxman", new Weapon(8, 8, "Gun", "Knife"), new Weapon(3, 3, "Tax", "Deductibles"), 1000, "Bro",50));
    }
    void testVehicle(){
        System.out.println("");
    }

    @Test
    void Testdrive() {
        assertEquals(true, this.systemUnderTest.drive());
        assertEquals("Bro", this.systemUnderTest.driver.getCharacterName());
    }

    @Test
    void Testbrake() {
        assertEquals(false, this.systemUnderTest.brake());
        assertEquals("Bro", this.systemUnderTest.driver.getCharacterName());
    }
    @Test
    void Testturn() {
        // TODO Auto-generated method stub
        assertEquals(this.systemUnderTest.driver.getCharacterName() + " the " + this.systemUnderTest.driver.getHeroName() + " did a Tokyo drift. Skeet skeet.", this.systemUnderTest.turn());
    }


    void Testhold(Object item) {
        assertEquals(this.systemUnderTest.driver.getCharacterName() + " the " + this.systemUnderTest.driver.getHeroName() + " is carrying x with him in the car", this.systemUnderTest.hold(item));
    }
    @Test
    void Testshield() {
        assertEquals(this.systemUnderTest.driver.getCharacterName() + " the " + this.systemUnderTest.driver.getHeroName() + " blocked attack by hiding behind a vehicle.", this.systemUnderTest.shield());
    }
    @Test
    void Testcrash() {
        assertEquals("Oh no " + this.systemUnderTest.driver.getCharacterName() + " the " + this.systemUnderTest.driver.getHeroName() + " crashed.  They could save 15% or more on car insurance if they switch to Geico.", this.systemUnderTest.crash());
    }
}
