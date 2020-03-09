package edu.group4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Create panes for main
        Pane root = new VBox();
        HBox menuBar = new HBox();
        HBox applicationBody = new HBox();

        //Menubar children
        Button btnMenuMetaImage = new Button("MetaImage");
        Button btnMenuImport = new Button("Import");
        Button btnMenuCreate = new Button("Create");
        Button btnMenuSearch = new Button("Search");

        //ApplicationBody children
        Pane featurePane = new Pane();
        ScrollPane ImageViewPane = new ScrollPane();
        Pane imageDetailPane = new Pane();

        //Add panes and buttons to parent
        menuBar.getChildren().addAll(btnMenuMetaImage, btnMenuImport, btnMenuCreate, btnMenuSearch);
        applicationBody.getChildren().addAll(featurePane, ImageViewPane, imageDetailPane);
        root.getChildren().addAll(menuBar, applicationBody);

        //Set scene and stylesheet - Display primaryStage
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/style/main.css").toExternalForm());
        primaryStage.setTitle("MetaImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
