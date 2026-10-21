package second_practice.oop02.interfaces.practiceInterface;

public interface Powerable {
    void turnOn();
    void turnOff();

    default void checkStatus() {
        System.out.println("Статус устройства: работает");
    }
}