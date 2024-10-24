package strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with melee attack.");
    }
}
