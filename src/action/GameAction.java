package action;

public abstract class GameAction {
    public void executeAction() {
        System.out.println("Executing action...");
        action();
    }

    protected abstract void action();
}
