
package com.vailsys.elchicagovoid.gamesupport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile implements IReadFile {
    private String textDescription;
    private String choicePrompt;
    private ArrayList<String> choices;
    private ArrayList<String> responses;
    private String epilogue;

    public ReadFile() {
        this.textDescription = "";
        this.setChoicePrompt("");
        this.choices = new ArrayList<>();
        this.responses = new ArrayList<>();
    }

    public String getEpilogue() {
        return epilogue;
    }

    public void setEpilogue(String epilogue) {
        this.epilogue = epilogue;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void setResponses(List<String> responses) {
        this.responses = (ArrayList<String>) responses;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = (ArrayList<String>) choices;
    }

    public String getChoicePrompt() {
        return choicePrompt;
    }

    public void setChoicePrompt(String choicePrompt) {
        this.choicePrompt = choicePrompt;
    }

    public String getTextDescription() {
        return this.textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public void loadFileFromText() {
        try {
            File myObj = new File("src/main/java/com/vailsys/elchicagovoid/scenes/scenes1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String dataFromSceneText = myReader.nextLine();

                while (!dataFromSceneText.equals("--")) {
                    this.textDescription += dataFromSceneText;
                    dataFromSceneText = myReader.nextLine();
                }

                dataFromSceneText = myReader.nextLine();

                while (!dataFromSceneText.equals("--")) {
                    this.setChoicePrompt(this.getChoicePrompt() + dataFromSceneText);
                    dataFromSceneText = myReader.nextLine();
                }

                dataFromSceneText = myReader.nextLine();

                while (!dataFromSceneText.equals("--")) {
                    this.choices.add(dataFromSceneText);
                    dataFromSceneText = myReader.nextLine();
                }
                
                dataFromSceneText = myReader.nextLine();
                
                while (!dataFromSceneText.equals("--")) {
                    this.responses.add(dataFromSceneText);
                    dataFromSceneText = myReader.nextLine();
                }

                dataFromSceneText = myReader.nextLine();

                while (!dataFromSceneText.equals("--") && myReader.hasNextLine()) {
                    this.setEpilogue(this.getEpilogue() + dataFromSceneText);
                    dataFromSceneText = myReader.nextLine();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}