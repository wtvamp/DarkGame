package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class HomeTest {
    @Test
    void testHome(){
        Home myCrib = new Home(4, 7, "444 w. walmart", 2, 6);
        assertEquals(4, myCrib.floors);
        assertEquals(7, myCrib.windows);
        assertEquals("444 w. walmart", myCrib.address);
        assertEquals(2, myCrib.fireEscp);
        assertEquals(6, myCrib.garage);

        System.out.println("Your home has " + myCrib.floors + " floor(s) and also has " + myCrib.windows +" window(s)");
        
    
    }
}

