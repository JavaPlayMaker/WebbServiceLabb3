
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
    "date",
    "weather",
    "icon",
    "summary",
    "temperature",
    "wind",
    "cloud_cover",
    "precipitation"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("date")
    private String date;
    @JsonProperty("weather")
    private String weather;
    @JsonProperty("icon")
    private Integer icon;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("temperature")
    private Integer temperature;
    @JsonProperty("wind")
    private Wind__1 wind;
    @JsonProperty("cloud_cover")
    private CloudCover cloudCover;
    @JsonProperty("precipitation")
    private Precipitation__1 precipitation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

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

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("wind")
    public Wind__1 getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind__1 wind) {
        this.wind = wind;
    }

    @JsonProperty("cloud_cover")
    public CloudCover getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloud_cover")
    public void setCloudCover(CloudCover cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("precipitation")
    public Precipitation__1 getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(Precipitation__1 precipitation) {
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
