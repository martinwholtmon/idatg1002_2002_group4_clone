package edu.group4;

import edu.group4.gui.FeaturePaneHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class FMenuBar {
    private FeaturePaneHandler featurePaneHandler;
    private HBox menuBar;

    public FMenuBar() {
        featurePaneHandler = new FeaturePaneHandler();
        this.menuBar = new HBox();
        menuBar.setId("menuBar");

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
}
