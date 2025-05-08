package playmaker.webbservicelabb3.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import playmaker.webbservicelabb3.Service.ForecastService;

@RestController
@RequestMapping("/api")
public class ForecastAPIController {
    private final ForecastService forecastService;

    public ForecastAPIController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }
    @GetMapping("/forecast")
    public ResponseEntity<String> getForecast() {
        String forecast = forecastService.getBestForecastLocationLiljeholmen();
        return ResponseEntity.ok(forecast);
    }

}

