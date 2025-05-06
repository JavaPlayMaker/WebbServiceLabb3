package playmaker.webbservicelabb3;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Configuration
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {


        WebClient webClientSmhi = WebClient.create();
        WebClient webClientTest = WebClient.create();

        Mono<String> smhiResponse = webClientSmhi.get()
                .uri("https://api.smhi.se/v1/parameter")
                .retrieve()
                .bodyToMono(String.class);

        smhiResponse.subscribe(response -> {
            System.out.println("SMHI Response: " + response);
        });
        Mono<String> TestResponse = webClientTest.get()
                .uri("https://api.yr.no/weatherapi/locationforecast/2.0/compact?lat=60.10&lon=9.58")
                .retrieve()
                .bodyToMono(String.class);

        TestResponse.subscribe(response -> {
            System.out.println("Test Response: " + response);
        });
    }
}
