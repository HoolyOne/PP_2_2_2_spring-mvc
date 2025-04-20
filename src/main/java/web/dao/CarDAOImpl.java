package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDAOImpl implements CarDAO {

    private final List<Car> carList = Arrays.asList (
            new Car("Toyota", "Black", 2018),
            new Car("BMW", "Green", 2010),
            new Car("Ford", "Red", 2009),
            new Car("Audi", "Blue", 2020),
            new Car("Honda", "Pink", 2022)
    );

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
