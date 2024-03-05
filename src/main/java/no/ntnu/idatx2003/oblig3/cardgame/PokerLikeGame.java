package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.HashMap;

/**
 * Represents a poker-like game.
 * A poker-like game has a hand of cards, and the hand is represented by a HashMap where the key is a combination of the suit and face of the card, and the value is the card itself.
 * 
 * <p> The following functions are implemented:
 * <ul>
 * <li>addCard</li>
 * <li>getSumOfFaces</li>
 * <li>hasQueenOfSpades</li>
 * <li>getHearts</li>
 * <li>isFlush</li>
 * </ul>
 * 
 * 
 */
public class PokerLikeGame {
    
    private HashMap<String, PlayingCard> hand;

    /**
     * Creates an instance of a hand of cards.
     * Each hand has 5 cards.
     */
    public PokerLikeGame() {
        this.hand = new HashMap<String, PlayingCard>();
    }


    public void addCard(PlayingCard playingCard1) {
        this.hand.put(playingCard1.getAsString(), playingCard1);
    }
    /**
     * Gets the sum of all faces in the hand.
     */
    public int getSumOfFaces() {
        int sum = 0;
        for (PlayingCard card : hand.values()) {
            sum += card.getFace();
        }
        return sum;
    }

    /**
     * Checks if the hand has the card Queen of Spades.
     * 
     * @return true if the hand has the card Queen of Spades, false otherwise
     */
    public boolean hasQueenOfSpades() {
        return hand.containsKey("S12");
    }

    /**
     * Returns number of hearts in the hand.
     * 
     * Returns the suit and face of every heart card in the hand.
     * If no hand has no hearts, "No hearts" is returned.
     * 
     * @return the suit and face of every heart card in the hand, or "No hearts" if no hearts are in the hand
     */
    public String getHearts() {
        String hearts = "";
        for (PlayingCard card : hand.values()) {
            if (card.getSuit() == 'H') {
                hearts += card.getAsString() + " ";
            }
        }
        if (hearts.equals("")) {
            return "No hearts";
        }
        return hearts;
    }

    /**
     * Checks if each card in the hand has the same suit.
     * 
     * @return true if each card in the hand has the same suit, false otherwise
     */
    public boolean isFlush() {
        char suit = hand.values().iterator().next().getSuit();
        for (PlayingCard card : hand.values()) {
            if (card.getSuit() != suit) {
                return false;
            }
        }
        return true;
    }
}
