import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class addPlaceAPI {

    public static void main(String[] args) {

    RestAssured.baseURI="https://rahulshettyacademy.com";
    String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
            .body(payloadJSON.getData()).when().log().all().post("/maps/api/place/add/json").then()
            .assertThat().statusCode(200).body("scope",equalTo("APP"))
            .extract().response().asString();

        JsonPath jsonPath = new JsonPath(response);
        System.out.println(response);
        System.out.println(jsonPath.getString("place_id"));
}
}
