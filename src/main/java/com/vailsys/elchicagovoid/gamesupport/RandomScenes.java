package com.vailsys.elchicagovoid.gamesupport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomScenes {

    private ArrayList<Scene> scenes;
    private String fileLocation;
    private Scanner readScenes;
    private File scenesTextFile;
    private ReadScene scene;

    public RandomScenes() {
        this.scenes = new ArrayList<>();
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public List<Scene> getScenes() {
        return this.scenes;
    }

    public void loadScenesFromTextFile(String fileLocation) {
        this.fileLocation = fileLocation;
        this.scenesTextFile = new File(this.fileLocation);
        try {
            this.readScenes = new Scanner(this.scenesTextFile);
            this.readScenes.useDelimiter("\\s*----\\s*");
            while(this.readScenes.hasNext()) {
                this.scene = new ReadScene();
                this.scene.loadFileFromText(this.readScenes.next());
                this.scenes.add(this.scene.getScene());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.readScenes.close();
    }
}
