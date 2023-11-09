
package pages;

import design.Locators;
import testng.api.base.ProjectSpecificMethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trips_Data extends ProjectSpecificMethods {
	WebDriver driver;

	//Scenario: TC046 Assertion for the Trips
	
	@Given("Click Fleet User for trips data")
	public Trips_Data clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for trips data as {string}")
	public Trips_Data enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for trips data as {string}")
	public Trips_Data enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for trips data as {string}")
	public Trips_Data enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type for trips data as Admin")
	public Trips_Data selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for trips data")
	public Trips_Data selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for trips data")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the Trips and Assertion of the Trips")
				public Trips_Data TripsAssertion() throws Exception 
				{
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					//click(locateElement(Locators.XPATH, "//*[@id=\"nav-accordion\"]/li[3]/a"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
					locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]").isSelected();	
					reportStep("Click on the Trips and Assertion of the Trips is successful", "pass");
					return this;
				}
				
				@Then("click the Filter icon and click on the SADemo5 and Apply for today in Calendar")
				public Trips_Data ClickSADemo5() throws Exception 
				{
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);
					//click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					reportStep("click the Filter icon and click on the SADemo5 and Apply is successfull", "pass"); 
					return this; 
				}
				@Then("click on the today in Calendar and show the number of trips on today")
				public Trips_Data Calendar_Today() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Today')]"));
					 					
					reportStep("click on the today in Calendar and show the number of trips on today is successful", "pass"); 
					return this;
				}
				
				@Then("click on the yesterday in Calendar and show the number of trips on yesterday")
				public Trips_Data Calendar_Yesterday() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Yesterday')]"));
									
					reportStep("click on the yesterday in Calendar and show the number of trips on yesterday is successful", "pass");
					return this;
				}
				
				
				@Then("click on the last ten days in Calendar and click on load more on last ten days")
				public Trips_Data Calendar_last_ten_days() throws Exception 
				{
					
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Last 10 Days')]"));
			
				
					reportStep("click on the last ten days in Calendar and click on load more on last ten days is successful", "pass");
					return this;
				}
				
				
				@Then("click on the this month in Calendar and click on load more on this month")
				public Trips_Data Calendar_this_month() throws Exception 
				{
					Thread.sleep(8000);
					
				
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'This Month')]"));
				
				
					reportStep("click on the this month in Calendar and click on load more on this month is successful", "pass");
					return this;
				}
				
				@Then("click on the last month in Calendar and click on the custom and click on one full month earlier from the pre-selected month and apply")
				public Trips_Data Calendar_Last_month() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Last Month')]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Custom')]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c4')])[1]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c5')])[1]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'button')])[1]")); 
					
					
					reportStep("click on the last month in Calendar and click on the custom and click on one full month earlier from the pre-selected month and apply is successful", "pass");
					return this;
				}
				
				@Then("click on the older than six months in Calendar and click on one month earlier and click on the start and end date of the earlier month and apply")
				public Trips_Data older_than_six_month() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "/html/body/div[12]/div[3]/ul/li[7]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'prev available')])[2]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c2')])[3]"));
					Thread.sleep(3000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c4')])[3]"));
					Thread.sleep(3000);
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'button')])[3]"));
					
					
					reportStep("click on the older than six months in Calendar and click on one month earlier and click on the start and end date of the earlier month and apply is successful", "pass");
					return this; 
				}
				
			
				
				     
				    
			        
				
				//Commencement of negative scenarios with Test device
				
				@Then("click the Filter icon and click on the Test device and Apply for today in Calendar")
				public Trips_Data ClickTestDevice() throws Exception 
				{
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);						
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'vehicleList checkBoxContainer headercheckbox')])[9]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					reportStep("click the Filter icon and click on the Test device and Apply for today in Calendar is successfull", "pass"); 
					return this; 
				}	
				
				
				
				@Then("click on the last ten days in Calendar")
				public Trips_Data Calendar_last_ten_daysNegative() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]")); 
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Last 10 Days')]"));
					
					reportStep("click on the last ten days in Calendar and click on load more on last ten days is successful", "pass");
					return this;
				}
				
				
				@Then("click on the this month in Calendar")
				public Trips_Data Calendar_this_monthNegative() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'This Month')]"));
					
					reportStep("click on the this month in Calendar and click on load more on this month is successful", "pass");
					return this;
				}
				
				@Then("click on the last month in Calendar")
				public Trips_Data Calendar_Last_monthNegative() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Last Month')]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Custom')]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c4')])[1]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c5')])[1]"));
					Thread.sleep(4000);
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'button')])[1]")); 
					
					reportStep("click on the last month in Calendar and click on the custom and click on one full month earlier from the pre-selected month and apply is successful", "pass");
					return this;
				}
				
				@Then("click on the older than six months in Calendar")
				public Trips_Data older_than_six_monthNegative() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "/html/body/div[12]/div[3]/ul/li[7]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'prev available')])[2]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c2')])[3]"));
					Thread.sleep(3000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c4')])[3]"));
					Thread.sleep(3000);
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'button')])[3]"));
					
					reportStep("click on the older than six months in Calendar and click on one month earlier and click on the start and end date of the earlier month and apply is successful", "pass");
					return this;
				}
				
				
				
				
				
				
				
				
				
				
				
				
}