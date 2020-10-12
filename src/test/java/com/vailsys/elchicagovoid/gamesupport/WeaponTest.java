package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vailsys.elchicagovoid.gamesupport.Weapon;

/**
 * Unit test for Weapon Class.
 */
class WeaponTest {
    /**
     * Rigorous Test tests all properties and methods
     */
    @Test
    void testWeapon() {
        Weapon testCross = new Weapon(5, 5, "Cross", "Holy");
        assertEquals(5, testCross.attackCounter);
        assertEquals(5, testCross.numOfAllowedAttacks);
        assertEquals("Cross", testCross.weaponName);
        assertEquals("Holy", testCross.attackType);
        assertEquals("Cross has 5/5 remaining.\nThis Cross is using Holy type of attack. \n", testCross.PrintWeaponStatus());
    }
}
