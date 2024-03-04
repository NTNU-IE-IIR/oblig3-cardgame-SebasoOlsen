package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.HashMap;

/**
 * Represents a hand of cards.
 * 
 */
public class Hand {
    
    private HashMap<String, PlayingCard> hand;

    /**
     * Creates an instance of a hand of cards.
     * Each hand has 5 cards.
     */
    public Hand(PlayingCard playingCard1, PlayingCard playingCard2, PlayingCard playingCard3, PlayingCard playingCard4, PlayingCard playingCard5) {
        hand = new HashMap<String, PlayingCard>();
        this.hand.put(playingCard1.getAsString(), playingCard1);
        this.hand.put(playingCard2.getAsString(), playingCard2);
        this.hand.put(playingCard3.getAsString(), playingCard3);
        this.hand.put(playingCard4.getAsString(), playingCard4);
        this.hand.put(playingCard5.getAsString(), playingCard5);
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
