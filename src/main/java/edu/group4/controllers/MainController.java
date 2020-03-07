package edu.group4.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainController {

    @FXML
    private Button btnMetaImage;

    @FXML
    private Button btnImport;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnCreate;

    @FXML
    private AnchorPane featurePane;

    @FXML
    private AnchorPane imageInfoPane;

    @FXML
    private ScrollPane imageViewPane;

    @FXML
    void openFeatureMetaImage(ActionEvent event) throws IOException {
        Pane newPane = FXMLLoader.load(getClass().getResource("/edu.group4/fxml/metaImage.fxml"));
        featurePane.getChildren().clear();
        featurePane.getChildren().add(newPane);
    }

}

