package com.qa.PetClinic;

import org.junit.*; 
import com.relevantcodes.extentreports.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOwners {
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Almasa\\Reports\\GetOwners.html", true);
	ExtentTest test = extent.startTest("Get owners", "Obtain a list of all owners");
	
	@Test
	public void Get_All_Owners() { 
		ExtentTest test = extent.startTest("Get all owners", "Obtain a list of all owners");
		RequestSpecification request = RestAssured.given();
		Response response = request.get(Constants.url);
		response.then().statusCode(200);
		response.prettyPrint();
	
		test.log(LogStatus.INFO, "Get list of owners");
		extent.endTest(test);
		extent.flush();
	}
	
	@Test
	public void Get_Individual_Owner_By_ID() {
		int owner_ID = 16; //Owner's ID, change for individual owners
		RequestSpecification request = RestAssured.given();
		Response response = request.get(Constants.url + "/" + owner_ID);
		response.prettyPrint(); 
		test.log(LogStatus.INFO, "Get owner by ID");
		extent.endTest(test);
		extent.flush();
	}

	@Test
	public void Get_Individual_Owner_By_Last_Name() { 
		String owner_LastName = "Franklin"; //Owner's last name, change for individual owners
		RequestSpecification request = RestAssured.given();
		Response response = request.get(Constants.url + "/*/lastname/" + owner_LastName);
		response.prettyPrint();
		test.log(LogStatus.INFO, "Get owner by last name");
		extent.endTest(test);
		extent.flush();
	}
}
