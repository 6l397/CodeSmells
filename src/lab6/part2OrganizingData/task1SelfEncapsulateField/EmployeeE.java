package lab6.part2OrganizingData.task1SelfEncapsulateField;

public class EmployeeE {
    private String name;
    private double salary;

    public EmployeeE(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double value) {
        salary = value;
    }
}
