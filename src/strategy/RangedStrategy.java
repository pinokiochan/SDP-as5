package strategy;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with ranged attack.");
    }
}
