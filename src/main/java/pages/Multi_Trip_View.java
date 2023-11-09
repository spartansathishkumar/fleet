
package pages;

import design.Locators;
import testng.api.base.ProjectSpecificMethods;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multi_Trip_View extends ProjectSpecificMethods {

	//Click on the Live tracking 
	
	@Given("Click Fleet User for Multi Trip View")
	public Multi_Trip_View clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for Multi Trip View as {string}")
	public Multi_Trip_View enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for Multi Trip View as {string}")
	public Multi_Trip_View enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for Multi Trip View as {string}")
	public Multi_Trip_View enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for Multi Trip View")
	public Multi_Trip_View selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for Multi Trip View")
	public Multi_Trip_View selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("click Login button for Multi Trip View")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("click Login button is successfull", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the trips for Multi Trip View")
				public Multi_Trip_View ClickTrips() throws Exception 
				{
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
						
					reportStep("Click on the trips is successful", "pass");
					return this;
				}
				
				@Then("click on the filter and SADEMO5 and apply for Multi Trip View")
				public Multi_Trip_View ClickSADemo5() throws Exception 
				{
					Thread.sleep(14000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the Multi Trip View2")
				public Multi_Trip_View ClickMultiTrip() throws Exception 
				{
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-type,'multiTripTab')]"));
					
					
					
					
					
					
					
					
					
					
					/*	Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c4')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'applyBtn btn btn-sm btn-primary')]"));
					Thread.sleep(8000);    */
					
					
					
					
					
					 
					
					
					
					Thread.sleep(10000);
				//	click(locateElement(Locators.XPATH, "(//*[contains(@title,'Export Trip')])[1]"));
					
					reportStep("click on the Multi Trip View is successfull", "pass"); 
					return this;  
				}
				@Then("click on the live tracking in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickliveTracking() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'liveTrackIcon')])[1]"));
					
					reportStep("click on the live tracking in the Dash board is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Multi Trip View")
				public Multi_Trip_View ClickMultiTrip4Trips() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-type,'multiTripTab')]"));
					
					
					
					
					
					
			/*		Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'date-icon')])[2]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c4')])[1]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'applyBtn btn btn-sm btn-primary')]"));    */
					
					
					
					
					
					
					
					
					
					reportStep("click on the Multi Trip View is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Trips in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickTripsDashboard() throws Exception 
				{
					Thread.sleep(12000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'tripsIcon')])[1]"));
					
					reportStep("click on the Trips in the Dash board is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the Disable engine in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickDisableEngineDashboard() throws Exception 
				{
					Thread.sleep(12000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'engineIcon')])[1]"));
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[5]"));
					reportStep("click on the Disable engine in the Dash board is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Alerts in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickAlerts() throws Exception 
				{
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'alertsIcon')])[1]"));
					reportStep("click on the Alerts in the Dash board is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Events in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickEvents() throws Exception 
				{
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'eventIcon')])[1]"));
					reportStep("click on the Events in the Dash board is successfull", "pass"); 
					return this; 
				}
				@Then("click on the share location in the Dash board for Multi Trip View")
				public Multi_Trip_View ClickShareLocation() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@id,'shareLocIcon')])[1]"));
					Thread.sleep(8000);
					/*click(locateElement(Locators.XPATH, "//*[contains(@id,'shareSelect')]"));
					Thread.sleep(8000);*/
					
					
					
					
					WebElement testDropDown = locateElement(Locators.XPATH, "//*[contains(@id,'shareSelect')]");
					Select dropdown = new Select(testDropDown);  
					dropdown.selectByIndex(1);  
							
							
							
							
					/*click(locateElement(Locators.XPATH, "(//*[contains(@data-original-index,'1')])[2]"));
					Thread.sleep(8000);*/
					click(locateElement(Locators.XPATH, "//*[contains(@class,'form-btn assign-btn')]")); 
					Thread.sleep(8000);
				//	click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[12]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@src,'images/close.png')])[7]"));
					
					reportStep("click on the share location in the Dash board is successfull", "pass"); 
					return this; 
				}
				@Then("Click on the trips for Events under Multi Trip View")
				public Multi_Trip_View ClickTrips2() throws Exception 
				{
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					Thread.sleep(6000);
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
							
					reportStep("click on the trips is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the filter and SADEMO5 and apply for alerts under Multi Trip View")
				public Multi_Trip_View ClickSADemo5Alerts() throws Exception 
				{
					Thread.sleep(18000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(10000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(10000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the filter and SADEMO5 and apply for events under Multi Trip View")
				public Multi_Trip_View ClickSADemo5Events() throws Exception 
				{
					Thread.sleep(20000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(12000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(12000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply is successfull", "pass"); 
					return this; 
				}
				@Then("click on the filter and SADEMO5 and apply for share location under Multi Trip View")
				public Multi_Trip_View ClickSADemo5ShareLocation() throws Exception 
				{
					Thread.sleep(22000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(14000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(14000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply is successfull", "pass"); 
					return this; 
				}
				
				
				
				
					}

					
