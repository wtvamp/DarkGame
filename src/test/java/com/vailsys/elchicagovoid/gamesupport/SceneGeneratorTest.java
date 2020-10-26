package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SceneGeneratorTest {
    private SceneGenerator systemUnderTest;
    
    @BeforeEach
    void SceneGenerator(){
    this.systemUnderTest = new SceneGenerator(new Scene(), 
    new SuperHero("Family guy", new Weapon(2, 2, "Fat", ""),
    new Weapon(3, 3, "Tax", "Deductibles"), 1000, "Bro",50), 
    new SuperHero("Travis Scott", 
    new Weapon(8, 8, "Burger", "Spicy nuggets"), 
    new Weapon(3, 3, "Sicko", "Mobamba"), 1000, "Bro",50) , 
    new Monster("Freddy Kugar", 200, "grahhh", "( ͡° ͜ʖ ͡°) ᛒᚱᚢᚺ ᛏᚱᚨᚡᛁᛋ ᛋᚲᛟᛏᛏ ᛒᚱᚢᚷᛖᚱ", 
    new Weapon(10, 10, "haunt dreams", "Fantasy ")));
    }
    
    @Test
    void testScenegenerator() {
        assertEquals("j",this.systemUnderTest.getTextDescription());

    }
}

