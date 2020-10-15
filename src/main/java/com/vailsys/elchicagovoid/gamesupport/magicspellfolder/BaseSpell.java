package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.interfaces.ISpell;

public class BaseSpell implements ISpell {

    @Override
    public void spellIsUsedMessage() {
        System.out.println("The spell evaporated into dust after it was cast.");
    }
}
