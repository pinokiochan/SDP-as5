package character;

public class PoweredUpState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Power attack with increased damage.");
    }
}
