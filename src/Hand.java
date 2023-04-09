public class Hand {
    Card[] hand;
    int handPower;
    final int handCount;

    public Hand() {
        this.hand = null;
        this.handPower = 0;
        this.handCount = 7;
    }

    public Hand(Card[] hand) {
        this.hand = hand;
        this.handCount = 7;
    }
}
