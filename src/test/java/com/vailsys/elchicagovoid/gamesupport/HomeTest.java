package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class HomeTest {
    @Test
    void testHome(){
        Home myCrib = new Home(4, 7, "444 w. walmart", 2, 6);
        assertEquals(4, myCrib.getFloors());
        assertEquals(7, myCrib.getWindows());
        assertEquals("444 w. walmart", myCrib.getAddress());
        assertEquals(2, myCrib.getFireEscape());
        assertEquals(6, myCrib.getFireEscape());

        System.out.println("Your home has " + myCrib.getFloors() + " floor(s) and also has " + myCrib.getWindows() +" window(s)");
        
    
    }
}

