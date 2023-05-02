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

    public Location(Ability locationAbility) {
        super();
        this.locationAbility = locationAbility;
    }

    Ability none = new Ability();
    Location test = new Location(none);
}
