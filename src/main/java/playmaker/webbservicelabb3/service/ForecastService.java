package playmaker.webbservicelabb3.service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.client.MetClient;
import playmaker.webbservicelabb3.client.SMHIClient;
import playmaker.webbservicelabb3.dao.met.Details;
import playmaker.webbservicelabb3.dao.met.MET;
import playmaker.webbservicelabb3.dao.met.Properties;
import playmaker.webbservicelabb3.dao.met.Timeseries;
import playmaker.webbservicelabb3.dao.smhi.Parameter;
import playmaker.webbservicelabb3.dao.smhi.SMHI;
import playmaker.webbservicelabb3.dao.smhi.TimeSeries;
import playmaker.webbservicelabb3.entity.WeatherData;


@Service
public class ForecastService {

    private final SMHIClient smhiClient;
    private final MetClient metClient;


    public ForecastService(SMHIClient smhiClient, MetClient metClient) {
        this.smhiClient = smhiClient;
        this.metClient = metClient;
    }


    public WeatherData getSMHIData() {

        SMHI smhi = smhiClient.getForecast("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json");

        WeatherData weatherData = new WeatherData();
        weatherData.setOrigin("SMHI");
        TimeSeries timeseries = smhi.getTimeSeries().get(26);
        for (Parameter p : timeseries.getParameters()) {
            if (p.getName().equals("t")) {
                weatherData.setTemp(p.getValues().get(0));
            }

            if (p.getName().equals("ws")) {
                weatherData.setHumidity(p.getValues().get(0));
            }

        }
        weatherData.setTime(timeseries.getValidTime());
        System.out.println("Get Weatherdata from SMHI: " + weatherData);
        return weatherData;
    }


    public WeatherData getMETData() {

        MET met = metClient.getForecast("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3110&lon=18.0300");

        WeatherData weatherData = new WeatherData();
        weatherData.setOrigin("MET");
        Timeseries timeseries = met.getProperties().getTimeseries().get(26);
        Details details = timeseries.getData().getInstant().getDetails();

        if (details.getAirTemperature() != null) {
            weatherData.setTemp(details.getAirTemperature());
        }

        if (details.getRelativeHumidity() != null) {
            weatherData.setHumidity(details.getRelativeHumidity());
        }

        weatherData.setTime(timeseries.getTime());
        System.out.println("Get Weatherdata from MET: " + weatherData);
        return weatherData;


    }
}

