package lab6.part4SimplifyingMethodCalls.task4SeparateQueryFromModifier;

public class Account {
    private double balance;
    public double getBalance()
    {
        return balance;
    }

    public void calculateCommision()
    {
        double commissionRate = 0.05;
        balance -= balance * commissionRate;
    }
}
