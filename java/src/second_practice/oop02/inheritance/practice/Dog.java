package second_practice.oop02.inheritance.practice;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав - гав");
    }
}