import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.File;

import static io.restassured.RestAssured.*;

public class AttachFile {

    public static void main(String args[]) {
        SessionFilter session;
/*

        @Test(priority = 1)
        public void login () {
*/

            RestAssured.baseURI = "http://localhost:8080";

            session = new SessionFilter();
            given().header("Content-Type", "application/json")
                    .body("{ \"username\": \"javed3518\", \"password\": \"25DeC2012@\" }")
                    .filter(session).when().post("/rest/auth/1/session");

       // }

       /* @Test(priority = 2)
        public void AddComment () {*/

       String expectedMessage = "hello javed one new comment.";
           String addComment = given().pathParam("Key", "10002").header("Content-Type", "application/json")
                    .body("{\n" +
                            "    \"body\": \""+expectedMessage+"\",\n" +
                            "    \"visibility\": {\n" +
                            "        \"type\": \"role\",\n" +
                            "        \"value\": \"Administrators\"\n" +
                            "    }\n" +
                            "}")
                    .filter(session).when().post("/rest/api/2/issue/{Key}/comment").then().assertThat().statusCode(201)
                   .extract().response().asString();

           JsonPath js = new JsonPath(addComment);
           String commentId = js.getString("id");



      //  }
       /* @Test(priority = 3)
        public void attachement () {
*/
            given().header("X-Atlassian-Token", "no-check").filter(session).pathParam("Key", "10002")
                    .header("Content-Type", "multipart/form-data")
                    .multiPart("file", new File("Abc.txt")).when()
                    .post("/rest/api/2/issue/{Key}/attachments").then().log().all().assertThat().statusCode(200);
        //}

        //GEt issue
        String issueDetails = given().filter(session).pathParam("Key", "10002")
                .queryParam("fields", "comment")
                .log().all().when().get("/rest/api/2/issue/{Key}").then()
                .log().all().extract().response().asString();
        System.out.println(issueDetails);

        JsonPath js1 = new JsonPath(issueDetails);
        int commentsCount=js1.getInt("fields.comment.comments.size()");
        for(int i=0;i<commentsCount;i++){
            String commonIdIssues = js1.get("fields.comment.comments["+i+"].id").toString();
            if (commonIdIssues.equalsIgnoreCase(commentId)) {
                String message = js1.get("fields.comment.comments["+i+"].body").toString();
            System.out.println(message);
                Assert.assertEquals(message, expectedMessage);
            }
        }
    }
}
