package ie.emeraldjava.agegrade.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauloconnell on 13/04/17.
 */
//@JsonRootName(value = "age")
public class Age {

    private Long age;
    private List<Record> records;

    public Age(Long age) {
        this.age=age;
        this.records = new ArrayList();
    }

    @JsonProperty
    public List<Record> getRecords() {
        return this.records;
    }

//    public void setRecords(List<Record> records) {
//        this.records = records;
//    }

    @JsonIgnore
    private Gender gender;

    @JsonProperty
    public Long getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Age{");
        sb.append("records=").append(records.size());
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
