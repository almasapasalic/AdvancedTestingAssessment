package com.qa.PetClinic;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DeleteOwner {
	
	@Test 
	public void Delete_Owner() { 
		int owner_ID = 15; //Owner ID, change for individual owners
		RequestSpecification request = RestAssured.given();
		request.delete(Constants.url + "/" + owner_ID);
	}
}
