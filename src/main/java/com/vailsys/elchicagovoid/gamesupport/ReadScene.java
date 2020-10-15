
package com.vailsys.elchicagovoid.gamesupport;

import java.util.Scanner;

import com.vailsys.elchicagovoid.gamesupport.interfaces.IReadScene;

public class ReadScene implements IReadScene {
    private Scene scene;
    private Scanner sceneText;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Scene loadFileFromText(String myReader) {
        this.scene = new Scene();
        this.sceneText = new Scanner(myReader);
        this.sceneText.useDelimiter("\\s*--\\s*");

        while (this.sceneText.hasNext()) {
            this.scene.setTextDescription(this.scene.getTextDescription() + this.sceneText.next());
            this.scene.setChoicePrompt(this.scene.getChoicePrompt() + this.sceneText.next());

            Scanner scanChoices = new Scanner(this.sceneText.next());
            while (scanChoices.hasNextLine()) {
                this.scene.getChoices().add(scanChoices.nextLine());
            }

            Scanner scanResponses = new Scanner(this.sceneText.next());
            while (scanResponses.hasNextLine()) {
                this.scene.getResponses().add(scanResponses.nextLine());
            }

            this.scene.setEpilogue(this.scene.getEpilogue() + this.sceneText.next());
        }

        return this.scene;
    }
}