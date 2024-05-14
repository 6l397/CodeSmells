package lab6.part5DealingWithGeneralization.task3PullUpConstructorBody;

public class Cat3 extends Animal3 {
    String color;

    public Cat3(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}
