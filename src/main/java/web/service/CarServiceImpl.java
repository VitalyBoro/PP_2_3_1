package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private static int count;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++count,"model1", 111, 100));
        cars.add(new Car(++count,"model2", 222, 200));
        cars.add(new Car(++count,"model3", 333, 150));
        cars.add(new Car(++count,"model4", 444, 110));
        cars.add(new Car(++count,"model5", 555, 115));
    }

    @Override
    public List<Car> getCarListFullSize() {
        return cars;
    }

    @Override
    public List<Car> getCarListDifferentSize(int count) {
        return cars.stream().filter(cars ->
                cars.getId() <= count).collect(Collectors.toList());
    }
}
