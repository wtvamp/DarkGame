package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperHeroTest{

@Test

void testSuperHero(){
    SuperHero ironMan = new SuperHero("Avenger", new Weapon(8, 8, "lazer blasters", "lazer"), new Weapon(2, 2, "lazer chest beam","lazer"), 1000,"Tony Stark",50);
    assertEquals("Avenger", ironMan.getHeroName());
    assertEquals(8, ironMan.heroWeapon.numOfAllowedAttacks);
    assertEquals(8, ironMan.heroWeapon.getattackCounter());
    assertEquals("lazer blasters", ironMan.heroWeapon.getweaponName());
    assertEquals("lazer", ironMan.heroWeapon.getattackType());
    assertEquals(2, ironMan.heroWeapon2.numOfAllowedAttacks);
    assertEquals(2, ironMan.heroWeapon2.getattackCounter());
    assertEquals("lazer chest beam", ironMan.heroWeapon2.getweaponName());
    assertEquals("lazer", ironMan.heroWeapon.getattackType());
    assertEquals(1000, ironMan.getHealth());
    assertEquals("Tony Stark", ironMan.getCharacterName());
    assertEquals(50, ironMan.damagePerTurn);

    System.out.println("\n\nYou have selected a " + ironMan.getHeroName() + "\nThis character's name is " + ironMan.getCharacterName() + "\n"
            +
    ironMan.getCharacterName() + " uses a " + ironMan.heroWeapon.getweaponName() + " and "
            + ironMan.heroWeapon2.getweaponName() + " that deal " + ironMan.damagePerTurn + " damage");
        
    }
}