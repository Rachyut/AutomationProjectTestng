package testcases;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateOneProduct {

	@Test
	public void readoneproduct() {
		
		Response response = 
		
		given()
		.baseUri("https://techfios.com/api-prod/api/product")
		.header("Content-Type","application/json; charset=UTF-8")
		.auth().preemptive().basic("demo@techfios.com","abc123")
		.body(new File("src\\main\\java\\data\\Createfile.json"))
		
		//.log().all()
		.when().post("/create.php")
		.then().extract().response();
		//.log().all();
			
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode,201);
		
		long responsetime =response.getTime();
		if(responsetime <= 2000) {
			System.out.println("Response time is on range");
		}else {
			System.out.println("Response time is not on range");
		}	
		
		String reponsecontenttype=response.getHeader("Content-Type");
		Assert.assertEquals(reponsecontenttype, "application/json; charset=UTF-8");
		
		String responsebody = response.getBody().asString();
		
		JsonPath jp = new JsonPath(responsebody);
		String productid = jp.getString("id");
		if(productid != null) {
			System.out.println("New Product is create");
			
		}else {
			System.out.println("No product is create");
		}
		
				
		
		
	}
	

}
