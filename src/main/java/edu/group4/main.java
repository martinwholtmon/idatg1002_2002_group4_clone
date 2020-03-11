package edu.group4;

import edu.group4.gui.FeaturePaneHandler;
import edu.group4.gui.ImageDetailPaneHandler;
import edu.group4.gui.ImageViewPaneHandler;
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

public class main extends Application {
    private FeaturePaneHandler featurePaneHandler;
    private ImageViewPaneHandler imageViewPaneHandler;
    private ImageDetailPaneHandler imageDetailPaneHandler;
    private HBox menuBar;
    private HBox applicationBody;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //initiating
        this.featurePaneHandler = new FeaturePaneHandler();
        this.imageViewPaneHandler = new ImageViewPaneHandler();
        this.imageDetailPaneHandler = new ImageDetailPaneHandler();

        //Creating panes
        this.menuBar = new HBox();
        this.applicationBody = new HBox();

        //Create panes for main
        VBox root = new VBox();
        HBox menuBar = createMenuBar();
        HBox appBody = createAppBody();

        //Set id for panes
        root.setId("root");
        this.menuBar.setId("menuBar");
        this.applicationBody.setId("applicationBody");

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

    public HBox createMenuBar() {
        //Menubar children
        Button btnMenuMetaImage = new Button("MetaImage");
        Button btnMenuImport = new Button("Import");
        Button btnMenuCreate = new Button("Create");
        Button btnMenuSearch = new Button("Search");

        btnMenuMetaImage.setOnAction(e -> featurePaneHandler.loadMetaImage());
        btnMenuImport.setOnAction(e -> featurePaneHandler.loadImport());
        btnMenuCreate.setOnAction(e -> featurePaneHandler.loadCreate());
        btnMenuSearch.setOnAction(e -> featurePaneHandler.loadSearch());

        menuBar.getChildren().addAll(btnMenuMetaImage, btnMenuImport, btnMenuCreate, btnMenuSearch);
        return menuBar;
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
