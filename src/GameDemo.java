import character.Character;
import character.PoweredUpState;
import strategy.MagicStrategy;
import action.AttackAction;
import action.HealAction;
import visitor.EffectVisitor;
import visitor.EffectVisitorImpl;

public class GameDemo {
    public static void main(String[] args) {
        Character character = new Character();

        // State Pattern demonstration
        character.attack();
        character.setState(new PoweredUpState());
        character.attack();

        // Strategy Pattern demonstration
        character.fight();
        character.setStrategy(new MagicStrategy());
        character.fight();

        // Template Pattern demonstration
        AttackAction attackAction = new AttackAction();
        attackAction.executeAction();

        HealAction healAction = new HealAction();
        healAction.executeAction();

        // Visitor Pattern demonstration
        EffectVisitor visitor = new EffectVisitorImpl();
        visitor.applyBoost(character);
        visitor.applyDamage(character);
    }
}
