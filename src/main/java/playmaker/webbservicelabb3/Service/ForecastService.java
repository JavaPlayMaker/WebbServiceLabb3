package playmaker.webbservicelabb3.Service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.DAO.MET.Client.MetClient;
import playmaker.webbservicelabb3.DAO.MET.MET;
import playmaker.webbservicelabb3.DAO.SMHI.Client.SMHIClient;
import playmaker.webbservicelabb3.DAO.SMHI.SMHI;


@Service
public class ForecastService {

    private final SMHIClient smhiClient;

    private final MetClient metClient;


    public ForecastService(SMHIClient smhiClient, MetClient metClient) {
        this.metClient =  metClient;
        this.smhiClient = smhiClient;


    }

    public String getBestForecastLocationLiljeholmen() {
        String smhiUrl = "https://opendata-download-metobs.smhi.se/api/version/latest/parameter/1/station/98240/period/latest-months/data.json";
        String metUrl = "https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3133&lon=18.0249";

        SMHI smhiForecast = smhiClient.getForecast(smhiUrl);
        MET metForecast = metClient.getForecast(metUrl);

        return "SMHI Forecast: " + smhiForecast.toString() + "\n" +
                "MET Forecast: " + metForecast.toString();

    }
}