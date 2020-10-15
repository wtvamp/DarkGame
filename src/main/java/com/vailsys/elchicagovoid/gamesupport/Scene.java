package com.vailsys.elchicagovoid.gamesupport;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private String textDescription;
    private String choicePrompt;
    private ArrayList<String> choices;
    private ArrayList<String> responses;
    private String epilogue;

    public Scene(
        String textDescription, 
        String choicePrompt, 
        List<String> choices, 
        List<String> responses,
        String epilogue
    ) {
            this.textDescription = textDescription;
            this.choicePrompt = choicePrompt;
            this.choices = (ArrayList<String>) choices;
            this.responses = (ArrayList<String>) responses;
            this.epilogue = epilogue;
    }

    public Scene() {
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
}
