package playmaker.webbservicelabb3.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import playmaker.webbservicelabb3.dao.meteo.Meteo;

@Component
public class MeteoClient {

    private final WebClient webClient = WebClient.create();


        public Meteo getForecast(String url) {
            return webClient
                    .get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(Meteo.class)
                    .block();


        }
    }
