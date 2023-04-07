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

    public Ability(String abilityText, int abilityCost) {
        this.abilityText = abilityText;
        this.abilityCost = abilityCost;
    }
}
