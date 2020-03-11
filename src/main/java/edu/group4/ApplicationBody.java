package edu.group4;

import edu.group4.gui.FeaturePaneHandler;
import edu.group4.gui.ImageDetailPaneHandler;
import edu.group4.gui.ImageViewPaneHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class ApplicationBody {
    private FeaturePaneHandler featurePaneHandler;
    private ImageViewPaneHandler imageViewPaneHandler;
    private ImageDetailPaneHandler imageDetailPaneHandler;
    HBox applicationBody;

    public ApplicationBody() {
        this.featurePaneHandler = new FeaturePaneHandler();
        this.imageViewPaneHandler = new ImageViewPaneHandler();
        this.imageDetailPaneHandler = new ImageDetailPaneHandler();
        this.applicationBody = new HBox();
        this.applicationBody.setId("applicationBody");
    }

    public HBox createAppBody() {
        //ApplicationBody children
        Pane featurePane = featurePaneHandler.getPane();
        ScrollPane imageViewPane = imageViewPaneHandler.getPane();
        Pane imageDetailPane = imageDetailPaneHandler.getPane();

        //Make body scalable
        applicationBody.setHgrow(featurePane, Priority.ALWAYS);
        applicationBody.setHgrow(imageViewPane, Priority.ALWAYS);
        applicationBody.setHgrow(imageDetailPane, Priority.ALWAYS);

        applicationBody.getChildren().addAll(featurePane, imageViewPane, imageDetailPane);
        return applicationBody;
    }
}
