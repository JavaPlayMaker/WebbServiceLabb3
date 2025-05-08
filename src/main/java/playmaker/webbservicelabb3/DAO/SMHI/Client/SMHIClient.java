package playmaker.webbservicelabb3.DAO.SMHI.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import playmaker.webbservicelabb3.DAO.SMHI.SMHI;

@Component
public class SMHIClient {

    private final RestTemplate restTemplate;

    public SMHIClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SMHI getForecast(String url) {
        return restTemplate.getForObject(url, SMHI.class);
    }
}
