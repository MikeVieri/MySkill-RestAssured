package AzureAPI.APITest;

import AzureAPI.APIPayload.PostUser;
import AzureAPI.APIURL.AzureURL;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIRequestAzure
{
    @BeforeClass
    public void setUp()
    {
        RestAssured.baseURI = AzureURL.BaseURL();
    }

    @Test
    public void getRequest()
    {
        given()
                .when()
                .get("api/v1/Activities")
                .then().log().body().statusCode(200);
    }

    @Test
    public void postRequest()
    {
        given()
                .header("Content-Type", "application/json")
                .body(PostUser.CreateUser().toString())
                .when()
                .post("api/v1/Activities")
                .then()
                .log().body().statusCode(200);

    }
}






