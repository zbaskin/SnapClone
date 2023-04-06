public class Ability {
    String abilityText;
    int abilityCost;
    enum AbilityType {
        DESTROY,
        ONGOING,
        REVEAL,
        DISCARD,
        MOVE,
        NONE
    };

    public Ability() {
        this.abilityText = "Placeholder";
        this.abilityCost = 0;
    }
}
