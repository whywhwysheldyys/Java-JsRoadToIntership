package second_practice.oop02.composition.practice;

public class Computer {
    private String brand;
    private Processor processor;
    private RAM ram;

    public Computer(String brand, Processor processor, RAM ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public void printSpecifications() {
        System.out.println("Название компьютера: " + brand + "\n"
                        +"Процессор: " + processor.getModel() + "\n"
                        + "Ггц: " + processor.getFrequency() + "\n"
                        + "=== \t\t === \n"
                        + "Обьем оперативной памяти: " + ram.getSizeGb() + "\n"
                        + "Тип оперативной памяти: " + ram.getType() + "\n");
    }
}