package lab6.part5DealingWithGeneralization.task11ReplaceInheritanceWithDelegation;

public class Person11 {
    private Animal11 animal;

    public Person11(Animal11 animal) {
        this.animal = animal;
    }

    public void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }

    public void playWithDog(Dog11 dog) {
        dog.bark();
    }

}
