package web.service;

import java.util.List;
import web.model.Car;

public class CarServiceImpl {
    static public List<Car> getCarsByCount(List<web.model.Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}