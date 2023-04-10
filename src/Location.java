public class Location {
    int locationPower;
    Ability locationAbility;
    Card[] playerHand;
    Card[] opponentHand;

    public Location() {
        this.locationPower = 0;
        this.locationAbility = null;
        this.playerHand = null;
        this.opponentHand = null;
    }
}
