package com.vailsys.elchicagovoid.gamesupport;

public class PartnerMenu extends Menu {
    public SuperHero chooseHero() {
        
        SuperHero hero = super.chooseHero();
        System.out.println("You have selected " + hero.getCharacterName() + " the " + hero.getHeroName()
                + " as your partner.\n\n");
        return hero;
    }
}
