package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperHeroTest{

@Test

void testSuperHero(){
    SuperHero ironMan = new SuperHero("Avenger", new Weapon(8, 8, "lazer blasters", "lazer"), new Weapon(2, 2, "lazer chest beam","lazer"), 1000,"Tony Stark",50);
    assertEquals("Avenger", ironMan.getHeroName());
    assertEquals(8, ironMan.getHeroWeapon().numOfAllowedAttacks);
    assertEquals(8, ironMan.getHeroWeapon().getattackCounter());
    assertEquals("lazer blasters", ironMan.getHeroWeapon().getweaponName());
    assertEquals("lazer", ironMan.getHeroWeapon().getattackType());
    assertEquals(2, ironMan.getHeroWeapon2().numOfAllowedAttacks);
    assertEquals(2, ironMan.getHeroWeapon2().getattackCounter());
    assertEquals("lazer chest beam", ironMan.getHeroWeapon2().getweaponName());
    assertEquals("lazer", ironMan.getHeroWeapon().getattackType());
    assertEquals(1000, ironMan.getHealth());
    assertEquals("Tony Stark", ironMan.getCharacterName());
    assertEquals(50, ironMan.getDamagePerTurn());

    System.out.println("\n\nYou have selected a " + ironMan.getHeroName() + "\nThis character's name is " + ironMan.getCharacterName() + "\n"
            +
    ironMan.getCharacterName() + " uses a " + ironMan.getHeroWeapon().getweaponName() + " and "
            + ironMan.getHeroWeapon2().getweaponName() + " that deal " + ironMan.getDamagePerTurn() + " damage");
        
    }
}