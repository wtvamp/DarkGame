package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class RandomScenesTest {

    private RandomScenes systemUnderTest;
    
    @BeforeEach
    void createScenes() {
        this.systemUnderTest = new RandomScenes();
    }

    @Test
    void testMonster() {
        systemUnderTest.loadScenesFromTextFile("src/main/java/com/vailsys/elchicagovoid/scenes/scenes.txt");
        assertEquals("src/main/java/com/vailsys/elchicagovoid/scenes/scenes.txt", systemUnderTest.getFileLocation());
        
    }
}
