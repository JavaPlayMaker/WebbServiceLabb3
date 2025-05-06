package playmaker.webbservicelabb3.Entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Weather {
    private String name;
    private double temperature;
    private int humidity;
    private LocalDateTime dateTime;

    public Weather(String name, double temperature, int humidity, LocalDateTime dateTime) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.dateTime = dateTime;
    }
}
