package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAndPostExamples {
    
    @Test
    public void testGet() {
        baseURI = "https://jsonplaceholder.typicode.com";
        
        given()
            .get("/users")
        .then()
            .statusCode(200)
            .body("[5].username", equalTo("Leopoldo_Corkery"))
            .body("[5].email", equalTo("Karley_Dach@jasper.info"));
    }

    @Test
    public void testPos() {
        baseURI = "https://jsonplaceholder.typicode.com";
        
        JSONObject request =  new JSONObject();
        request.put("name", "John Snow");
        request.put("email", "johnsnow@gmail.com");
        
        given().
        header("Content-Type","application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).body(request.toJSONString()).when().
        post("/users").
        then().statusCode(201).log().all();
;        
     
        
      
       
    }
}
