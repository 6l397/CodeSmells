package lab5.task2;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;

    private double totalPrice;

    public Order(String customerName, List<String> items, double totalPrice) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public void processOrder() {
        OrderProcessor orderProcessor = new OrderProcessor(items);
        orderProcessor.processOrder();
    }
}
