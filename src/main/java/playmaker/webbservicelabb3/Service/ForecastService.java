package playmaker.webbservicelabb3.Service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.Entity.Weather;

import java.time.LocalDateTime;

@Service
public class ForecastService {

    public Weather getBestForecast() {

        Weather smhi = new Weather("SMHI", 12.5, 46, LocalDateTime.now().plusHours(24));

        Weather test = new Weather("Yr", 13.0, 45, LocalDateTime.now().plusHours(24));

        return (smhi.getTemperature() > test.getTemperature()) ? smhi : test;
    }

}
