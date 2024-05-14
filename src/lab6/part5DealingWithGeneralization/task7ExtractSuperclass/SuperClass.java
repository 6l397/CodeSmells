package lab6.part5DealingWithGeneralization.task7ExtractSuperclass;

public class SuperClass {
    protected String name;
    protected double salary;

    public SuperClass(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
