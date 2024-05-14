package lab6.part2OrganizingData.task8ChangeBidirectionalAssociationtoUnidirectional;

import java.util.List;

public class Department {
    private String name;
    private List<EmployeeС> employees;

    public Department(String name, List<EmployeeС> employees) {
        this.name = name;
        this.employees = employees;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Геттер для поля employees
    public List<EmployeeС> getEmployees() {
        return employees;
    }
}
