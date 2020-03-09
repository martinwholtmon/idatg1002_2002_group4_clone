package edu.group4.gui;

import javafx.scene.control.ScrollPane;

public class ImageViewPaneHandler {
    ScrollPane root;

    public ScrollPane createImageViewPane() {
        root = new ScrollPane();
        root.setId("imageViewPane");
        return root;
    }
}
