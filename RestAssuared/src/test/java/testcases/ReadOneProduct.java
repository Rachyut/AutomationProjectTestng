package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ReadOneProduct {

	@Test
	public void readoneproduct() {
		
		Response response = 
		
		given()
		.baseUri("https://techfios.com/api-prod/api/product")
		.header("Content-Type","application/json")
		.auth().preemptive().basic("demo@techfios.com","abc123")
		.queryParam("id","68")
		//.log().all()
		.when().get("/read_one.php?id=68")
		.then().extract().response();
		//.log().all();
			
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode,200);
		
		long responsetime =response.getTime();
		if(responsetime <= 2000) {
			System.out.println("Response time is on range");
		}else {
			System.out.println("Response time is not on range");
		}	
		
		String reponsecontenttype=response.getHeader("Content-Type");
		Assert.assertEquals(reponsecontenttype, "application/json");
		
		String responsebody = response.getBody().asString();
		
		JsonPath jp = new JsonPath(responsebody);
		
		
		String productname = jp.getString("name");
		Assert.assertEquals(productname, "");
		
		String productdescription = jp.getString("description");
		
		
		String productprice = jp.getString("price");
		
	}
	
}
