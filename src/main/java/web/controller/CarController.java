package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false)
                          Integer count, Model model) {
        int carsCount = (count == null) ? 5 : count;
        model.addAttribute("cars", carService.getCars(carsCount));
        return "cars";
    }
}
