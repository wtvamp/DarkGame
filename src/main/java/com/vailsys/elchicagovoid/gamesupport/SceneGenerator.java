package com.vailsys.elchicagovoid.gamesupport;

public class SceneGenerator extends Scene {
    private Encounter monsterEncount; 
    private SuperHero hero; 
    private SuperHero sidekick; 
    private Integer choiceAnswer;

    public SceneGenerator(Scene scene, SuperHero hero, SuperHero sidekick, Monster monster) {
        super(scene.getTextDescription(), scene.getChoicePrompt(), scene.getChoices(), scene.getResponses(), scene.getEpilogue());
        this.hero = hero;
        this.sidekick = sidekick;
        this.monsterEncount = new Encounter(hero, sidekick, monster);
    }

    public void printStoryline() {
        System.out.println(getTextDescription()
            .replace("@heroName", hero.characterName + " the " + hero.HeroName)
            .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName));
        System.out.println("\n");
        System.out.println("Press ENTER to continue \n");
        System.console().readLine();
    }
    
    public void makeChoice() {
        System.out.println(getChoicePrompt());
        getChoices().forEach(System.out::println);
        this.choiceAnswer = Integer.parseInt(System.console().readLine());
    }

    public void choiceResponse() {
        this.choiceAnswer--;        
        System.out.println(this.getResponses().get(this.choiceAnswer));
        if(this.getResponses().get(this.choiceAnswer).contains("GAMEOVER")) {
            System.exit(this.choiceAnswer);
        } else if(this.getResponses().get(this.choiceAnswer).contains("ENCOUNTER")) {
            monsterEncount.startFighting();    
        }
    }
    
    public void runEncounter() {
        if (this.monsterEncount != null) {
            this.monsterEncount.startFighting();
        }
    }
}




