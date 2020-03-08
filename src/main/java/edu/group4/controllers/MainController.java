package edu.group4.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            updatePane("/fxml/features/metaImage.fxml", featurePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private HBox featureMenu;

    @FXML
    private Pane featurePane;

    @FXML
    private ScrollPane imageViewPane;

    @FXML
    private Pane imageDetailPane;

    @FXML
    void openTabCreate(ActionEvent event) throws IOException {
        updatePane("/fxml/features/create.fxml", featurePane);
    }

    @FXML
    void openTabImport(ActionEvent event) throws IOException {
        updatePane("/fxml/features/import.fxml", featurePane);
    }

    @FXML
    void openTabMetaImage(ActionEvent event) throws IOException {
        updatePane("/fxml/features/metaImage.fxml", featurePane);
    }

    @FXML
    void openTabSearch(ActionEvent event) throws IOException {
        updatePane("/fxml/features/search.fxml", featurePane);
    }

    private void updatePane(String path, Pane pane) throws IOException {
        Pane newPane = FXMLLoader.load(getClass().getResource(path));
        pane.getChildren().clear();
        pane.getChildren().add(newPane);
    }


}
