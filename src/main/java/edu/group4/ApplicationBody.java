package edu.group4;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class ApplicationBody {
    public HBox createAppBody() {
        HBox applicationBody = new HBox();
        applicationBody.setId("applicationBody");

        //ApplicationBody children
        Pane featurePane = new Pane();
        ScrollPane imageViewPane = new ScrollPane();
        Pane imageDetailPane = new Pane();

        //Set id for children of pane
        featurePane.setId("featurePane");
        imageViewPane.setId("imageViewPane");
        imageDetailPane.setId("imageDetailPane");

        //Make body scalable
        applicationBody.setHgrow(featurePane, Priority.ALWAYS);
        applicationBody.setHgrow(imageViewPane, Priority.ALWAYS);
        applicationBody.setHgrow(imageDetailPane, Priority.ALWAYS);

        applicationBody.getChildren().addAll(featurePane, imageViewPane, imageDetailPane);
        return applicationBody;
    }
}
