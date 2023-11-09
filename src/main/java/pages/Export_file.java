
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Export_file extends ProjectSpecificMethods {
	WebDriver driver;
    File folder;
	//Export xls pdf and graphical pdf files after clicking filter and SADEMO5 
	
	@Given("Click Fleet User for files")
	public Export_file clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for files as {string}")
	public Export_file enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for files as {string}")
	public Export_file enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for files as {string}")
	public Export_file enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for files")
	public Export_file selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for files")
	public Export_file selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("click Login button for files")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("click Login button for files is successfull", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the trips for files")
				public Export_file ClickTrips() throws Exception 
				{
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					Thread.sleep(5000);
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
						
					reportStep("Click on the trips for files is successful", "pass");
					return this;
				}
				
				@Then("click on the filter and SADEMO5 and apply for files")
				public Export_file ClickSADemo5() throws Exception 
				{
					Thread.sleep(14000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply for files is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the Download and click on Export in xls")
				public Export_file ClickExport() throws Exception 
				{
					
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@alt,'downloads')])[1]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//a[@onclick=\"exportTrip('xls')\"]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'PopupClassifyTitle')]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//p[text()='PERSONAL']")); 
					
					
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'yes-btn muliselectbtn')]"));
					reportStep("click on the Download and click on Export in xls is successfull", "pass");  
					return this; 
				}
				
				@Then("click on the Download and click on Export in pdf")
				public Export_file ClickExportPdf() throws Exception 
				{
					
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@alt,'downloads')])[1]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//a[normalize-space()='Export in PDF']"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'PopupClassifyTitle')]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//p[text()='PERSONAL']"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'yes-btn muliselectbtn')]"));
					reportStep("click on the Download and click on Export in pdf is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Download and click on Export in Graphical pdf")
				public Export_file ClickExportGraphicalPdf() throws Exception 
				{
					
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@alt,'downloads')])[1]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//a[normalize-space()='Export in Graphical PDF']"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'PopupClassifyTitle')]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//p[text()='PERSONAL']"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "//*[contains(@class,'yes-btn muliselectbtn')]"));
					reportStep("click on the Download and click on Export in Graphical pdf is successfull", "pass"); 
					return this; 
				}
		//Export xls pdf and graphical pdf files after clicking the map
				
				@Then("click on the personal and small map for files")
				public Export_file ClickExportSmallMap() throws Exception 
				{
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@data-id,'Personal')])[1]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'col-lg-4 left-map-image noPadColBoot')])[1]"));
					reportStep("click on the small map for files is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Export trip and Export in XLS")
				public Export_file ClickExportTripXLS() throws Exception 
				{
					
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);	
					click(locateElement(Locators.XPATH, "(//*[contains(@data-translate,'_page_genenaral_export_xls')])[1]"));
					reportStep("click on the Export trip and Export in XLS is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Export trip and Export in pdf")
				public Export_file ClickExportTripPdf() throws Exception 
				{
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_genenaral_export_pdf')]")); 
					
					
					reportStep("click on the Export trip and Export in pdf is successfull", "pass"); 
					return this; 
				}
				@Then("click on the Export trip and Click on the Trips Detail log")
				public Export_file ClickTripsDetail() throws Exception 
				{
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'normalExport')])[3]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@src,'images/close.png')])[10]"));
					
					reportStep("click on the Export trip and Click on the Trips Detail log is successfull", "pass"); 
					return this; 
				} 
				
				
				
						
					}

					
