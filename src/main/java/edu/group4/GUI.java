package edu.group4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    FeatureMenuBar featureMenuBar;
    ApplicationBody applicationBody;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //initialize Objects
        featureMenuBar = new FeatureMenuBar();
        applicationBody = new ApplicationBody();

        //Create panes for main
        VBox root = new VBox();
        HBox menuBar = featureMenuBar.createMenuBar();
        HBox appBody = applicationBody.createAppBody();

        //Set id for panes
        root.setId("root");

        //Add panes and buttons to parent
        root.getChildren().addAll(menuBar, appBody);

        //Enable appBody vertical scale
        root.setVgrow(appBody, Priority.ALWAYS);

        //Display primaryStage
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/style/main.css").toExternalForm());
        primaryStage.setTitle("MetaImage");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(300);
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
