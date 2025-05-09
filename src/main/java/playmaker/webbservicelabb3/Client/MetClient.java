/* package playmaker.webbservicelabb3.Client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import playmaker.webbservicelabb3.DAO.MET.MET;

@Component
public class MetClient {

    private final WebClient webClient;

    public MetClient(@Qualifier("metWebClient") WebClient webClient) {
        this.webClient = webClient;
    }
    public MET getForecast(String url) {
        MET response = webClient
                .get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json")
                .retrieve()
                .bodyToMono(MET.class)
                .block();

        System.out.println("Response from MET API: " + response);
        return response;
    }
}


 */

