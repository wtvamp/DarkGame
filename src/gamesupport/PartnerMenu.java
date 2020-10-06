package gamesupport;

public class PartnerMenu extends Menu {
    public SuperHero chooseHero() {
        
        SuperHero hero = super.chooseHero();
        System.out.println("Select " + hero.HeroName + "'s partner");
        return hero;
    }
}
