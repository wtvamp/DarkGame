package com.vailsys.elchicagovoid.gamesupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vailsys.elchicagovoid.gamesupport.magicspellfolder.BaseSpell;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

class SpellsTest {
    private BaseSpell SUT;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected String spellName;
    
    @BeforeEach 
    void assignSpell() {
        this.SUT = new BaseSpell();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void TestspellsWarningMessage(){
        this.SUT.spellWarningMessage();
        assertEquals("Spell can only be used once.", outContent.toString().trim()); 
        
    }

    @Test
    void TestspellIsUsesMessage(){
        this.SUT.spellIsUsedMessage();
        assertEquals("The spell evaporated into dust after it was cast.",outContent.toString().trim());
    }

    @Test
    void TestgetSpellName(){    
        this.SUT.getSpellName();
        assertEquals("", this.SUT.getSpellName());
    }
    
}