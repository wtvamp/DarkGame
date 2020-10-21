package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.SuperHero;
import com.vailsys.elchicagovoid.gamesupport.interfaces.IRestoreSpell;

public class HealingSpell extends BaseSpell implements IRestoreSpell {

    public HealingSpell(){
        this.spellName = "Healing Spell";
    }

    @Override
    public void spellIsUsedMessage() {
        System.out.println("A healing spell was cast.");
        super.spellIsUsedMessage();
    }

    @Override
    public void restoreHealth(SuperHero hero) {
        hero.addHealth(100);
    }
}
