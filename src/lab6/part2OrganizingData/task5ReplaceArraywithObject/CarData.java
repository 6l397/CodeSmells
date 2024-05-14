package lab6.part2OrganizingData.task5ReplaceArraywithObject;

import java.util.List;

public class CarData {
    private List<Car> cars;

    public CarData(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
