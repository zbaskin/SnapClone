public class Ability {
    String abilityText;
    int abilityCost;
    AbilityType ability;
    enum AbilityType {
        DESTROY,
        ONGOING,
        REVEAL,
        DISCARD,
        MOVE,
        NONE
    };

    public Ability(String abilityText, int abilityCost, AbilityType ability) {
        this.abilityText = abilityText;
        this.abilityCost = abilityCost;
        this.ability = ability;
    }
}
