package com.vailsys.elchicagovoid.gamesupport.magicspellfolder;

import com.vailsys.elchicagovoid.gamesupport.Monster;
import com.vailsys.elchicagovoid.gamesupport.interfaces.IDamageEnemy;

public class FireSpell extends BaseSpell implements IDamageEnemy {

    @Override
    public void damageEnemy(Monster hp) {
        hp.NumberofHearts -= 15;
    }
}