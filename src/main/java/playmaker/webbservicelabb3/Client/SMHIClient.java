package playmaker.webbservicelabb3.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import playmaker.webbservicelabb3.DAO.SMHI.SMHI;

@Component
public class SMHIClient {


    private final WebClient webClient;

        public SMHIClient(@Qualifier("smhiWebClient") WebClient webClient) {
            this.webClient = webClient;
    }

    public SMHI getForecast(String url) {
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(SMHI.class)
                .block();


    }
}