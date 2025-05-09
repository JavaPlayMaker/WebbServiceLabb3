package playmaker.webbservicelabb3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient smhiWebClient() {
        return WebClient.builder()
                .baseUrl("https://opendata-download-metfcst.smhi.se")
                .build();
    }
    @Bean
    public WebClient metWebClient() {
        return WebClient.builder()
                .baseUrl("https://api.met.no")
                .build();
    }
}

