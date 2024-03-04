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
     * 
     *
     * @param cardsToExlude cards to exclude from the random selection
     * @return a random card from the deck
     */
    //public PlayingCard getRandomCard(PlayingCard[] cardsToExlude) {
    //    Random random = new Random();
    //    PlayingCard randomCard = null;
    //    do {
    //        int randomSuitIndex = random.nextInt(suits.length);
    //        int randomFaceIndex = random.nextInt(faces.length);
    //        randomCard = deck.get(suits[randomSuitIndex] + "" + faces[randomFaceIndex]);
    //    } while (cardsToExclude.contains(randomCard));
    //    return randomCard;
    // }
}