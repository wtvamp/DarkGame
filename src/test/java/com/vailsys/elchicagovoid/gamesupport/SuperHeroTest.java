package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperHeroTest{

@Test

void testSuperHero(){
    SuperHero ironMan = new SuperHero("Avenger", new Weapon(8, 8, "lazer blasters", "lazer"), new Weapon(2, 2, "lazer chest beam","lazer"), 1000,"Tony Stark",50);
    assertEquals("Avenger", ironMan.HeroName );
    assertEquals(8, ironMan.HeroWeapon.numOfAllowedAttacks);
    assertEquals(8, ironMan.HeroWeapon.attackCounter);
    assertEquals("lazer blasters", ironMan.HeroWeapon.weaponName);
    assertEquals("lazer", ironMan.HeroWeapon.attackType);
    assertEquals(2, ironMan.HeroWeapon2.numOfAllowedAttacks);
    assertEquals(2, ironMan.HeroWeapon2.attackCounter);
    assertEquals("lazer chest beam", ironMan.HeroWeapon2.weaponName);
    assertEquals("lazer", ironMan.HeroWeapon.attackType);
    assertEquals(1000, ironMan.Health);
    assertEquals("Tony Stark", ironMan.characterName);
    assertEquals(50, ironMan.damagePerTurn);

    System.out.println("\n\nYou have selected a " + ironMan.HeroName + "\nThis character's name is " + ironMan.characterName + "\n" +
    ironMan.characterName + " uses a " + ironMan.HeroWeapon.weaponName + " and " + ironMan.HeroWeapon2.weaponName + " that deal " + ironMan.damagePerTurn + " damage");
        
    }
}