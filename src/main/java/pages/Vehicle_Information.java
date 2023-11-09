



package pages;

import design.Locators;
import testng.api.base.ProjectSpecificMethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vehicle_Information extends ProjectSpecificMethods {
	WebDriver driver;

	//Scenario: TC034 Validation for the Quick View
	
	@Given("Click Fleet User option for the Quick View")
	public Vehicle_Information clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the Quick View as {string}")
	public Vehicle_Information enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the Quick View as {string}")
	public Vehicle_Information enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the Quick View as {string}")
	public Vehicle_Information enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the Quick View")
	public Vehicle_Information selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the Quick View")
	public Vehicle_Information selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox for the tracking is selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the Quick View")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the Quick View")
	public Vehicle_Information BirdEyeview() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the Quick View")
	public Vehicle_Information  clickFilter() throws Exception {
		
		Thread.sleep(8500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Quick View")
	public Vehicle_Information ClickApply() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the Quick View")
	public Vehicle_Information ClickSADemo1() throws Exception 
	{
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]")); 
		
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	@Then("Click on the right arrow and Quick View in the dashboard")
	public Vehicle_Information ClickQuickView() throws Exception 
	{
		Thread.sleep(3000);
		click(locateElement(Locators.ID, "dispOdoNxtBtn"));
		Thread.sleep(3000);
		click(locateElement(Locators.ID, "quickViewIcon"));
		reportStep("Click on the right arrow and Quick View in the dashboard is successful", "pass");
		return this;
	}
	
	//Scenario: TC035 Validation for the Assign Go-Fence
	@Then("Click on the right arrow and Assign Go-Fence in the dashboard")
	public Vehicle_Information ClickAssignGoFence() throws Exception 
	{
		Thread.sleep(5000);
		click(locateElement(Locators.ID, "dispOdoNxtBtn"));
		Thread.sleep(5000);
		click(locateElement(Locators.ID, "assignGoFence"));
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[9]"));
		reportStep("Click on the right arrow and Assign Go-Fence in the dashboard is successful", "pass");
		return this;
	}
	
	//Scenario: TC036 Validation for the Assign No-Go-Fence
	@Then("Click on the right arrow and Assign No-Go-Fence in the dashboard")
	public Vehicle_Information ClickAssignNoGoFence() throws Exception 
	{
		//Thread.sleep(8000);
		//click(locateElement(Locators.ID, "dispOdoNxtBtn"));
		Thread.sleep(8000);
		click(locateElement(Locators.ID, "assignNoGo"));
		Thread.sleep(8000);
		click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[10]"));
		reportStep("Click on the right arrow and Assign No-Go-Fence in the dashboard is successful", "pass");
		return this;
	}
	//Scenario: TC037 Validation for the Assign Driver
		@Then("Click on the right arrow and Assign Driver in the dashboard")
		public Vehicle_Information ClickAssignDriver() throws Exception 
		{
			Thread.sleep(3000);
			click(locateElement(Locators.ID, "dispOdoNxtBtn"));
			Thread.sleep(3000);
			click(locateElement(Locators.ID, "driverIcon"));
			Thread.sleep(3000);
			click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[7]"));
			reportStep("Click on the right arrow and Assign Driver in the dashboard is successful", "pass");
			return this;
			
			
			
		}
		
		
		//Scenario: TC038 Validation for the Vehicle Summary
		@Then("Click on the Vehicle Summary in the dashboard")
		public Vehicle_Information ClickVehicleSummary() throws Exception 
		{
			
			Thread.sleep(3000);
			click(locateElement(Locators.CSS, "#reportsIcon"));
			reportStep("Click on the right arrow and Vehicle Summary in the dashboard is successful", "pass");
			return this;
		}
		
		//Scenario: TC039 Validation for the Vehicle Info
				@Then("Click on the right arrow and Vehicle Info in the dashboard")
				public Vehicle_Information ClickVehicleInfo() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					Thread.sleep(3000);
					click(locateElement(Locators.ID, "vehicleIcon"));
					reportStep("Click on the right arrow and Vehicle Info in the dashboard is successful", "pass");
					return this;
				}
		
		//Scenario: TC040 Validation for the Odometer
				@Then("Click on the right arrow and Odometer in the dashboard")
				public Vehicle_Information ClickOdometer() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.ID, "odometerIcon"));
					
					
					reportStep("Click on the right arrow and Odometer in the dashboard is successful", "pass");
					return this;
				}
		
				@Then("Click on the save button in the Odometer of dashboard")
				public Vehicle_Information ClickOdometerSave() throws Exception 
				{					
					click(locateElement(Locators.CSS, "#odometerInput > div > div.popTxt > div.group.devicegroup > a.btn.btn-primary"));
					reportStep("Click on the save button in the Odometer of dashboard is successful", "pass");
					return this;
				}
		
		//Scenario: TC041 Validation for the Safety
				@Then("click the Filter icon and Clear All option for all the vehicles for the Safety")
				public Vehicle_Information  clickFilterSafety() throws Exception {
					
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
					click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
					reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
					return this;
				}
				@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Safety")
				public Vehicle_Information ClickApplySafety() throws Exception {
					Thread.sleep(5000);
					click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
					click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
					Thread.sleep(3000);
					click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
					Thread.sleep(2000);
					click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
					Thread.sleep(2000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass"); 
					return this;
				}
				
				@Then("Click on the SADemo1 vehicle for the Safety")
				public Vehicle_Information ClickSADemo1Safety() throws Exception 
				{
					Thread.sleep(3000);
					click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
					
					reportStep("Click on the SADemo1 vehicle is successful", "pass");
					return this;	
				}
				
				
				
				@Then("Click on Safety in the dashboard")
				public Vehicle_Information ClickSafety() throws Exception 
				{
				//	click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.XPATH, "//*[contains(@id,'safetyIcon')]"));						
					reportStep("Click on the right arrow and Safety in the dashboard is successful", "pass");
					return this;
				}
		
		
		//Scenario: TC042 Validation for the Fuel Capacity
				@Then("Click on the right arrow and Fuel Capacity in the dashboard")
				public Vehicle_Information ClickFuelCapacity() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.ID, "fuelIcon"));						
					reportStep("Click on the right arrow and Fuel Capacity in the dashboard is successful", "pass");
					return this;
				}
		
		// Scenario: TC043 Validation for the Service Remainder
				
				@Then("Click on the right arrow and Service Remainder in the dashboard")
				public Vehicle_Information ClickServiceRemainder() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.ID, "serviceIcon"));						
					reportStep("Click on the right arrow and Service Remainder in the dashboard is successful", "pass");
					return this;
				}
		
		//Scenario: TC044 Validation for the Amber Shield
				@Then("Click on the bird eye view icon for the Amber Shield")
				public Vehicle_Information BirdAmberShield() throws Exception {
					Thread.sleep(3500);
					click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
					click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
					reportStep("bird eye view icon clicked successfully", "pass");
					return this;
				}
				@Then("click the Filter icon and Clear All option for all the vehicles for the Amber Shield")
				public Vehicle_Information  clickFilterAmberShield() throws Exception {
					
					Thread.sleep(9500);
					click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
					click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
					reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
					return this;
				}
				@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Amber Shield")
				public Vehicle_Information ClickApplyAmberShield() throws Exception {
					Thread.sleep(5000);
					click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
					click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
					Thread.sleep(3000);
					click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
					Thread.sleep(2000);
					click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
					Thread.sleep(2000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
					return this;
				}
				
				@Then("Click on the SADemo1 vehicle for the Amber Shield")
				public Vehicle_Information ClickSADemo1AmberShield() throws Exception 
				{
					Thread.sleep(3000);
					//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@draggable,'false')])[2]"));
					
					//click(locateElement(Locators.XPATH, "//*[contains(@title,'Parked')]"));
					
					
					reportStep("Click on the SADemo1 vehicle is successful", "pass");
					return this;	
				}
				
				@Then("Click on the right arrow and Amber Shield in the dashboard")
				public Vehicle_Information ClickAmberShield() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.ID, "shieldIcon"));						
					reportStep("Click on the right arrow and Amber Shield in the dashboard is successful", "pass");
					return this;
				}
				@Then("Assertion of the Amber shield") 
				public Vehicle_Information AssertionAmberShield() throws Exception 
				{
					locateElement(Locators.CLASS_NAME, "selected-group-left").isDisplayed();						
					reportStep("Assertion of the Amber shield is successful", "pass"); 
					return this;
				}
				
		//Scenario: TC045 Validation for the Insurance
				@Then("Click on the right arrow and Insurance in the dashboard")
				public Vehicle_Information ClickInsurance() throws Exception 
				{
					click(locateElement(Locators.ID, "dispOdoNxtBtn"));
					click(locateElement(Locators.ID, "insuranceIcon"));						
					reportStep("Click on the right arrow and Insurance in the dashboard is successful", "pass");
					return this;
				}
				@Then("Assertion of the Insurance")
				public Vehicle_Information AssertionInsurance() throws Exception 
				{
					locateElement(Locators.CSS, "#devicesResults > div:nth-child(1) > div.deviceform-left > div:nth-child(2) > label").isDisplayed();						
					reportStep("Assertion of the Insurance is successful", "pass");
					return this;
				}
		
	
}