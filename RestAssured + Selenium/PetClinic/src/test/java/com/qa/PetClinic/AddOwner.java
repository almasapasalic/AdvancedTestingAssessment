package com.qa.PetClinic;

import org.json.simple.JSONObject;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddOwner {
	
	@Test 
	public void Add_New_Owner() { 
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("address", "Enter address here");
		requestParams.put("city", "Enter city here");
		requestParams.put("firstName", "Enter first name here");
		requestParams.put("id", "0");
		requestParams.put("lastName", "Enter last name here");
		requestParams.put("telephone", "1234567890");
		
		request.body(requestParams);
		Response response = request.post(Constants.url);
		response.then().statusCode(201);
		response.prettyPrint();
		
	}

}
