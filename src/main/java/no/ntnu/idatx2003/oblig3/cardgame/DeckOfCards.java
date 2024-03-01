package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.HashMap;

/**
 * Represents a deck of cards.
 * A deck of cards has 52 cards, 13 of each suit.
 * 
 * The deck is represented by a HashMap where the key is a combination of the suit and face of the card, and the value is the card itself.
 * 
 * <p> The following functions are implemented:
 * <ul>
 * 
 */

public class DeckOfCards {

    private HashMap<String, PlayingCard> deck;

    /**
     * Creates an instance of a deck of cards.
     * The deck is represented by a HashMap where the key is a combination of the suit and face of the card, and the value is the card itself.
     */
    public DeckOfCards() {
        deck = new HashMap<String, PlayingCard>();
        // for each number from 1 to 13, add a card of each suit
        for (int i = 1; i <= 13; i++) {
            addCardToDeck('S', i);
            addCardToDeck('H', i);
            addCardToDeck('D', i);
            addCardToDeck('C', i);
        }
    }   

    /**
     * Adds a card to the deck.
     * Uses the PlayingCard class to create a new card
     * Uses a method form the PlayingCard class to get a combination of suit and face of the card and uses that as key
     */
    private void addCardToDeck(char suit, int face) {
        PlayingCard card = new PlayingCard(suit, face);
        this.deck.put(card.getAsString(), card);
    }
}