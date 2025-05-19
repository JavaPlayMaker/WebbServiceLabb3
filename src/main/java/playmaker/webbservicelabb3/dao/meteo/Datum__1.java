
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
    "day",
    "weather",
    "icon",
    "summary",
    "all_day",
    "morning",
    "afternoon",
    "evening"
})
@Generated("jsonschema2pojo")
public class Datum__1 {

    @JsonProperty("day")
    private String day;
    @JsonProperty("weather")
    private String weather;
    @JsonProperty("icon")
    private Integer icon;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("all_day")
    private AllDay allDay;
    @JsonProperty("morning")
    private Object morning;
    @JsonProperty("afternoon")
    private Object afternoon;
    @JsonProperty("evening")
    private Object evening;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
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

    @JsonProperty("all_day")
    public AllDay getAllDay() {
        return allDay;
    }

    @JsonProperty("all_day")
    public void setAllDay(AllDay allDay) {
        this.allDay = allDay;
    }

    @JsonProperty("morning")
    public Object getMorning() {
        return morning;
    }

    @JsonProperty("morning")
    public void setMorning(Object morning) {
        this.morning = morning;
    }

    @JsonProperty("afternoon")
    public Object getAfternoon() {
        return afternoon;
    }

    @JsonProperty("afternoon")
    public void setAfternoon(Object afternoon) {
        this.afternoon = afternoon;
    }

    @JsonProperty("evening")
    public Object getEvening() {
        return evening;
    }

    @JsonProperty("evening")
    public void setEvening(Object evening) {
        this.evening = evening;
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
