package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Tesla", 7786, "Black"));
        cars.add(new Car("Volvo", 5283, "White"));
        cars.add(new Car("BMW", 3689, "Green"));
        cars.add(new Car("Toyota", 1902, "Blue"));
        cars.add(new Car("Nissan", 3850, "Yellow"));
        cars.add(new Car("Honda", 6183, "Brown"));
    }

    @Override
    public List<Car> getCounter(int count) {
        if (count < 5 & count > 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
