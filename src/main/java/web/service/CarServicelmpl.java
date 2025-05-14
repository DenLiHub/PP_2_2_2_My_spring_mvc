package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServicelmpl implements CarService {

    private final List<Car> cars = new ArrayList<Car>();

    public CarServicelmpl() {
        cars.add(new Car("make1", "model1", 1));
        cars.add(new Car("make2", "model2", 2));
        cars.add(new Car("make3", "model3", 3));
        cars.add(new Car("make4", "model4", 4));
        cars.add(new Car("make5", "model5", 5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return cars.subList(0, 0);
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
