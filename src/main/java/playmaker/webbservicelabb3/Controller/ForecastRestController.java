package playmaker.webbservicelabb3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import playmaker.webbservicelabb3.Service.ForecastService;

public class ForecastRestController {
    private final ForecastService forecastService;

    public ForecastRestController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/api/forecast")
    public String getForecast() {
        return forecastService.getBestForecast().toString();
    }
}


