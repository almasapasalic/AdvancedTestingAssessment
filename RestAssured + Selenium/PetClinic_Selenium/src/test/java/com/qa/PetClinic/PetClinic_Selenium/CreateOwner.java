package com.qa.PetClinic.PetClinic_Selenium;

import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateOwner {
	
	WebDriver driver;
	
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Almasa\\Reports\\CreateUser.html", true);
	ExtentTest test; 
	
	@Before //set up extent report, Chrome driver 
	public void setup() { 
		test = extent.startTest("Create a new Owner");
		test.log(LogStatus.INFO, "Browser started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
	@After //quit driver, create report
	public void teardown() { 
		//driver.quit();
		extent.flush(); 
	}
	
	@Test 
	public void create_Owner() { 
		driver.manage().window().maximize();
		driver.get(Constants.url);
		Constants c = PageFactory.initElements(driver, Constants.class); //Object
		c.createOwner("Example", "Owner", "Example Address", "Manchester", "0123456789"); //Call method to create Owner 
		
		//Not sure which test to run to check if user has been created
		
		
		//Report options 
			//test.log(LogStatus.PASS, "New user created");
			//test.log(LogStatus.FAIL, "Failed to create user");
	}

}
