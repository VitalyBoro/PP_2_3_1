package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarListFullSize();
    List<Car> getCarListDifferentSize(int count);
}
