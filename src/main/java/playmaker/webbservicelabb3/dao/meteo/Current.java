
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
    "icon",
    "icon_num",
    "summary",
    "temperature",
    "wind",
    "precipitation",
    "cloud_cover"
})
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_num")
    private Integer iconNum;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("precipitation")
    private Precipitation precipitation;
    @JsonProperty("cloud_cover")
    private Integer cloudCover;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("icon_num")
    public Integer getIconNum() {
        return iconNum;
    }

    @JsonProperty("icon_num")
    public void setIconNum(Integer iconNum) {
        this.iconNum = iconNum;
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
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("precipitation")
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    @JsonProperty("cloud_cover")
    public Integer getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloud_cover")
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
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
