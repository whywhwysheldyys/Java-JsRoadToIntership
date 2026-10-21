package second_practice.oop02.abstractclass.practice;

public class Warrior extends GameCharacter{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        target.takeDamage(23);
    }
}