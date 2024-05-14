package lab6.part5DealingWithGeneralization.task1PullUpField;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String color, int loadCapacity) {
        super(color);
        this.loadCapacity = loadCapacity;
    }
}
