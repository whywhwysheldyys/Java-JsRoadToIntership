package alloop.medium.practice;

import alloop.medium.interfaces.Discountable;

import java.util.List;

public class Order{
    private String orderId;
    private List<OrderItem> items;
    private String status;

    public Order(String orderId, List<OrderItem> items, String status) {
        this.orderId = orderId;
        this.items = items;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }


    public double calculateTotal(Discountable discount) {
        double subtotal = 0.0;

        for (OrderItem item : items) {
            subtotal += item.getPrice() * item.getQuantity();
        }

        return discount.applyDiscount(subtotal);
    }
}