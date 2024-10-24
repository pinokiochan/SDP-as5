import character.Character;
import character.PoweredUpState;
import character.DefeatedState;
import strategy.MeleeStrategy;
import strategy.RangedStrategy;
import strategy.MagicStrategy;
import action.AttackAction;
import action.DefendAction;
import action.HealAction;
import visitor.EffectVisitor;
import visitor.EffectVisitorImpl;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Character character = new Character();
        EffectVisitor visitor = new EffectVisitorImpl();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Character Game Menu ===");
            System.out.println("1. Change State");
            System.out.println("2. Change Fighting Strategy");
            System.out.println("3. Perform Action");
            System.out.println("4. Apply Effect (Visitor)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    changeState(character, scanner);
                    break;
                case 2:
                    changeStrategy(character, scanner);
                    break;
                case 3:
                    performAction(character, scanner);
                    break;
                case 4:
                    applyEffect(character, visitor, scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting the game. Goodbye!");
    }

    // Method to change the character's state
    private static void changeState(Character character, Scanner scanner) {
        System.out.println("\n=== Change Character State ===");
        System.out.println("1. Normal State");
        System.out.println("2. Powered Up State");
        System.out.println("3. Defeated State");
        System.out.print("Choose a state: ");

        int stateChoice = scanner.nextInt();

        switch (stateChoice) {
            case 1:
                character.setState(new character.state.NormalState());
                System.out.println("Character is now in Normal State.");
                break;
            case 2:
                character.setState(new PoweredUpState());
                System.out.println("Character is now in Powered Up State.");
                break;
            case 3:
                character.setState(new DefeatedState());
                System.out.println("Character is now in Defeated State.");
                break;
            default:
                System.out.println("Invalid state! Try again.");
        }
    }

    // Method to change the character's fighting strategy
    private static void changeStrategy(Character character, Scanner scanner) {
        System.out.println("\n=== Change Fighting Strategy ===");
        System.out.println("1. Melee Strategy");
        System.out.println("2. Ranged Strategy");
        System.out.println("3. Magic Strategy");
        System.out.print("Choose a strategy: ");

        int strategyChoice = scanner.nextInt();

        switch (strategyChoice) {
            case 1:
                character.setStrategy(new MeleeStrategy());
                System.out.println("Fighting strategy set to Melee.");
                break;
            case 2:
                character.setStrategy(new RangedStrategy());
                System.out.println("Fighting strategy set to Ranged.");
                break;
            case 3:
                character.setStrategy(new MagicStrategy());
                System.out.println("Fighting strategy set to Magic.");
                break;
            default:
                System.out.println("Invalid strategy! Try again.");
        }
    }

    // Method to perform an action
    private static void performAction(Character character, Scanner scanner) {
        System.out.println("\n=== Perform Action ===");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Heal");
        System.out.print("Choose an action: ");

        int actionChoice = scanner.nextInt();

        switch (actionChoice) {
            case 1:
                new AttackAction().executeAction();
                character.attack();
                break;
            case 2:
                new DefendAction().executeAction();
                break;
            case 3:
                new HealAction().executeAction();
                break;
            default:
                System.out.println("Invalid action! Try again.");
        }
    }

    // Method to apply an effect using the visitor pattern
    private static void applyEffect(Character character, EffectVisitor visitor, Scanner scanner) {
        System.out.println("\n=== Apply Effect ===");
        System.out.println("1. Apply Boost");
        System.out.println("2. Apply Damage");
        System.out.print("Choose an effect: ");

        int effectChoice = scanner.nextInt();

        switch (effectChoice) {
            case 1:
                visitor.applyBoost(character);
                break;
            case 2:
                visitor.applyDamage(character);
                break;
            default:
                System.out.println("Invalid effect! Try again.");
        }
    }
}
