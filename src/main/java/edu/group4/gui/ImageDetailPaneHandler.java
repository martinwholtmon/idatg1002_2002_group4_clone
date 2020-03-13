package edu.group4.gui;

import javafx.scene.layout.Pane;

public class ImageDetailPaneHandler {
    private Pane imageDetailPane;

    public ImageDetailPaneHandler() {
        this.imageDetailPane = new Pane();
        this.imageDetailPane.setId("imageDetailPane");
    }

    public Pane getPane() {
        return this.imageDetailPane;
    }
}
