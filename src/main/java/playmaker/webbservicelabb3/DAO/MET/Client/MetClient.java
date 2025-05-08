package playmaker.webbservicelabb3.DAO.MET.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import playmaker.webbservicelabb3.DAO.MET.MET;

@Component
public class MetClient {

    private final RestTemplate restTemplate;
    public MetClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

public MET getForecast(String url) {
        return restTemplate.getForObject(url, MET.class);
    }


}
