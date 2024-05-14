package lab6.part2OrganizingData.task15ReplaceSubclasswithFields;

public class Shape {
    public double area;
    public double perimeter;

    public Shape() {
        this.area = 0;
        this.perimeter = 0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
