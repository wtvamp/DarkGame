package com.vailsys.elchicagovoid.gamesupport;

import java.util.List;

public class SceneGenerator extends Scene {
    private Encounter monsterEncount; 
    private SuperHero hero; 
    private SuperHero sidekick; 
    private Monster enemy; 
    private Integer choiceAnswer;

    public SceneGenerator(String storyLineFromApp, String choicePromptFromApp, List<String> choiceQuestionFromApp, List<String> choiceResponsesFromApp, String epilogue, SuperHero heroFromApp, SuperHero sidekickFromApp, Monster enemyFromApp) {
        super(storyLineFromApp, choicePromptFromApp, choiceQuestionFromApp, choiceResponsesFromApp, epilogue);
        this.hero = heroFromApp;
        this.sidekick = sidekickFromApp;
        this.enemy = enemyFromApp;
        this.monsterEncount = new Encounter(this.hero, this.sidekick, this.enemy);
    }

    public SceneGenerator(String storyLineFromApp, String choicePromptFromApp, List<String> choiceQuestionFromApp, List<String> choiceResponsesFromApp, String epilogue, SuperHero heroFromApp) {
        super(storyLineFromApp, choicePromptFromApp, choiceQuestionFromApp, choiceResponsesFromApp, epilogue);
        this.hero = heroFromApp;
    }

    public SceneGenerator(Scene scene, SuperHero hero, SuperHero sidekick, Monster monster) {
        super(scene.getTextDescription(), scene.getChoicePrompt(), scene.getChoices(), scene.getResponses(), scene.getEpilogue());
        this.hero = hero;
        this.sidekick = sidekick;
        this.monsterEncount = new Encounter(hero, sidekick, monster);
    }

    public void printStoryline() {
        System.out.println(getTextDescription());
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
        
        System.out.println(this.getResponses().get(this.choiceAnswer)); //Arrays start at 0 but is equivalent to 1
        if(this.getResponses().get(this.choiceAnswer).contains("GAMEOVER")) {
            System.exit(this.choiceAnswer);
        } else if(this.getResponses().get(this.choiceAnswer).contains("ENCOUNTER")) {
            monsterEncount.StartFighting();    
        }
    }
    
    public void runEncounter() {
        if (this.monsterEncount != null) {
            this.monsterEncount.StartFighting();
        }
    }
}




