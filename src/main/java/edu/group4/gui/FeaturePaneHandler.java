package edu.group4.gui;

import javafx.scene.layout.Pane;

public class FeaturePaneHandler {
    private Pane featurePane;

    public FeaturePaneHandler() {
        this.featurePane = new Pane();
        this.featurePane.setId("featurePane");
        loadMetaImage();
    }

    public Pane getPane() {
        return featurePane;
    }

    public void loadMetaImage() {
        System.out.println("MetaImage Clicked!");
    }

    public void loadImport() {
        System.out.println("Import Clicked");
    }

    public void loadCreate() {
        System.out.println("Create Clicked");
    }

    public void loadSearch() {
        System.out.println("Search Clicked");
    }
}
