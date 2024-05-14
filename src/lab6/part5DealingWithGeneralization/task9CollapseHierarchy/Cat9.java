package lab6.part5DealingWithGeneralization.task9CollapseHierarchy;

public class Cat9 extends Animal9 {
    public Cat9() {
        super("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat is meowing.");
    }
}
