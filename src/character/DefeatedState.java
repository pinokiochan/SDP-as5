package character;

public class DefeatedState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Cannot attack, character is defeated.");
    }
}
