public class Card {
    int power;
    int cardCost;
    Ability ability;

    public Card(Ability ability) {
        this.power = 0;
        this.cardCost = 0;
        this.ability = ability;
    }
}
