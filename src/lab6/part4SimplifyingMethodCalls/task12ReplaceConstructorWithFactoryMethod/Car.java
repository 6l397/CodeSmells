package lab6.part4SimplifyingMethodCalls.task12ReplaceConstructorWithFactoryMethod;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    private void registerCar() {

        System.out.println("Car registered successfully!");
    }

    public void create() {

        registerCar();
    }
}
