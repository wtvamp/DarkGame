package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class PartnerMenuTest {
    private SuperHero SUT;

    @BeforeEach
    void assignSuperHero(){

    
    SUT = new SuperHero("Wizard",  new Weapon(8, 8, "Staff", "Magic"), new Weapon(4, 4, "Potion", "Magic"), 100,"Alex", 45);
    }

    @Test 
    void testPartnerMenu(){
        assertEquals("You have selected " + SUT.getCharacterName() + " the " + SUT.getHeroName() + " as your partner.\n\n", "You have selected " + SUT.getCharacterName() + " the " + SUT.getHeroName() + " as your partner.\n\n");
        
        
    }
}


