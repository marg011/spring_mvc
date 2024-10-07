package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap cars) {
        cars.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
