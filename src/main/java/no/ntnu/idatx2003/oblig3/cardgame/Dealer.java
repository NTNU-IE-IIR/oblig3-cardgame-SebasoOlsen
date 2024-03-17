package no.ntnu.idatx2003.oblig3.cardgame;


/**
 * Class representing a dealer in a card game.
 * The dealer is responsible for creating game states.
 * The dealer gets a deck of cards, and makes game states based on that deck.
 * 
 */
public class Dealer {

    private PokerLikeGame game;
    private DeckOfCards deck;

    /**
     * Creates a new instance of a dealer.
     */
    public Dealer() {
    }

    /**
     * Returns a pokerlike filled with cards form a deck of cards.
     * 
     * @return a pokerlike game
     */
    public void setUpPokerGame() {
        this.deck = new DeckOfCards();
        this.game = new PokerLikeGame();
        for (int i = 0; i < 5; i++) {
            game.addCard(deck.getRandomCard());
        }
    }

    /**
     * Returns true if the hand has the card Queen of Spades, false otherwise.
     */
    public boolean hasQueenOfSpades() {
        return game.hasQueenOfSpades();
    }

    /**
     * Returns the sum of all faces in the hand.
     */
    public int getSumOfFaces() {
        return game.getSumOfFaces();
    }

    /**
     * Returns the suit and face of every heart card in the hand.
     * If no hand has no hearts, "No hearts" is returned.
     */
    public String getHearts() {
        return game.getHearts();
    }

    /**
     * Returns true if the hand is a flush, false otherwise.
     */
    public boolean isFlush() {
        return game.isFlush();
    }

    /**
     * Returns the game.
     * 
     * @return the game
     */
    public PokerLikeGame getGame() {
        return game;
    }
    
}