package second_practice.oop02.encapsulaiton.practice;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Ошибка!Цена некорректная");
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Ошибка!Количество меньше нуля");
        } else {
            this.quantity = quantity;
        }
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + "\n"
                + "Стоимость товара: " + price + "\n"
                + "Количество товара: " + quantity + "\n";
    }
}