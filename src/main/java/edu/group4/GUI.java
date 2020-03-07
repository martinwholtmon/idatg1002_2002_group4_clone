package edu.group4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("/edu.group4/fxml/metaimage.fxml"));


        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/edu.group4/style/MetaImage.css").toExternalForm());
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
