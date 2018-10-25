package com.qa.PetClinic.PetClinic_Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Constants {
	
	public static String url = "http://10.0.10.10:4200/petclinic/owners/add";
	
	//Add new owner fields 
	@FindBy(id = "firstName")
	private WebElement first_Name;
	
	@FindBy(id = "lastName")
	private WebElement last_Name;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy (id = "city")
	private WebElement city;
	
	@FindBy(id = "telephone")
	private WebElement telephone; 
	
	//Methods
	
	public void createOwner(String enter_firstName, String enter_lastName, String enter_address, String enter_city, String enter_telephone) { 
		first_Name.sendKeys(enter_firstName);
		last_Name.sendKeys(enter_lastName);
		address.sendKeys(enter_address);
		city.sendKeys(enter_city);
		telephone.sendKeys(enter_telephone);
		telephone.submit(); 
	}

}
