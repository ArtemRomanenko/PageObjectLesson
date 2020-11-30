package apiTest.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Geo {
    private String lat;
    private String lng;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
