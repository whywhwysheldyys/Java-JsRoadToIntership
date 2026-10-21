package second_practice.oop02.composition.practice;

public class Engine {
    private int horsepower;
    private boolean isRunning;

    public Engine(int horsepower, boolean isRunning) {
        this.horsepower = horsepower;
        this.isRunning = isRunning;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start() {
        isRunning = true;
        System.out.println("Двигатель запущен");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Двигатель заглушен");
    }
}