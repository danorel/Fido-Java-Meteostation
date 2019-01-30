import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONConverter implements com.mashape.unirest.http.ObjectMapper {
    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T readValue(String json, Class<T> toClass) {
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(json, toClass);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public String writeValue(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
