package lab6.part1MovingFeaturesBetweenObjects.task6RemoveMiddleMan;

public class DepartmentR {
    private String name;
    private EmployeeR manager;

    public DepartmentR(String name, EmployeeR manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}
