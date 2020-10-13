
package com.vailsys.elchicagovoid.scenes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

  public void loadFileFromText() {
    try {
        File myObj = new File("src/main/java/com/vailsys/elchicagovoid/scenes/scenes1.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String dataFromSceneText = myReader.nextLine();            
            String textDescription = "";
            String choicePrompt = "";
            ArrayList<String> choices = new ArrayList<String>();
            ArrayList<String> responses = new ArrayList<String>();

            while (!dataFromSceneText.equals("--")) {
                textDescription += dataFromSceneText;
                dataFromSceneText = myReader.nextLine();
            }

            dataFromSceneText = myReader.nextLine();

            while (!dataFromSceneText.equals("--")) {
                choicePrompt += dataFromSceneText;
                dataFromSceneText = myReader.nextLine();
            }

            dataFromSceneText = myReader.nextLine();

            while (!dataFromSceneText.equals("--")) {
                choices.add(dataFromSceneText);
                dataFromSceneText = myReader.nextLine();
            }
            
            dataFromSceneText = myReader.nextLine();
            
            while (!dataFromSceneText.equals("--") && myReader.hasNextLine()) {
                responses.add(dataFromSceneText);
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