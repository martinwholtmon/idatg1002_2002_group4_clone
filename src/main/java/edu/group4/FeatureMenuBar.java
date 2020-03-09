package edu.group4;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class FeatureMenuBar {
    public HBox createMenuBar() {
        HBox menuBar = new HBox();
        menuBar.setId("menuBar");

        //Menubar children
        Button btnMenuMetaImage = new Button("MetaImage");
        Button btnMenuImport = new Button("Import");
        Button btnMenuCreate = new Button("Create");
        Button btnMenuSearch = new Button("Search");

        menuBar.getChildren().addAll(btnMenuMetaImage, btnMenuImport, btnMenuCreate, btnMenuSearch);
        return menuBar;
    }
}
