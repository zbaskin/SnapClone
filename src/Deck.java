public class Deck {
    Card[] deck;
    final int deckLimit;

    public Deck() {
        this.deck = null;
        this.deckLimit = 12;
    }

    public Deck(Card[] deck) {
        this.deck = deck;
        this.deckLimit = 12;
    }
}
