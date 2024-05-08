package lab5.task2;

import java.util.List;

public class OrderProcessor {
    private List<Item> items;

    public OrderProcessor(List<Item> items) {
        this.items = items;
    }

    public void processOrder() {
        displayOrderDetails();
    }

    private void displayOrderDetails() {
        for (Item item : items) {
            System.out.println("Processing item: " + item.getItemName());
        }
        double totalPrice = calculateTotalPrice();
        System.out.println("Total price: " + totalPrice);
    }

    public double calculateTotalPrice() {
            double totalPrice = 0.0;
            for (Item item : items) {
                totalPrice += calculateItemPrice(item);
            }
        return totalPrice;
    }

    private double calculateItemPrice(Item item) {
        return switch (item.getItemName()) {
            case "Moisturizer" -> 10.0;
            case "SPF" -> 15.0;
            case "Toner" -> 20.0;
            default -> 0.0;
        };
    }
}
