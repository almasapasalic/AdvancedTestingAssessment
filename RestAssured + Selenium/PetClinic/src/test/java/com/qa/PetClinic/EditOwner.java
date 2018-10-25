package com.qa.PetClinic;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class EditOwner {
	
	@Test
	public void Edit_Owner() { 
		int owner_ID = 16; //Owner ID, change for individual owners
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("address", "Enter address here");
		requestParams.put("city", "Manchester");
		requestParams.put("firstName", "Edited");
		requestParams.put("id", owner_ID);
		requestParams.put("lastName", "Owner");
		requestParams.put("telephone", "1234567890");
		
		request.body(requestParams);
		
		Response response = request.put(Constants.url + "/" + owner_ID);
		response.then().statusCode(204);
		response.prettyPrint();
	}

}
