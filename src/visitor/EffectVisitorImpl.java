package visitor;

import character.Character;

public class EffectVisitorImpl implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost to the character.");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Applying damage to the character.");
    }
}
