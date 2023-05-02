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

    public Ability() {
        this.abilityText = "Placeholder";
        this.abilityCost = 0;
        this.ability = AbilityType.NONE;
    }

    public Ability(String abilityText, int abilityCost, AbilityType ability) {
        this.abilityText = abilityText;
        this.abilityCost = abilityCost;
        this.ability = ability;
    }

    Ability test = new Ability();
}
