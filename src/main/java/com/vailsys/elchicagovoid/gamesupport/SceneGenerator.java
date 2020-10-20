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
            .replace("@heroName", hero.getCharacterName + " the " + hero.HeroName)
            .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
        );
        System.out.println("\n");
        System.out.println("Press ENTER to continue \n");
        System.console().readLine();
    }
    
    public void makeChoice() {
        System.out.println(getChoicePrompt()
            .replace("@heroName", hero.characterName + " the " + hero.HeroName)
            .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
        );
        for(String choice : getChoices()) {
            System.out.println(choice 
                .replace("@heroName", hero.characterName + " the " + hero.HeroName)
                .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
            );
        }
        System.out.println("\n\n");
        this.choiceAnswer = Integer.parseInt(System.console().readLine());
    }

    public void choiceResponse() {
        this.choiceAnswer--;        
        // Print the response message
        System.out.println(this.getResponses().get(this.choiceAnswer)
            .replace("@heroName", hero.characterName + " the " + hero.HeroName)
            .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
        );
        System.out.println("\n\n");
        
        // handle actions based on keywords in text
        if(this.getResponses().get(this.choiceAnswer).contains("GAMEOVER")) {
            System.exit(this.choiceAnswer);
        } else if(this.getResponses().get(this.choiceAnswer).contains("ENCOUNTER")) {
            if (this.getResponses().get(this.choiceAnswer).contains("GOBLIN")) {
                monsterEncount.setMonsterHeFights(new Monster("Goblin", 100, "Heehee", "Green", new Weapon(3, 3, "Spear", "Physical")));
            }
            if (this.getResponses().get(this.choiceAnswer).contains("ZOMBIE")) {
                monsterEncount.setMonsterHeFights(new Monster("Zombie", 100,"rauggghh", "Grey", new Weapon( 3,3, "Bite","Physical")));
            }
            if (this.getResponses().get(this.choiceAnswer).contains("TV")) {
                monsterEncount.setMonsterHeFights(new Monster("Television", 100, "ZZzzzZ *Static*", "White", new Weapon(3, 3, "Electrecution", "Electric")));
            }
            if (this.getResponses().get(this.choiceAnswer).contains("SKELETON")) {
                monsterEncount.setMonsterHeFights(new Monster( "Skeleton",100, "crackel", "White", new Weapon(4,4, "Bone", "Physical")));
            }            
            if (this.getResponses().get(this.choiceAnswer).contains("GHOST")) {
                monsterEncount.setMonsterHeFights(new Monster("Ghost",200,"BOO BOO","Transperent", new Weapon(4,4,"Memory Loss","Mental")));
            }
            if (this.getResponses().get(this.choiceAnswer).contains("FREDDY")) {
                monsterEncount.setMonsterHeFights(new Monster("Freddy Fazbear",200, "Welcome to Freddy Fazbear's pizza", "Brown", new Weapon(4,4,"Bite","Metal")));
            }
            
            monsterEncount.monsterTaunts();
            monsterEncount.startFighting();    
        }
    }
    

	public void printEpilogue() {
        System.out.println(this.getEpilogue()
            .replace("@heroName", hero.characterName + " the " + hero.HeroName)
            .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
        );
        System.out.println("\n");
        System.out.println("Press ENTER to continue \n");
        System.console().readLine();
	}
}




