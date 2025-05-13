package playmaker.webbservicelabb3.client;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import playmaker.webbservicelabb3.dao.met.MET;


@Component
public class MetClient {

    private final WebClient webClient = WebClient.create();


    public MET getForecast(String url) {
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(MET.class)
                .block();


    }
}



