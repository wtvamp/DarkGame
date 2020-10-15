package com.vailsys.elchicagovoid.gamesupport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ReadSceneTest {

    @Test
    void testLoadFile() {
        ReadScene readScene = new ReadScene();
        String firstScene = 
        "@heroName wakes up in a body bag and notices that he is in a dark forest, " +
        "all he knows is that he must escape, even if it cost’s his life. \n " +
        "The air is full of fog and all he sees is nothing but dead animals and " +
        "human body parts scattered across the branches of the trees. \n" +
        "@heroName is going to have to figure out a way of this death maze." +
        "--" +
        "As he was walking, he stumbled across a teammate that is severely injured.  What should he do?" +
        "--" +
        "[1] Leave him \n" +
        "[2] Carry him \n" +
        "--" +
        "[1] A Spear is thrown at him but he was able to dodge it. A Goblin has appeared ENCOUNTER \n" +
        "[2] While he was carrying him, an unknown spear came and wasn't able to dodge it fast enough GAMEOVER \n" +
        "--" +
        "Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \n" +
        "Something has to be up with this forest.  He starts wandering in the forest, everything starts \n" +
        "looking the same.  He powers through because he remembers that he has something to fight for. \n" +
        "He starts to see stone structures in the distance. \n\nHe walks towards them.";
        readScene.loadFileFromText(firstScene);

        ArrayList<String> expectedChoices = new ArrayList<>();
        expectedChoices.add("[1] Leave him");
        expectedChoices.add("[2] Carry him ");

        ArrayList<String> expectedResponses = new ArrayList<>();
        expectedResponses.add("[1] A Spear is thrown at him but he was able to dodge it. A Goblin has appeared ENCOUNTER \n");
        expectedResponses.add("2] While he was carrying him, an unknown spear came and wasn't able to dodge it fast enough GAMEOVER \n");

        Scene expectedScene = new Scene(
        "@heroName wakes up in a body bag and notices that he is in a dark forest, " +
        "all he knows is that he must escape, even if it cost’s his life. \n " +
        "The air is full of fog and all he sees is nothing but dead animals and " +
        "human body parts scattered across the branches of the trees. \n" +
        "@heroName is going to have to figure out a way of this death maze.", 
        "As he was walking, he stumbled across a teammate that is severely injured.  What should he do?", 
        expectedChoices, 
        expectedResponses, 
        "Now that he has defeated the Goblin, the goblin's body morphs into black dust and fades away. \n" +
        "Something has to be up with this forest.  He starts wandering in the forest, everything starts \n" +
        "looking the same.  He powers through because he remembers that he has something to fight for. \n" +
        "He starts to see stone structures in the distance. \n\nHe walks towards them.");

        Scene parsedScene = readScene.getScene();
        assertEquals(expectedScene, parsedScene);
    }
}

