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
    }
    
    /**
     * Handle the "Check Hand" action.
     * 
     */
    public void check() {
        boolean hasQueenOfSpades = dealer.hasQueenOfSpades();
        int sumOfFaces = dealer.getSumOfFaces();
        String hearts = dealer.getHearts();
        boolean isFlush = dealer.isFlush();
    }
}