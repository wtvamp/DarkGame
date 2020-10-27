package com.vailsys.elchicagovoid.gamesupport;

import com.vailsys.elchicagovoid.gamesupport.SuperHero;

import com.vailsys.elchicagovoid.gamesupport.Encounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
class EncounterTest {  
    private Monster monsterHeFights;
    private Random randomAttack = new Random();
    private SuperHero heroSUT;
    private SuperHero Robin;
    

    @BeforeEach
    void assignHero() {
        this.Robin = new SuperHero ("Usless",  
        new Weapon(10, 10, "Nun", "Nuns"), 
        new Weapon(2, 2, "Sword", "Physical"), 100, "Alex", 35);
        
        this.heroSUT = new SuperHero("Ninja",  
        new Weapon(10, 10, "Ninja Star", "Combat"), 
        new Weapon(2, 2, "Sword", "Physical"), 100, "Miguel", 35);
        
        this.monsterHeFights = new Monster("Ogre", 169, "Get out of my swamp", "Green", 
        new Weapon(10, 10, "Club", "Combat"));
    }

    @Test
    void testEncounter() {
        //assignHero();
        assertEquals("Miguel", heroSUT.getCharacterName());
        assertEquals("Alex", Robin.getCharacterName());
        // assertEquals("Angel's AH",this.monsterHeFights;
    }

    @Test
    void monsterTaunts() {
        assertEquals("The monster says Get out of my swamp", monsterHeFights.monsterSpeak());
        //assertEquals(expected, actual);

    }
}

