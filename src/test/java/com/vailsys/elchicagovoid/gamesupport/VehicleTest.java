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
        //assertEquals(expected, driver.characterName + " the " + driver.HeroName + " is driving the vehicle.");
       //assertNull(vehicleTesting.drive());
    }

    @Test
    void Testdrive() {
        assertEquals(true, this.systemUnderTest.drive());
        assertEquals("Bro", this.systemUnderTest.driver.characterName);
       
    }

    // private void AssertEquals(String string, Object drive) {
    // }

    void Testbrake() {
        assertEquals(false, this.systemUnderTest.drive());
        assertEquals("Bro", this.systemUnderTest.driver.characterName);
    }

    void Testturn() {
        // TODO Auto-generated method stub

    }

    void Testhonk() {
        // TODO Auto-generated method stub
        //System.out.println(this.systemUnderTest.honk());
    }

    void Testhold(Object item) {
        // TODO Auto-generated method stub

    }

    void Testshield() {
        // TODO Auto-generated method stub

    }

    void Testcrash() {
        // TODO Auto-generated method stub

    }
}
