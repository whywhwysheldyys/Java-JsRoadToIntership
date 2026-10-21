package second_practice.oop02.abstractclass.practice;

public class Mage extends GameCharacter{
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        target.takeDamage(14);
    }
}