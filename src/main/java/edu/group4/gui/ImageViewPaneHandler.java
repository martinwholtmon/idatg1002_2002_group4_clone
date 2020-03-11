package edu.group4.gui;

import javafx.scene.control.ScrollPane;

public class ImageViewPaneHandler {
    ScrollPane imageViewPane;

    public ImageViewPaneHandler() {
        this.imageViewPane = new ScrollPane();
        this.imageViewPane.setId("imageViewPane");
    }

    public ScrollPane getPane() {
        return this.imageViewPane;
    }
}
