package test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteExamples {

	@SuppressWarnings("unchecked") // Suppresses JSON-simple raw type warnings
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "Maxwell");
		request.put("email", "max@gmail.com");

		baseURI = "https://jsonplaceholder.typicode.com";

		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("/users/2") 
		.then()
		.statusCode(200)
		.log().all();    
	}

	@Test
	public void testDelete() {
		baseURI = "https://jsonplaceholder.typicode.com";

		when()
		.delete("/users/5")
		.then()
		.statusCode(200)
		.log().all();
	}
}
