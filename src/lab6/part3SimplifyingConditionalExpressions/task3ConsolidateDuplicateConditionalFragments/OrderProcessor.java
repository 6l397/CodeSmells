package lab6.part3SimplifyingConditionalExpressions.task3ConsolidateDuplicateConditionalFragments;

public class OrderProcessor {
    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 1000) {
            applyDiscount();
        }

    }

    public void applyDiscount() {

    }
}
