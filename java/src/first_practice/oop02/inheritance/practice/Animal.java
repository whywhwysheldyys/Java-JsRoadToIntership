package first_practice.oop02.inheritance.practice;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }
}