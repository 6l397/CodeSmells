package lab6.part2OrganizingData.task2ReplaceDataValuewithObject;

public class Order {
    private Customer customer;
    private Amount amount;

    public Order(Customer customer, Amount amount) {
        this.customer = customer;
        this.amount = amount;
    }
}
