package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.AfterAll;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

public class TVTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private TV systemUnderTest;
    
    @Test
    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    @BeforeEach
    void assignTv() {
        this.systemUnderTest = new TV(10,15);
    }
    
    // Object[] params = new Object[]{systemUnderTest};
    // public void set(String newName) {
    //     this.tv = newName;
    //   }

    @Test  
    public void changeChannelUp() {
        this.systemUnderTest.changeChannelUp();
        assertEquals("the TV changed the channel to 11", outContent.toString());

    }

    // @Override 
    // public void changeChannelDown() {
        
    // }

    // @Override
    // public void changeChannel() {

    // }

    
}

// public static void main(String[] args) {
//     TV bedroomTV = new TV(60, 100);
//     System.out.println("The TV is on and set to channel " + bedroomTV.channel);
//     bedroomTV.changeChannelUp(); // change 9
//     bedroomTV.changeChannelUp(); // change 10
//     bedroomTV.changeChannelDown(); // change 9
//     bedroomTV.changeChannel(17); // change 17
// }
// }