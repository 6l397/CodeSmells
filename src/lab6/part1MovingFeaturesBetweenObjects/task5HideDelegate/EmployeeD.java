package lab6.part1MovingFeaturesBetweenObjects.task5HideDelegate;

public class EmployeeD {
    private String name;
    private Department department;

    public EmployeeD(String name, Department department) {
        this.name = name;
        this.department = department;
    }


    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
