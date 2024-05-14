package lab6.part1MovingFeaturesBetweenObjects.task3ExtractClass;

public class EmployeePrinter {
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
    }
}
