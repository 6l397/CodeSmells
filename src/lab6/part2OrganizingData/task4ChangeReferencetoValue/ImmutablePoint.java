package lab6.part2OrganizingData.task4ChangeReferencetoValue;

public class ImmutablePoint {
    private final Point point;

    public ImmutablePoint(Point point) {
        this.point = new Point(point.getX(), point.getY());
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }
}
