package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TestExamples {


@Test
	public void test_1() {
		
	Response response = get("https://jsonplaceholder.typicode.com/users");
	
	int actualStatusCode = response.getStatusCode();
	
	System.out.println(actualStatusCode);
	
	Assert.assertEquals(actualStatusCode,200);
	
	}

@Test
public void test_2() {
	baseURI = "https://jsonplaceholder.typicode.com";
	given().get("/users").then().statusCode(200).body("[0].id", equalTo(1)).log().all();
	
	
}
}
