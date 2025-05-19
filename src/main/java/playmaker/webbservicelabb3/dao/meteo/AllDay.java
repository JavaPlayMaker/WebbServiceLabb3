
package playmaker.webbservicelabb3.dao.meteo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weather",
    "icon",
    "temperature",
    "temperature_min",
    "temperature_max",
    "wind",
    "cloud_cover",
    "precipitation"
})
@Generated("jsonschema2pojo")
public class AllDay {

    @JsonProperty("weather")
    private String weather;
    @JsonProperty("icon")
    private Integer icon;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("temperature_min")
    private Double temperatureMin;
    @JsonProperty("temperature_max")
    private Double temperatureMax;
    @JsonProperty("wind")
    private Wind__2 wind;
    @JsonProperty("cloud_cover")
    private CloudCover__1 cloudCover;
    @JsonProperty("precipitation")
    private Precipitation__2 precipitation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("weather")
    public String getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(String weather) {
        this.weather = weather;
    }

    @JsonProperty("icon")
    public Integer getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("temperature_min")
    public Double getTemperatureMin() {
        return temperatureMin;
    }

    @JsonProperty("temperature_min")
    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @JsonProperty("temperature_max")
    public Double getTemperatureMax() {
        return temperatureMax;
    }

    @JsonProperty("temperature_max")
    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @JsonProperty("wind")
    public Wind__2 getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind__2 wind) {
        this.wind = wind;
    }

    @JsonProperty("cloud_cover")
    public CloudCover__1 getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloud_cover")
    public void setCloudCover(CloudCover__1 cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("precipitation")
    public Precipitation__2 getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(Precipitation__2 precipitation) {
        this.precipitation = precipitation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
