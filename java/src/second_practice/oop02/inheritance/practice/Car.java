package second_practice.oop02.inheritance.practice;

public class Car extends Vehicle{
    private int doorsCount;

    public Car(String brand, int speed, int doorsCount) {
        super(brand, speed);
        this.doorsCount = doorsCount;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество дверей: " + doorsCount);
    }
}