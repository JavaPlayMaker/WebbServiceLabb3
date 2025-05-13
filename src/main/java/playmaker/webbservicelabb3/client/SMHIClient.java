package playmaker.webbservicelabb3.client;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import playmaker.webbservicelabb3.dao.smhi.SMHI;

@Component
public class SMHIClient {


    private final WebClient webClient = WebClient.create();

    public SMHI getForecast(String url) {
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(SMHI.class)
                .block();



    }
}