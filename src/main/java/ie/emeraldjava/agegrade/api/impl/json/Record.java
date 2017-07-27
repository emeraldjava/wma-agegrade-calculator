package ie.emeraldjava.agegrade.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by pauloconnell on 13/04/17.
 */
//@JsonRootName(value = "record")
@JsonPropertyOrder({ "gender", "distance" ,"ocSeconds"})
public class Record {

    @JsonProperty
    private Gender gender;
    @JsonProperty
    private String distance;
    @JsonProperty
    private Long ocSeconds;
    @JsonProperty
    private String ocTime;
    @JsonProperty
    private Double factor;
    @JsonProperty
    private Long factorSeconds;
    @JsonProperty
    private String factorTime;

    public Record(Gender gender,String distance,Long ocSeconds) {
        this.gender=gender;
        this.distance=distance;
        this.ocSeconds=ocSeconds;
        this.ocTime="0:00:00";
    }

}
