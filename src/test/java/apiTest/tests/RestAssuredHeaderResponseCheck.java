package apiTest.tests;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredHeaderResponseCheck extends AbstractRestAssuredTest {
    private String expectedResponseHeader = "application/json; charset=utf-8";

    @Test
    public void headerResponseCheck() {
        response = RestAssured.when()
                .get("/users")
                .andReturn();
        String actualResponseHeader = response.getContentType();
        Assert.assertEquals(actualResponseHeader, expectedResponseHeader);
    }
}
