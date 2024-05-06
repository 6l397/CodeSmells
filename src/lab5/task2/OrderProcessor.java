package lab5.task2;

import java.util.List;

public class OrderProcessor {
    private List<String> items;

    public OrderProcessor(List<String> items) {
        this.items = items;
    }

    public void processOrder() {
        displayOrderDetails();
    }

    private void displayOrderDetails() {
        for (String item : items) {
            System.out.println("Processing item: " + item);
        }
        double totalPrice = calculateTotalPrice();
        System.out.println("Total price: " + totalPrice);
    }

    public double calculateTotalPrice() {
            double totalPrice = 0.0;
            for (String item : items) {
                totalPrice += calculateItemPrice(item);
            }
        return totalPrice;
    }

    private double calculateItemPrice(String item) {
        if (item.equalsIgnoreCase("Moisturizer")) {
            return 10.0;
        } else if (item.equalsIgnoreCase("SPF")) {
            return 15.0;
        } else if (item.equalsIgnoreCase("Toner")) {
            return 20.0;
        } else {
            return 0.0;
        }
    }
}
