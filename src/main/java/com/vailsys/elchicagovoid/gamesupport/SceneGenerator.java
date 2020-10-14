package com.vailsys.elchicagovoid.gamesupport;

import java.util.List;

public class SceneGenerator {
    private String storyLine; 
    private Encounter monsterEncount; 
    private SuperHero hero; 
    private String choicePrompt; 
    private List<String> choiceQuestions; 
    private String choiceAnswer; 
    private List<String> choiceResponses;
    private SuperHero sidekick; 
    private Monster enemy; 

    public SceneGenerator(String storyLineFromApp, String choicePromptFromApp, List<String> choiceQuestionFromApp, List<String> choiceResponsesFromApp,  SuperHero heroFromApp, SuperHero sidekickFromApp, Monster enemyFromApp) {
        this.storyLine = storyLineFromApp;
        this.choicePrompt = choicePromptFromApp;
        this.choiceQuestions = choiceQuestionFromApp; 
        this.choiceResponses = choiceResponsesFromApp;
        this.hero = heroFromApp;
        this.sidekick = sidekickFromApp;
        this.enemy = enemyFromApp;
        this.monsterEncount = new Encounter(this.hero, this.sidekick, this.enemy);
    }

    public SceneGenerator(String storyLineFromApp, String choicePromptFromApp, List<String> choiceQuestionFromApp, List<String> choiceResponsesFromApp, SuperHero heroFromApp) {
        this.storyLine = storyLineFromApp;
        this.choicePrompt = choicePromptFromApp;
        this.choiceQuestions = choiceQuestionFromApp; 
        this.choiceResponses = choiceResponsesFromApp;
        this.hero = heroFromApp;
    }

    public void printStoryline() {
        System.out.println(this.storyLine);
        System.out.println("\n");
        System.out.println("Press ENTER to continue \n");
        System.console().readLine();
    }
    
    public String makeChoice() {
        System.out.println(this.choicePrompt);
        this.choiceQuestions.forEach(System.out::println);
        this.choiceAnswer = System.console().readLine();
        return this.choiceAnswer;
    }

    public void choiceResponse() {

        Integer integerChoice = Integer.parseInt(this.choiceAnswer);
        integerChoice--;
        
        System.out.println(this.choiceResponses.get(integerChoice)); //Arrays start at 0 but is equivalent to 1
        if(this.choiceResponses.get(integerChoice).contains("GAMEOVER")) {
            System.exit(integerChoice);
        } else if(this.choiceResponses.get(integerChoice).contains("ENCOUNTER")) {
            monsterEncount.StartFighting();    
        }
    }
    
    public void runEncounter() {
        if (this.monsterEncount != null) {
            this.monsterEncount.StartFighting();
        }
    }
}




