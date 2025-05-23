package playmaker.webbservicelabb3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import playmaker.webbservicelabb3.service.ForecastService;

@RestController
@RequestMapping("/api")

public class ForecastAPIController {
    private final ForecastService forecastService;

    public ForecastAPIController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/forecast/SMHI")
    public ResponseEntity<String> getForecast() {
        String smhiForecast = forecastService.getSMHIData().toString();
        return ResponseEntity.ok("SMHI Forecast: " + smhiForecast);
    }

    @GetMapping("/forecast/MET")
    public ResponseEntity<String> getForecastMET() {
        String metForecast = forecastService.getMETData().toString();
        return ResponseEntity.ok("MET Forecast: " + metForecast);


    }
    @GetMapping("/forecast/METEO")
    public ResponseEntity<String> getForecastMETEO() {
        String meteoForecast = forecastService.getMETEOData().toString();
        return ResponseEntity.ok("METEO Forecast: " + meteoForecast);
    }

}


