package lab6.part5DealingWithGeneralization.task9CollapseHierarchy;

public class Dog9 extends Animal9 {
    public Dog9() {
        super("dog");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }
}
