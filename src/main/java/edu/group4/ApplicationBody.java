package edu.group4;

import edu.group4.GUI.FeaturePaneHandler;
import edu.group4.GUI.ImageDetailPaneHandler;
import edu.group4.GUI.ImageViewPaneHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class ApplicationBody {
    private FeaturePaneHandler featurePaneHandler;
    private ImageViewPaneHandler imageViewPaneHandler;
    private ImageDetailPaneHandler imageDetailPaneHandler;

    public HBox createAppBody() {
        featurePaneHandler = new FeaturePaneHandler();
        imageViewPaneHandler = new ImageViewPaneHandler();
        imageDetailPaneHandler = new ImageDetailPaneHandler();

        HBox applicationBody = new HBox();
        applicationBody.setId("applicationBody");

        //ApplicationBody children
        Pane featurePane = featurePaneHandler.createFeaturePane();
        ScrollPane imageViewPane = imageViewPaneHandler.createImageViewPane();
        Pane imageDetailPane = imageDetailPaneHandler.createImageDetailPane();

        //Make body scalable
        applicationBody.setHgrow(featurePane, Priority.ALWAYS);
        applicationBody.setHgrow(imageViewPane, Priority.ALWAYS);
        applicationBody.setHgrow(imageDetailPane, Priority.ALWAYS);

        applicationBody.getChildren().addAll(featurePane, imageViewPane, imageDetailPane);
        return applicationBody;
    }
}
