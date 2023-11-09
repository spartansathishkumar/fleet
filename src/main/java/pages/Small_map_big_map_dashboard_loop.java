

package pages;

import design.Locators;
import testng.api.base.ProjectSpecificMethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Small_map_big_map_dashboard_loop extends ProjectSpecificMethods {
	WebDriver driver;

	//Scenario: TC048 Validation for the small map-big map-Dashboard loop 
	
	@Given("Click Fleet User for live tracking with maps")
	public Small_map_big_map_dashboard_loop clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for live tracking with maps as {string}")
	public Small_map_big_map_dashboard_loop enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for live tracking with maps as {string}")
	public Small_map_big_map_dashboard_loop enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for live tracking with maps as {string}")
	public Small_map_big_map_dashboard_loop enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type for live tracking with maps as Admin")
	public Small_map_big_map_dashboard_loop selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for live tracking with maps")
	public Small_map_big_map_dashboard_loop selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for live tracking with maps")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the Trips for live tracking with maps")
				public Small_map_big_map_dashboard_loop ClickTrips() throws Exception 
				{
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
						
					reportStep("Click on the Trips is successful", "pass");
					return this;
				}
				
				@Then("click the Filter icon and click on the SADEMO5 and Apply for live tracking with maps")
				public Small_map_big_map_dashboard_loop ClickSADemo5() throws Exception 
				{
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					//JavascriptExecutor js = (JavascriptExecutor) driver;
	                  //js.executeScript("window.scrollBy(0,50)");
					//click(locateElement(Locators.XPATH, "//*[contains(@class,'classy-Type Personal current')]"));
					reportStep("click the Filter icon and click on the SADemo5 and Apply is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps")
				public Small_map_big_map_dashboard_loop ClickPersonal() throws Exception 
				{
				
					click(locateElement(Locators.XPATH, "(//*[contains(@data-id,'Personal')])[1]"));
					Thread.sleep(8000);
				 	click(locateElement(Locators.XPATH, "(//*[contains(@class,'col-lg-4 left-map-image noPadColBoot')])[1]")); 
					Thread.sleep(8000);	
					//locateElement(Locators.XPATH, "//*[contains(@class,'Personal-clr')]").isDisplayed(); 
					reportStep("click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the live tracking in the dashboard and assertion on the live tracking")
				public Small_map_big_map_dashboard_loop ClickLivetracking() throws Exception 
				{
					
					click(locateElement(Locators.ID, "liveTrackIcon"));
					locateElement(Locators.XPATH, "(//*[contains(@class,'active')]//*[contains(@class,'sidebar')])[2]").isDisplayed();  
					reportStep("click on the live tracking in the dashboard and assertion on the live tracking is successfull", "pass"); 
					return this;    
					
				}
				
				@Then("click on the Trips in the Dashboard")
				public Small_map_big_map_dashboard_loop ClickTrips1() throws Exception 
				{
					
					click(locateElement(Locators.XPATH, "//*[@id='tripsIcon']"));
					reportStep("click on the Trips in the Dashboard is successfull", "pass"); 
					return this;   
					
				}
				 
				@Then("click on the Disable engine in the dashboard and close the information pop up by click on the close")
				public Small_map_big_map_dashboard_loop ClickDisableEngine() throws Exception 
				{
					
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'engineIcon')])[1]"));
					click(locateElement(Locators.XPATH, "(//a[@class='md-close'])[5]"));
					reportStep("click on the Disable engine in the dashboard and close the information pop up by click on the close is successfull", "pass"); 
					return this;   
					
				}
				
				@Then("click on the Alerts in the dashboard and assert on All notifications")
				public Small_map_big_map_dashboard_loop ClickAlerts() throws Exception 
				{
					
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'alertsIcon')])[1]"));
					locateElement(Locators.XPATH, "//*[contains(@href,'fleet-all-notifications')]").isDisplayed();  
					reportStep("click on the Alerts in the dashboard and assert on All notifications is successfull", "pass"); 
					return this;   
					
				}
				
//Scenario: TC049 Validation for the small map-big map-Dashboard-Events-Share location-loop				
				
				@Then("Click on the Trips for events")
				public Small_map_big_map_dashboard_loop ClickTrips4Events() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));	
					
					reportStep("Click on the Trips for events is successfull", "pass"); 
					return this;    
					
				}
				 
				
				@Then("click on the Events in the dashboard and assert on All notifications")
				public Small_map_big_map_dashboard_loop ClickEvents() throws Exception 
				{
					
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'eventIcon')])[1]"));
					locateElement(Locators.XPATH, "//*[contains(@href,'fleet-all-notifications')]").isDisplayed();  
					reportStep("click on the Events in the dashboard and assert on All notifications is successfull", "pass"); 
					return this;   
					
				}
				@Then("click on the share location in the dashboard and close the pop up")
				public Small_map_big_map_dashboard_loop ClickSharelocation() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'shareLocIcon')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[11]"));
					reportStep("click on the share location in the dashboard and close the pop up is successfull", "pass"); 
					return this;   
					
				}
				
				@Then("Click on the Trips for share location")
				public Small_map_big_map_dashboard_loop ClickTrips4Sharelocation() throws Exception 
				{
					Thread.sleep(8000);
					
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
					//click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[4]"));
					reportStep("Click on the Trips for share location is successfull", "pass"); 
					return this;   
					
				}
				@Then("click the Filter icon and click on the SADEMO5 and Apply for events")
				public Small_map_big_map_dashboard_loop Click4filterEvents() throws Exception 
				{
					
			
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);					 
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click the Filter icon and click on the SADEMO5 and Apply for events is successfull", "pass"); 
					return this; 
				}
				@Then("click the Filter icon and click on the SADEMO5 and Apply for share location")
				public Small_map_big_map_dashboard_loop Click4filtersharelocation() throws Exception 
				{
					Thread.sleep(15000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(10000);	
					
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']")); 
					
					reportStep("click the Filter icon and click on the SADEMO5 and Apply for share location is successfull", "pass"); 
					return this; 
				} 
				@Then("click on the personal in the classify trip and click on the small map and assertion of personal for share location")
				public Small_map_big_map_dashboard_loop ClickPersonalShareLocation() throws Exception 
				{
					Thread.sleep(10000);
					
					
							 
							click(locateElement(Locators.XPATH, "(//*[contains(@data-id,'Personal')])[1]")); 
					Thread.sleep(10000);
				 	click(locateElement(Locators.XPATH, "(//*[contains(@class,'col-lg-4 left-map-image noPadColBoot')])[1]")); 
					Thread.sleep(10000);	
					//locateElement(Locators.XPATH, "//*[contains(@class,'Personal-clr')]").isDisplayed(); 
					reportStep("click on the personal in the classify trip and click on the small map and assertion of personal for share location is successfull", "pass"); 
					return this; 
				}
				
				
				
				
}