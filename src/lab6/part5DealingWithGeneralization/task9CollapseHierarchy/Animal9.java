package lab6.part5DealingWithGeneralization.task9CollapseHierarchy;

public class Animal9 {
    private String species;

    public Animal9(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}
