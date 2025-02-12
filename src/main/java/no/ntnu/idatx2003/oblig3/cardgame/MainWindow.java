package no.ntnu.idatx2003.oblig3.cardgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
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
        centerContainer.setStyle("-fx-background-color: #27b00b;");
        centerContainer.setAlignment(Pos.CENTER);
        rootNode.setCenter(centerContainer);

        this.Card1 = new Label("-");
        centerContainer.getChildren().add(this.Card1);
        this.Card1.setPrefSize(100, 30);
        this.Card1.setFont(javafx.scene.text.Font.font(20));

        this.Card2 = new Label("-");
        centerContainer.getChildren().add(this.Card2);
        this.Card2.setPrefSize(100, 30);
        this.Card2.setFont(javafx.scene.text.Font.font(20));

        this.Card3 = new Label("-");
        centerContainer.getChildren().add(this.Card3);
        this.Card3.setPrefSize(100, 30);
        this.Card3.setFont(javafx.scene.text.Font.font(20));

        this.Card4 = new Label("-");
        centerContainer.getChildren().add(this.Card4);
        this.Card4.setPrefSize(100, 30);
        this.Card4.setFont(javafx.scene.text.Font.font(20));

        this.Card5 = new Label("-");
        centerContainer.getChildren().add(this.Card5);
        this.Card5.setPrefSize(100, 30);
        this.Card5.setFont(javafx.scene.text.Font.font(20));

        GridPane bottomGridPane = new GridPane();
        rootNode.setBottom(bottomGridPane);
        bottomGridPane.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        bottomGridPane.getColumnConstraints().add(col1);
        

        RowConstraints row1 = new RowConstraints();
        row1.setVgrow(Priority.ALWAYS);
        bottomGridPane.getRowConstraints().add(row1);

        Button dealButton = new Button("Deal Hand");
        dealButton.setOnAction(e -> controller.deal());
        bottomGridPane.getChildren().add(dealButton);
        bottomGridPane.setConstraints(dealButton, 0, 0);

        Button checkButton = new Button("Check Hand");
        checkButton.setOnAction(e -> controller.check());
        bottomGridPane.getChildren().add(checkButton);
        bottomGridPane.setConstraints(checkButton, 0, 1);

        HBox heartsBox = new HBox();
        //heartsBox.setMinSize(200, 0);
        bottomGridPane.getChildren().add(heartsBox);
        bottomGridPane.setConstraints(heartsBox, 1, 0);

        HBox queenOfSpadesBox = new HBox();
        //queenOfSpadesBox.setMinSize(200, 0);
        bottomGridPane.getChildren().add(queenOfSpadesBox);
        bottomGridPane.setConstraints(queenOfSpadesBox, 1, 1);

        HBox sumOfFacesBox = new HBox();
        //sumOfFacesBox.setMinSize(200, 0);
        bottomGridPane.getChildren().add(sumOfFacesBox);
        bottomGridPane.setConstraints(sumOfFacesBox, 2, 0);

        HBox flushBox = new HBox();
        //flushBox.setMinSize(200, 0);  
        bottomGridPane.getChildren().add(flushBox);
        bottomGridPane.setConstraints(flushBox, 2, 1);

        Label heartsLabel = new Label("Hearts: ");
        this.Hearts = new Label("-");
        heartsBox.getChildren().add(heartsLabel);
        heartsBox.getChildren().add(this.Hearts);
        this.Hearts.setFont(javafx.scene.text.Font.font(20));
        heartsLabel.setFont(javafx.scene.text.Font.font(20));

        Label queenOfSpadesLabel = new Label("Queen of Spades: ");
        this.QueenOfSpades = new Label("-");
        queenOfSpadesBox.getChildren().add(queenOfSpadesLabel);
        queenOfSpadesBox.getChildren().add(this.QueenOfSpades);
        this.QueenOfSpades.setFont(javafx.scene.text.Font.font(20));
        queenOfSpadesLabel.setFont(javafx.scene.text.Font.font(20));

        Label sumOfFacesLabel = new Label("Sum of Faces: ");
        this.SumOfFaces = new Label("-");
        sumOfFacesBox.getChildren().add(sumOfFacesLabel);
        sumOfFacesBox.getChildren().add(this.SumOfFaces);
        this.SumOfFaces.setFont(javafx.scene.text.Font.font(20));
        sumOfFacesLabel.setFont(javafx.scene.text.Font.font(20));

        Label flushLabel = new Label("Flush: ");
        this.Flush = new Label("-");
        flushBox.getChildren().add(flushLabel);
        flushBox.getChildren().add(this.Flush);
        this.Flush.setFont(javafx.scene.text.Font.font(20));
        flushLabel.setFont(javafx.scene.text.Font.font(20));

        stage.setScene(new Scene(rootNode, 800, 600));
        stage.setTitle("Card Game");
        stage.show();
    }

    public static void appMain(String[] args) {
        launch(args);
    }

    public void setCard(PlayingCard card, int index) {
        switch(index) {
            case 0:
                this.Card1.setText(card.getAsString());
                break;
            case 1:
                this.Card2.setText(card.getAsString());
                break;
            case 2:
                this.Card3.setText(card.getAsString());
                break;
            case 3:
                this.Card4.setText(card.getAsString());
                break;
            case 4:
                this.Card5.setText(card.getAsString());
                break;
        }
    }

    public void setHearts(String hearts) {
        this.Hearts.setText(hearts);
    }

    public void setQueenOfSpades(boolean hasQueenOfSpades) {
        this.QueenOfSpades.setText(hasQueenOfSpades ? "Yes" : "No");
    }

    public void setSumOfFaces(int sumOfFaces) {
        this.SumOfFaces.setText(Integer.toString(sumOfFaces));
    }

    public void setFlush(boolean isFlush) {
        this.Flush.setText(isFlush ? "Yes" : "No");
    }
    
}
