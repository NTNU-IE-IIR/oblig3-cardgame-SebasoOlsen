package no.ntnu.idatx2003.oblig3.cardgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Represents the main window of the application.
 * 
 */
public class MainWindow extends Application{

    private MainWindowController controller;


    @Override
    public void start(Stage stage) throws Exception{
        this.controller = new MainWindowController(this);

        BorderPane rootNode = new BorderPane();

        FlowPane centerContainer = new FlowPane();
        centerContainer.setAlignment(Pos.CENTER);
        rootNode.setCenter(centerContainer);

        HBox buttonContainer = new HBox();
        buttonContainer.setAlignment(Pos.BOTTOM_CENTER);
        rootNode.setBottom(buttonContainer);

        Button dealButton = new Button("Deal Hand");
        dealButton.setOnAction(e -> controller.deal());
        buttonContainer.getChildren().add(dealButton);

        stage.setScene(new Scene(rootNode, 800, 600));
        stage.setTitle("Card Game");
        stage.show();
    }

    public static void appMain(String[] args) {
        launch(args);
    }
}
