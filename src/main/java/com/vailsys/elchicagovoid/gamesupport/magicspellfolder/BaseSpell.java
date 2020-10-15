package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.interfaces.ISpell;

public class BaseSpell implements ISpell {

    protected String spellName;

    @Override
    public void spellWarningMessage() {
        System.out.println("Spell can only be used once.");
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    @Override
    public void spellIsUsedMessage() {
        System.out.println("The spell evaporated into dust after it was cast.");
    }
}
