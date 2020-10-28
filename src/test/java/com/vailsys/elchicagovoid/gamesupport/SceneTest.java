package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


public class SceneTest {
    private Scene systemUnderTest;
   @BeforeEach
   
@Test
void Scenegenerator() {
    assertEquals("", this.systemUnderTest.getTextDescription());
    assertEquals("", this.systemUnderTest.getChoicePrompt());
    assertEquals("", this.systemUnderTest.getEpilogue());
    }
}
