package test;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class JSONSchemaValidator {




	@Test
	public void testSchema() {
		baseURI = "https://jsonplaceholder.typicode.com";

		given().get("/users/1").
		then().
		assertThat().
		body(matchesJsonSchemaInClasspath("products-schema.json")).statusCode(200);
	}
}
