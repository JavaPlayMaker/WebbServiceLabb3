package playmaker.webbservicelabb3.Service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.DAO.SMHI.Client.SMHIClient;
import playmaker.webbservicelabb3.DAO.SMHI.SMHI;


@Service
public class ForecastService {

    private final SMHIClient smhiClient;

    public ForecastService(SMHIClient smhiClient) {
        this.smhiClient = smhiClient;
    }

    public String getBestForecastLocationLiljeholmen() {
        String url = "https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json ";        SMHI smhi = smhiClient.getForecast(url);
        if (smhi != null && smhi.getTimeSeries() != null && !smhi.getTimeSeries().isEmpty()) {
            return smhi.getTimeSeries().get(0).getParameters().get(0).getValues().toString();
        } else {
            return "No forecast data available.";
        }
    }
}