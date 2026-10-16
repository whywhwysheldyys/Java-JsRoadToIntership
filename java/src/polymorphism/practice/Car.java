package polymorphism.practice;

public class Car extends Vehicle{
    private int doorsCount;

    public Car(String brand, int speed, int doorsCount) {
        super(brand, speed);
        this.doorsCount = doorsCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество дверей: " + doorsCount);
    }
}