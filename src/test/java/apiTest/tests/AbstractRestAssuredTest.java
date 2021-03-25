package apiTest.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

public class AbstractRestAssuredTest {
    protected Response response;

    @BeforeTest
    public void initTest() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com" ;
    }
}
