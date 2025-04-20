package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = carDAO.getAllCars();
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
