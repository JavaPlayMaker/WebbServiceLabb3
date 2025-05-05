
package playmaker.webbservicelabb3.DAO.smhiweathertest;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "name",
    "owner",
    "ownerCategory",
    "measuringStations",
    "from",
    "to",
    "height",
    "latitude",
    "longitude",
    "value"
})
//@Generated("jsonschema2pojo")
public class Station {

    @JsonProperty("key")
    public String key;
    @JsonProperty("name")
    public String name;
    @JsonProperty("owner")
    public String owner;
    @JsonProperty("ownerCategory")
    public String ownerCategory;
    @JsonProperty("measuringStations")
    public String measuringStations;
    @JsonProperty("from")
    public Long from;
    @JsonProperty("to")
    public Long to;
    @JsonProperty("height")
    public Float height;
    @JsonProperty("latitude")
    public Float latitude;
    @JsonProperty("longitude")
    public Float longitude;
    @JsonProperty("value")
    public List<Value> value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Station.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("ownerCategory");
        sb.append('=');
        sb.append(((this.ownerCategory == null)?"<null>":this.ownerCategory));
        sb.append(',');
        sb.append("measuringStations");
        sb.append('=');
        sb.append(((this.measuringStations == null)?"<null>":this.measuringStations));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
