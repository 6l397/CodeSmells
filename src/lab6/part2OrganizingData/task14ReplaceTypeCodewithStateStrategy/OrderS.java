package lab6.part2OrganizingData.task14ReplaceTypeCodewithStateStrategy;

public class OrderS {
    private IOrderState status;

    public OrderS() {
        this.status = new NewOrderState();
    }

    public IOrderState getStatus() {
        return status;
    }

    public void setStatus(IOrderState status) {
        this.status = status;
    }

    public void processOrder() {
        status.processOrder(this);
    }
}
