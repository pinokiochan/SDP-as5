package visitor;

import character.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
