package strategy;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with magic attack.");
    }
}
