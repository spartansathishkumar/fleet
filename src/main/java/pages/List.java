



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

import base.SeleniumBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class List extends ProjectSpecificMethods {
//	WebDriver driver;
  //  File folder;
	//Export xls pdf and graphical pdf files after clicking filter and SADEMO5 
	
	@Given("Click Fleet User for Alwyn street")
	public List clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for Alwyn street as {string}")
	public List enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for Alwyn street as {string}")
	public List enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for Alwyn street as {string}")
	public List enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for Alwyn street")
	public List selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for Alwyn street")
	public List selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("click Login button for Alwyn street")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("click Login button is successfull", "pass");
		return new HomePage();
	}
	
	
/*	SeleniumBase sum= new SeleniumBase();
	sum.waitForApperance(locateElement(Locators.XPATH, " "));
	click(locateElement(Locators.XPATH, "    "));   */
	
				@Then("Click on the trips for Alwyn street")
				public List ClickTrips() throws Exception 
				{
					
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					
				
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'trips')]"));
					
					
						
					reportStep("Click on the trips is successful", "pass");
					return this;
				}
				
				@Then("click on the filter and SADEMO5 and apply for Alwyn street")
				public List ClickSADemo5() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'filtericon')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'filtericon')]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
				
					
					
					reportStep("click on the filter and SADEMO5 and apply for Alwyn street is successfull", "pass"); 
					return this; 
				}
				
				@Then("click on the List and click on the first three check boxes")
				public List ClickList() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'list-view-link')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@class,'list-view-link')]")); 
				
					
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'checkbox')])[2]"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'checkbox')])[3]"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'checkbox')])[4]"));
					
					
					
					
					reportStep("click on the List and click on the first three check boxes is successfull", "pass");   
					return this; 
				}
				@Then("click on the classify selected trips and click on the Business")
				public List ClickBusiness() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'add-btn-new classifyBtn')]")); 
					click(locateElement(Locators.XPATH, "//*[contains(@class,'add-btn-new classifyBtn')]")); 
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-id,'Business')])[1]"));
					
					
					
					reportStep("click on the classify selected trips and click on the Business is successfull", "pass");  
					return this; 
				}
			
				@Then("click on the Download and click on Export in XLS")
				public List ClickDownload() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'dropdown-menu')])[7]"));
					
					reportStep("click on the Download and click on Export in XLS is successfull", "pass");  
					return this; 
				}
				@Then("click on the first Link nearby end")
				public List ClickFirstLink() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//a[normalize-space()='Alwyn Street, Pretoria, GP']"));
					click(locateElement(Locators.XPATH, "//a[normalize-space()='Alwyn Street, Pretoria, GP']"));
					
				
					
					reportStep("click on the first Link nearby end is successfull", "pass");  
					return this; 
				}
					
				@Then("Assertion of the Business")
				public List AssertBusiness() throws Exception 
				{
				
					
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'selClassify')]"));
					locateElement(Locators.XPATH, "//*[contains(@class,'selClassify')]").isDisplayed();
					
					
					
					
					reportStep("Assertion of the Business is successfull", "pass");   
					return this; 
				}
					}

					
