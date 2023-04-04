package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class ReadAllProducts {

	
	@Test
	public void readallproducts() {
		
//	*/
//		given: all input details(baseURI,Headers,Authorization,Payload/Body,QueryParameters)
//		when:  submit api requests(Http method,Endpoint/Resource)
//		then:  validate response(status code, Headers, responseTime, Payload/Body)
//              /*
	
		Response response =
 given()
 .baseUri("https://techfios.com/api-prod/api/product")
 .header("Content-Type","application/json; charset=UTF-8")
 .auth().preemptive().basic("demo@techfios.com","abc123").
 //log().all().
  
 when()
  //.log().all()
  .get("/read.php").
  
  then()
  .extract().response();
	   
		int statuscode= response.getStatusCode();
		Assert.assertEquals(statuscode,200);
		
		long responseTime = response.getTime();
		if (responseTime <=2000) {
			System.out.println("Response Time is within range");
		}else {
			System.out.println("Response Time is out of range");
		}
		
		String responseContentType = response.getHeader("Content-Type");
		Assert.assertEquals(responseContentType,"application/json; charset=UTF-8");
		
		String responseBody= response.getBody().asString();
		
		JsonPath jp = new JsonPath(responseBody);
		 String firstProductId = jp.get("records[0].id");
		 if (firstProductId!= null) {
			 System.out.println("First product id is not null");
		 }else {
			 System.out.println("First Product id is null");
		 }
		
		
		
				
	}
}
