package playmaker.webbservicelabb3.service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.client.MetClient;
import playmaker.webbservicelabb3.client.MeteoClient;
import playmaker.webbservicelabb3.client.SMHIClient;
import playmaker.webbservicelabb3.dao.met.Details;
import playmaker.webbservicelabb3.dao.met.MET;
import playmaker.webbservicelabb3.dao.met.Timeseries;
import playmaker.webbservicelabb3.dao.meteo.Datum;
import playmaker.webbservicelabb3.dao.meteo.Meteo;
import playmaker.webbservicelabb3.dao.meteo.Wind__1;
import playmaker.webbservicelabb3.dao.smhi.Parameter;
import playmaker.webbservicelabb3.dao.smhi.SMHI;
import playmaker.webbservicelabb3.dao.smhi.TimeSeries;
import playmaker.webbservicelabb3.entity.WeatherData;


@Service
public class ForecastService {

    private final SMHIClient smhiClient;
    private final MetClient metClient;
    private final MeteoClient meteoClient;


    public ForecastService(SMHIClient smhiClient, MetClient metClient, MeteoClient meteoClient) {
        this.smhiClient = smhiClient;
        this.metClient = metClient;
        this.meteoClient = meteoClient;
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

            if (p.getName().equals("r")) {
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

            weatherData.setTemp(details.getAirTemperature());
            weatherData.setHumidity(details.getRelativeHumidity());
            weatherData.setTime(timeseries.getTime());

        System.out.println("Get Weatherdata from MET: " + weatherData);
        return weatherData;
    }

        public WeatherData getMETEOData() {

            Meteo meteo = meteoClient.getForecast("https://www.meteosource.com/api/v1/free/point?place_id=liljeholmen-2696271&sections=all&key=bcdcn7cyofy5c9mncm6186dku2sg7tbme6uyf907");

            WeatherData weatherData = new WeatherData();
            weatherData.setOrigin("METEO");


            Datum datum = meteo.getHourly().getData().get(23);
            weatherData.setTemp(datum.getTemperature());
            weatherData.setTime(datum.getDate());

            weatherData.setHumidity(Double.NaN);

            System.out.println("Get Weatherdata from METEO: " + weatherData);
            return weatherData;
        }
    }

