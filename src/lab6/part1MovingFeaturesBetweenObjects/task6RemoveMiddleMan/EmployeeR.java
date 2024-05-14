package lab6.part1MovingFeaturesBetweenObjects.task6RemoveMiddleMan;

public class EmployeeR {
    private String name;
    private DepartmentR department;

    public EmployeeR(String name, DepartmentR department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentR getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentR department) {
        this.department = department;
    }
}
