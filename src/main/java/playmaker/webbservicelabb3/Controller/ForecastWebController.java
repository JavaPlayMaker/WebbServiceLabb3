package playmaker.webbservicelabb3.Controller;

import lombok.experimental.NonFinal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import playmaker.webbservicelabb3.Service.ForecastService;

@Controller
public class ForecastWebController {

    private final ForecastService forecastService;

    public ForecastWebController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/forecast")
    public String showForecast(Model model) {
        model.addAttribute("forecast", forecastService.getBestForecast());

        return "forecast";
    }
}

