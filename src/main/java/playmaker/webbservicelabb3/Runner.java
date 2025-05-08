package playmaker.webbservicelabb3;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Configuration
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        WebClient webClient = WebClient.builder().build();

        Mono<String> forecastSMHIResponse = webClient.get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json")
                .retrieve()
                .bodyToMono(String.class);

        forecastSMHIResponse.subscribe(response -> {
            System.out.println("Local SMHI Response: " + response);
        });
    }
}