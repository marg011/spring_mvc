package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars = initCars();

    private List<Car> initCars() {
        cars = new ArrayList<>();
        cars.add(new Car("field11", "field12", "field13"));
        cars.add(new Car("field21", "field22", "field23"));
        cars.add(new Car("field31", "field32", "field33"));
        cars.add(new Car("field41", "field42", "field43"));
        cars.add(new Car("field51", "field52", "field53"));
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
