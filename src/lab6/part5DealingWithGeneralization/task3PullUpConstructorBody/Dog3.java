package lab6.part5DealingWithGeneralization.task3PullUpConstructorBody;

public class Dog3 extends Animal3 {
    String breed;

    public Dog3(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
}
