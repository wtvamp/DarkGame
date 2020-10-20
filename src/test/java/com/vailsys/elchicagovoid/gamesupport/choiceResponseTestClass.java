public class choiceResponse{


public void choiceResponse() {
    this.choiceAnswer--;        
    // Print the response message
    System.out.println(this.getResponses().get(this.choiceAnswer)
        .replace("@heroName", hero.characterName + " the " + hero.HeroName)
        .replace("@partnerName", sidekick.characterName + " the " + sidekick.HeroName)
    );
    System.out.println("\n\n");
    }
}
