package lab6.part1MovingFeaturesBetweenObjects.task2MoveField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> employeeSalaries;

    public Company() {
        employees = new ArrayList<>();
        employeeSalaries = new HashMap<>();
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + getEmployeeSalary(employee));
        }
    }

    private double getEmployeeSalary(Employee employee) {
        return employeeSalaries.get(employee);
    }
}
