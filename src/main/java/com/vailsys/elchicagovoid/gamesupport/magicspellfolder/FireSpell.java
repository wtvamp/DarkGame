package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.Monster;
import com.vailsys.elchicagovoid.gamesupport.interfaces.IDamageEnemy;

public class FireSpell extends BaseSpell implements IDamageEnemy {

    public FireSpell() {
        this.spellName = "Fire spell";
    }
    @Override
    public void damageEnemy(Monster hp) {
        hp.setnumberOfHearts(hp.getnumberOfHearts() - 15); 
    }
}