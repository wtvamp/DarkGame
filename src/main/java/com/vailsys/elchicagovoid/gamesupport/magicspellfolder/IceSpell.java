package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.Encounter;
import com.vailsys.elchicagovoid.gamesupport.interfaces.ISkipATurn;

public class IceSpell extends BaseSpell implements ISkipATurn {

    @Override
    public void skipATurn(Encounter encounter) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spellIsUsedMessage() {
        System.out.println("A ice spell was cast.");
        super.spellIsUsedMessage();
    }

}