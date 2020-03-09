package edu.group4.GUI;

import javafx.scene.layout.Pane;

public class ImageDetailPaneHandler {
    private Pane imageDetailPane;

    public Pane createImageDetailPane() {
        imageDetailPane = new Pane();
        imageDetailPane.setId("imageDetailPane");
        return imageDetailPane;
    }
}
