package alloop.medium.practice;

public class AdvancedCar {
    private String brand;
    private String model;
    private int year;
    private Engine engine;

    public static class Engine {
        private String type;
        private int horsePower;

        public Engine(String type, int horsePower) {
            this.type = type;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }

    public AdvancedCar(String brand, String model, int year, Engine engine) {
        this.brand = brand;
        this.model = model;
        setYear(year);
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2026) {
            throw new IllegalArgumentException("Некорректный год выпуска!");
        }
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand + "\n"
                + "Модель: " + model + "\n"
                + "Год выпуска: " + year + "\n"
                + "===Двигатель===\n"
                + "Тип двигателя: " + engine.getType() + "\n"
                + "Мощность в л.с: " + engine.getHorsePower());
    }
}