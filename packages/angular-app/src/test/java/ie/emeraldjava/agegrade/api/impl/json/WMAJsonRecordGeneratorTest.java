package ie.emeraldjava.agegrade.api.impl.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import org.junit.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pauloconnell on 13/04/17.
 */
public class WMAJsonRecordGeneratorTest {

    @Test
    public void test() throws Exception {

        // http://stackoverflow.com/questions/28324352/how-to-customise-the-jackson-json-mapper-implicitly-used-by-spring-boot
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.serializationInclusion(JsonInclude.Include.NON_NULL);
        builder.propertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        builder.serializationInclusion(JsonInclude.Include.NON_EMPTY);
        builder.indentOutput(true).dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        //converters.add(new MappingJackson2HttpMessageConverter(builder.build()));

        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.registerModule(new YammerModule());

        List<Age> ages = new ArrayList<Age>();

        Age age5 = new Age(5L);
        age5.getRecords().add(createRecord(Gender.MALE,"5km",5l));
        age5.getRecords().add(createRecord(Gender.FEMALE,"5M",6l));
        System.out.println(age5);
        ages.add(age5);

        Age age6 = new Age(6L);
        age6.getRecords().add(createRecord(Gender.MALE,"6km",6l));
        age6.getRecords().add(createRecord(Gender.FEMALE,"13.1M",7l));
        System.out.println(age6);
        ages.add(age6);

        String result = objectMapper.writeValueAsString(ages);
        System.out.println(result);

//        mapper.writeValue(new File("outputfile.json"), car);

    }

    private Record createRecord(Gender gender,String distance,Long ocSeconds) {
        Record r = new Record(gender,distance,ocSeconds);
        return r;
    }


}