package lab6.part5DealingWithGeneralization.task7ExtractSuperclass;

public class Manager extends SuperClass {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

}
