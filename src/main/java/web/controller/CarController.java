package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImpl carServiceImpl = new CarServiceImpl();
    private final int carsListSize = carServiceImpl.getCarListFullSize().size();


    @GetMapping
    public String getCarListDifferentSize (@RequestParam(value = "count", required = false)
                                                  Integer number, ModelMap model) {
        if (number == null || number > carsListSize - 1) {
            model.addAttribute("carsList",
                    carServiceImpl.getCarListFullSize());

        } else {
            model.addAttribute("carsList",
                    carServiceImpl.getCarListDifferentSize(number));
        }
        return "car";
    }





}
