package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


public class MonsterTest {

    private Monster systemUnderTest;

    @BeforeEach
    void assignMonster() {
        this.systemUnderTest = new Monster("Boogie Man", 100, "Bruh", "Darkness", new Weapon(10, 10, "The cheese touch", "Cheese"));
    }

    @Test
    void testMonster() {
        assertEquals("Boogie Man", this.systemUnderTest.getMonsterName());
        assertEquals(100, this.systemUnderTest.getnumberOfHearts());
        assertEquals("Bruh", this.systemUnderTest.getMonsterSoundEffects());
        assertEquals("Darkness", this.systemUnderTest.getMonsterColor());
        assertEquals(10, this.systemUnderTest.getPrimaryWeapon().getWeaponnumOfAllowedAttacks());
        assertEquals(10, this.systemUnderTest.getPrimaryWeapon().getattackCounter());
        assertEquals("The cheese touch", this.systemUnderTest.getPrimaryWeapon().getweaponName());
        assertEquals("Cheese", this.systemUnderTest.getPrimaryWeapon().getattackType());

        System.out.println("You have encountered " + this.systemUnderTest.getMonsterName() + 
        ".\n He has " + this.systemUnderTest.getnumberOfHearts() + " health" + 
        ".\n He says " + this.systemUnderTest.monsterSpeak() + 
        ".\n His color is " + this.systemUnderTest.getMonsterColor() +
        ".\n His weapon is " + this.systemUnderTest.getPrimaryWeapon().getweaponName() +
        ".\n His weapon type is" + this.systemUnderTest.getPrimaryWeapon().getattackType() + ".");
    }

    @Test
    void testMonsterSpeak() {
        assertEquals("The monster says Bruh", this.systemUnderTest.monsterSpeak());        
        this.systemUnderTest.setmonsterIsAlive(false);
        assertEquals("The monster doesn't say anything 'cause it's dead", this.systemUnderTest.monsterSpeak());        
    }

    @Test 
    void testMonsterSummary() {
        assertEquals("The monster's name is Boogie Man and his health is 100", this.systemUnderTest.writeLnMonsterSummary());
    }

    @Test
    void testMonsterNumOfHearts() {
        assertEquals(100, this.systemUnderTest.getnumberOfHearts());
    }

}

