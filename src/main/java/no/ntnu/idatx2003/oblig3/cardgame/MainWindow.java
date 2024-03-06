package no.ntnu.idatx2003.oblig3.cardgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainWindow extends Application{
    public void start(Stage stage) throws Exception{

        BorderPane rootNode = new BorderPane();

        HBox centerContainer = new HBox();
        centerContainer.setAlignment(Pos.CENTER);
        rootNode.setCenter(centerContainer);

        Button button = new Button("Click me");
        centerContainer.getChildren().add(button);

        stage.setScene(new Scene(rootNode, 800, 600));
        stage.setTitle("Card Game");
        stage.show();
    }

    public static void appMain(String[] args) {
        launch(args);
    }
}
