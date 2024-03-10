package no.ntnu.idatx2003.oblig3.cardgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Represents the main window of the application.
 * 
 */
public class MainWindow extends Application{

    private MainWindowController controller;
    private Label Hearts;
    private Label QueenOfSpades;
    private Label SumOfFaces;
    private Label Flush;
    private Label Card1;
    private Label Card2;
    private Label Card3;
    private Label Card4;
    private Label Card5;




    @Override
    public void start(Stage stage) throws Exception{
        this.controller = new MainWindowController(this);

        BorderPane rootNode = new BorderPane();

        FlowPane centerContainer = new FlowPane();
        centerContainer.setStyle("-fx-background-color: #00ff00;");
        centerContainer.setAlignment(Pos.CENTER);
        rootNode.setCenter(centerContainer);
        centerContainer.setHgap(20);

        this.Card1 = new Label("A1");
        centerContainer.getChildren().add(this.Card1);

        this.Card2 = new Label("B2");
        centerContainer.getChildren().add(this.Card2);

        this.Card3 = new Label("C3");
        centerContainer.getChildren().add(this.Card3);

        this.Card4 = new Label("D4");
        centerContainer.getChildren().add(this.Card4);

        this.Card5 = new Label("E5");
        centerContainer.getChildren().add(this.Card5);

        HBox bottomContainer = new HBox();
        bottomContainer.setStyle("-fx-background-color: #ff0000;");
        bottomContainer.setAlignment(Pos.BOTTOM_CENTER);
        rootNode.setBottom(bottomContainer);

        GridPane bottomButtonsContainer = new GridPane();
        bottomButtonsContainer.setAlignment(Pos.CENTER_LEFT);
        bottomButtonsContainer.setStyle("-fx-background-color: #0000ff;");
        bottomContainer.getChildren().add(bottomButtonsContainer);

        

        Button dealButton = new Button("Deal Hand");
        dealButton.setOnAction(e -> controller.deal());
        bottomButtonsContainer.getChildren().add(dealButton);
        bottomButtonsContainer.setConstraints(dealButton, 0, 0);

        Button checkButton = new Button("Check Hand");
        checkButton.setOnAction(e -> controller.check());
        bottomButtonsContainer.getChildren().add(checkButton);
        bottomButtonsContainer.setConstraints(checkButton, 0, 3);

        Label heartsLabel = new Label("Hearts: ");
        this.Hearts = new Label("-");
        bottomButtonsContainer.getChildren().add(heartsLabel);
        bottomButtonsContainer.getChildren().add(this.Hearts);
        bottomButtonsContainer.setConstraints(heartsLabel, 3, 0);
        bottomButtonsContainer.setConstraints(this.Hearts, 4, 0);

        Label queenOfSpadesLabel = new Label("Queen of Spades: ");
        this.QueenOfSpades = new Label("-");
        bottomButtonsContainer.getChildren().add(queenOfSpadesLabel);
        bottomButtonsContainer.getChildren().add(this.QueenOfSpades);
        bottomButtonsContainer.setConstraints(queenOfSpadesLabel, 3, 1);
        bottomButtonsContainer.setConstraints(this.QueenOfSpades, 4,1);

        Label sumOfFacesLabel = new Label("Sum of Faces: ");
        this.SumOfFaces = new Label("-");
        bottomButtonsContainer.getChildren().add(sumOfFacesLabel);
        bottomButtonsContainer.getChildren().add(this.SumOfFaces);
        bottomButtonsContainer.setConstraints(sumOfFacesLabel, 3, 2);
        bottomButtonsContainer.setConstraints(this.SumOfFaces, 4, 2);

        Label flushLabel = new Label("Flush: ");
        this.Flush = new Label("-");
        bottomButtonsContainer.getChildren().add(flushLabel);
        bottomButtonsContainer.getChildren().add(this.Flush);
        bottomButtonsContainer.setConstraints(flushLabel, 3, 3);
        bottomButtonsContainer.setConstraints(this.Flush, 4, 3);



        stage.setScene(new Scene(rootNode, 800, 600));
        stage.setTitle("Card Game");
        stage.show();
    }

    public static void appMain(String[] args) {
        launch(args);
    }
}
