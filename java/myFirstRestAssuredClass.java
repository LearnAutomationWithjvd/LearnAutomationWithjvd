import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static  io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;


public class myFirstRestAssuredClass {

    public static void main (String args[]){

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(payLoad.AddPlace()).when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

        System.out.println("response " +response);
        JsonPath jsonPath = new JsonPath(response);
        String placeID = jsonPath.getString("place_id");
        System.out.println(placeID);


        String newaddress = "Summer Walk, Africa";


        // update address
        given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "\"place_id\":\""+placeID+"\",\n" +
                        "\"address\":\""+newaddress+"\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}\n").when().put("/maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));


        //get place
        String getPlacerResponse = given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id", placeID)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();

        JsonPath jsonPath1 = new JsonPath(getPlacerResponse);
        String actualAddress = jsonPath1.getString("address");
        System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, newaddress);


    }
}
