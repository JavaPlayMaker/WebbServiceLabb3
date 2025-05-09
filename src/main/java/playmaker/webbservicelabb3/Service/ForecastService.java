package playmaker.webbservicelabb3.Service;

import org.springframework.stereotype.Service;
import playmaker.webbservicelabb3.Client.SMHIClient;
import playmaker.webbservicelabb3.DAO.SMHI.SMHI;


@Service
public class ForecastService {

    private final SMHIClient smhiClient;
/*
    private final MetClient metClient;


 */

    public ForecastService(SMHIClient smhiClient) {
        this.smhiClient = smhiClient;


    }

    public SMHI getSMHIData() {
        return smhiClient.getForecast("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json");

    }
    /*
    public MET getMETData() {
        return metClient.getForecast("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3133&lon=18.0711");


     */

    }

