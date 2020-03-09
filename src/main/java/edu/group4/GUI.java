package edu.group4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Create panes for main
        VBox root = new VBox();
        Scene scene = new Scene(root);
        HBox menuBar = new HBox();
        HBox applicationBody = new HBox();

        //Add stylesheet
        scene.getStylesheets().add(getClass().getResource("/style/main.css").toExternalForm());

        //Set id for css
        root.setId("root");
        menuBar.setId("menuBar");
        applicationBody.setId("applicationBody");


        //Menubar children
        Button btnMenuMetaImage = new Button("MetaImage");
        Button btnMenuImport = new Button("Import");
        Button btnMenuCreate = new Button("Create");
        Button btnMenuSearch = new Button("Search");

        //ApplicationBody children
        Pane featurePane = new Pane();
        ScrollPane imageViewPane = new ScrollPane();
        Pane imageDetailPane = new Pane();

        //Set id for css
        featurePane.setId("featurePane");
        imageViewPane.setId("imageViewPane");
        imageDetailPane.setId("imageDetailPane");

        //Add panes and buttons to parent
        menuBar.getChildren().addAll(btnMenuMetaImage, btnMenuImport, btnMenuCreate, btnMenuSearch);
        applicationBody.getChildren().addAll(featurePane, imageViewPane, imageDetailPane);
        root.getChildren().addAll(menuBar, applicationBody);

        //Make panels resize
        root.setVgrow(applicationBody, Priority.ALWAYS);
        applicationBody.setHgrow(featurePane, Priority.ALWAYS);
        applicationBody.setHgrow(imageViewPane, Priority.ALWAYS);
        applicationBody.setHgrow(imageDetailPane, Priority.ALWAYS);


        //Display primaryStage
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
