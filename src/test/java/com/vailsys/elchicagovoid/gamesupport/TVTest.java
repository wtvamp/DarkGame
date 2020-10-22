package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

public class TVTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private TV systemUnderTest;

    @BeforeEach
    void assignTv() {
        this.systemUnderTest = new TV(10,15);
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams(){
        System.setOut(originalOut);
    }
    
    @Test 
    public void changeChannelUp() {
        this.systemUnderTest.changeChannelUp();
        assertEquals("the TV changed the channel to 9", outContent.toString().trim());
    }

    @Test
    public void changeChannelDown() {
        this.systemUnderTest.changeChannelDown();
        assertEquals("the TV changed the channel to 7", outContent.toString().trim());
    }

    @Test
    public void changeChannel() {
        this.systemUnderTest.changeChannel(16);
        assertEquals("the TV changed the channel to 16", outContent.toString().trim());
    }

    @Test
    public void changeChannelOverMax(){
        this.systemUnderTest.setChannel(60);
        this.systemUnderTest.changeChannelUp();
        assertEquals("the TV changed the channel to 1", outContent.toString().trim());
    }

    @Test
    public void changeChannelUnderMin(){
        this.systemUnderTest.setChannel(1);
        this.systemUnderTest.changeChannelDown();
        assertEquals("the TV changed the channel to 60", outContent.toString().trim());
    }
    
}
