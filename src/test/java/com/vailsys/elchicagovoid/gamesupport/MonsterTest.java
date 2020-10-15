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
        assertEquals("Boogie Man", this.systemUnderTest.MonsterName);
        assertEquals(100, this.systemUnderTest.NumberofHearts);
        assertEquals("Bruh", this.systemUnderTest.MonsterSoundEffects);
        assertEquals("Darkness", this.systemUnderTest.MonsterColor);
        assertEquals(10, this.systemUnderTest.primaryWeapon.numOfAllowedAttacks);
        assertEquals(10, this.systemUnderTest.primaryWeapon.attackCounter);
        assertEquals("The cheese touch", this.systemUnderTest.primaryWeapon.weaponName);
        assertEquals("Cheese", this.systemUnderTest.primaryWeapon.attackType);

        System.out.println("You have encountered " + this.systemUnderTest.MonsterName + 
        ".\n He has " + this.systemUnderTest.NumberofHearts + " health" + 
        ".\n He says " + this.systemUnderTest.monsterSpeak() + 
        ".\n His color is " + this.systemUnderTest.MonsterColor +
        ".\n His weapon is " + this.systemUnderTest.primaryWeapon.weaponName +
        ".\n His weapon type is" + this.systemUnderTest.primaryWeapon.attackType + ".");
    }

    @Test
    void testMonsterSpeak() {
        assertEquals("The monster says Bruh", this.systemUnderTest.monsterSpeak());        
        this.systemUnderTest.MonsterIsAlive = false;
        assertEquals("The monster doesn't say anything 'cause it's dead", this.systemUnderTest.monsterSpeak());        
    }

    @Test 
    void testMonsterSummary() {
        assertEquals("The monster's name is Boogie Man and his health is 100", this.systemUnderTest.writeLnMonsterSummary());
    }

    @Test
    void testMonsterHealth() {
        assertEquals(100, this.systemUnderTest.MonsterHealth);
    }

}

