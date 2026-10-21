package first_practice.oop02.inheritance.practice;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override

    public void makeNoise() {
        System.out.println("Мяу-мяу!");
    }
}