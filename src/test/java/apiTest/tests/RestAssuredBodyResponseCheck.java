package apiTest.tests;

import apiTest.model.User;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredBodyResponseCheck extends AbstractRestAssuredTest {

    @Test
    public void responseBodyCheck() {
        response = RestAssured.when()
                .get("/users")
                .andReturn();
        ResponseBody<?> responseBody = response.getBody();
        User[] users = responseBody.as(User[].class);
        Assert.assertEquals(users.length, 10);

    }
}
