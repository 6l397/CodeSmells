package lab6.part2OrganizingData.task6DuplicateObservedData;

public class OrderManager {
    private OrderM order;

    public OrderManager(OrderM order) {
        this.order = order;
    }

    public OrderM getOrder() {
        return order;
    }

    public void setOrder(OrderM order) {
        this.order = order;
    }
}
