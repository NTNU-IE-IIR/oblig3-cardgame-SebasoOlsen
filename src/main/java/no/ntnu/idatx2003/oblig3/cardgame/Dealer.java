package no.ntnu.idatx2003.oblig3.cardgame;


/**
 * Class representing a dealer in a card game.
 * The dealer is responsible for creating game states.
 * The dealer gets a deck of cards, and makes game states based on that deck.
 * 
 */
public class Dealer {

    /**
     * Creates a new instance of a dealer.
     */
    public Dealer() {
    }

    /**
     * Returns a pokerlike filled with cards form a deck of cards.
     * 
     * 
     * 
     * @return a pokerlike game
     */
    private PokerLikeGame setUpPokerGame() {
        DeckOfCards deck = new DeckOfCards();
        PokerLikeGame game = new PokerLikeGame();
        for (int i = 0; i < 5; i++) {
            game.addCard(deck.getRandomCard());
        }
        return game;
    }

}