package edu.group4.GUI;

import javafx.scene.layout.Pane;

public class FeaturePaneHandler {
    private Pane featurePane;

    public Pane createFeaturePane() {
        featurePane = new Pane();
        featurePane.setId("featurePane");
        loadMetaImage();    //load first tab when initializing
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
