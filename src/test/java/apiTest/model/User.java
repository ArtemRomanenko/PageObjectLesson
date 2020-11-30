package apiTest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
public class User {
    private int id;
    private String name;
    private String username;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
