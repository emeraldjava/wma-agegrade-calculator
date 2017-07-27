package ie.emeraldjava.agegrade.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pauloconnell on 13/04/17.
 */
public class Distance {

    @JsonProperty
    private Long distance;

    public Distance(Long distance) {
        this.distance=distance;
    }

}
