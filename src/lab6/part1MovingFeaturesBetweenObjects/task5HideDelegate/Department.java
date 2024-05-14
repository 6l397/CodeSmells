package lab6.part1MovingFeaturesBetweenObjects.task5HideDelegate;

public class Department {
    private String name;
    private EmployeeD manager;

    public Department(String name, EmployeeD manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}
