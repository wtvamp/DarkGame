package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MonsterTest {

@Test

    void testMonster() {
        Monster theBoogieMan = new Monster("Boogie Man", 100, "Bruh", "Darkness", new Weapon(10, 10, "The cheese touch", "Cheese"));
        
        assertEquals("Boogie Man", theBoogieMan.MonsterName);
        assertEquals(100, theBoogieMan.NumberofHearts);
        assertEquals("Bruh", theBoogieMan.MonsterSoundEffects);
        assertEquals("Darkness", theBoogieMan.MonsterColor);
        assertEquals(10, theBoogieMan.primaryWeapon.numOfAllowedAttacks);
        assertEquals(10, theBoogieMan.primaryWeapon.attackCounter);
        assertEquals("The cheese touch", theBoogieMan.primaryWeapon.weaponName);
        assertEquals("Cheese", theBoogieMan.primaryWeapon.attackType);

        System.out.println("You have encountered " + theBoogieMan.MonsterName + 
        ".\n He has " + theBoogieMan.NumberofHearts + " health" + 
        ".\n He says " + theBoogieMan.MonsterSpeak() + 
        ".\n His color is " + theBoogieMan.MonsterColor +
        ".\n His weapon is " + theBoogieMan.primaryWeapon.weaponName +
        ".\n His weapon type is" + theBoogieMan.primaryWeapon.attackType + ".");

    }
}

