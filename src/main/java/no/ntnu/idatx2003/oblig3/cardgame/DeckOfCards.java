package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.HashMap;
import java.util.Random;

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

    private final char[] suits = { 'S', 'H', 'D', 'C' };
    private final int[] faces = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

    /**
     * Creates an instance of a deck of cards.
     * The deck is represented by a HashMap where the key is a combination of the suit and face of the card, and the value is the card itself.
     */
    public DeckOfCards() {
        deck = new HashMap<String, PlayingCard>();
        // for each number from 1 to 13, add a card of each suit
        for (int face : faces) {
            for (char suit : suits) {
                addCardToDeck(suit, face);
            }
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

    /**
     * Returns a random card from the deck.
     * Removes the card from the deck.
     *
     * @return a random card from the deck
     */
    public PlayingCard getRandomCard() {
        Random random = new Random();
        Object[] keys = deck.keySet().toArray();
        String randomKey = (String) keys[random.nextInt(keys.length)];
        PlayingCard card = deck.get(randomKey);
        deck.remove(randomKey);
        return card;
    }

}