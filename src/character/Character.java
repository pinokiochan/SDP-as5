package character;

import strategy.FightingStrategy;
import strategy.MeleeStrategy;

public class Character {
    private CharacterState state;
    private FightingStrategy strategy;

    public Character() {
        this.state = new NormalState();  // Default state
        this.strategy = new MeleeStrategy();  // Default strategy
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack(this);  // State-based attack behavior
    }

    public void fight() {
        strategy.fight();  // Strategy-based fighting behavior
    }
}
