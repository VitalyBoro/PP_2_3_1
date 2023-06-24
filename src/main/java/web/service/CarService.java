package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarListFullSize();
    public List<Car> getCarListDifferentSize(int count);
}
