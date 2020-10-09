package gamesupport;

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
        switch (this.choiceAnswer)
        { 
            case "1":
                System.out.println(this.choiceResponses.get(0));
                break;
            case "2":
                System.out.println(this.choiceResponses.get(1));
                break;
            default:
                System.out.println(this.choiceResponses.get(1));
                break;

        }
    }

    public void runEncounter() {
        if (this.monsterEncount != null) {
            this.monsterEncount.StartFighting();
        }
    }
}




