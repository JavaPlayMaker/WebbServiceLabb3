package playmaker.webbservicelabb3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import playmaker.webbservicelabb3.service.ForecastService;
@Controller
public class ForecastWebController {

    private final ForecastService forecastService;

    public ForecastWebController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/forecast")
    public String showForecast(Model model) {
        model.addAttribute("smhiData", forecastService.getSMHIData());
        model.addAttribute("metData", forecastService.getMETData());





        return "forecast";
    }
}

