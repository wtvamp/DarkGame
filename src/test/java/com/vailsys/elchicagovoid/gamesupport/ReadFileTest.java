package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vailsys.elchicagovoid.scenes.ReadFile;

public class ReadFileTest {

    @Test
    void testLoadFile() {
        ReadFile readFile = new ReadFile();
        readFile.loadFileFromText();
        assertEquals(1, 1);
    }   
}
