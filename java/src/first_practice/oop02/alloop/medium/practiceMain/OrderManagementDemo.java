package first_practice.oop02.alloop.medium.practiceMain;

import first_practice.oop02.alloop.medium.interfaces.Discountable;
import first_practice.oop02.alloop.medium.practice.Order;
import first_practice.oop02.alloop.medium.practice.OrderItem;

import java.util.ArrayList;

public class OrderManagementDemo {
    public static void main(String[] args) {
        ArrayList<OrderItem> items = new ArrayList<>();
        items.add(new OrderItem("Laptop", 1200.0, 1));
        items.add(new OrderItem("Mouse", 25.5, 2));

        Order order = new Order("ORD-001", items, "NEW");
        order.addItem(new OrderItem("Keyboard", 75.0, 1));

        Discountable tenPercentDiscount = (price) -> price * 0.9;
        double finalPrice = order.calculateTotal(tenPercentDiscount);

        System.out.println("Итоговая стоимость заказа со скидкой 10%: " + finalPrice);
    }
}