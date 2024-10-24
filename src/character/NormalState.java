package character;

public class NormalState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Normal attack with base damage.");
    }
}
