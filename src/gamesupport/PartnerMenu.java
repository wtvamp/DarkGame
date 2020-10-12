package gamesupport;

public class PartnerMenu extends Menu {
    public SuperHero chooseHero() {
        
        SuperHero hero = super.chooseHero();
        System.out.println("You have selected " + hero.characterName + " the " + hero.HeroName + " as your partner.\n\n");
        return hero;
    }
}
