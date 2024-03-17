package no.ntnu.idatx2003.oblig3.cardgame;
/**
 * Represents the controller for the MainWindow class. It is responsible for
 * handling the user input and updating the view.
 */
public class MainWindowController{

    private Dealer dealer;
    private MainWindow mainWindow;

    /**
     * Creates an instance of the controller.
     * 
     * @param mainWindow the main window
     */
    public MainWindowController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.dealer = new Dealer();
    }

    /**
     * Handle the "Deal Hand" action.
     * 
     */
    public void deal() {
        dealer.setUpPokerGame();
        int index = 1;
        for (PlayingCard card : dealer.getGame().getHand().values()) {
            mainWindow.setCard(card, index);
            index++;
        }
    }

    /**
     * Handle the "Check Hand" action.
     * 
     */
    public void check() {
        mainWindow.setHearts(dealer.getHearts());
        mainWindow.setQueenOfSpades(dealer.hasQueenOfSpades());
        mainWindow.setSumOfFaces(dealer.getSumOfFaces());
        mainWindow.setFlush(dealer.isFlush());
    }
}