package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();

    private final List<Car> carList = Arrays.asList(
            new Car("Toyota", "Black", 2018),
            new Car("BMW", "Green", 2010),
            new Car("Ford", "Red", 2009),
            new Car("Audi", "Blue", 2020),
            new Car("Honda", "Pink", 2022)
    );
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                          int count, Model model) {
        List<Car> carsToShow = carService.getCars(carList, count);
        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}
