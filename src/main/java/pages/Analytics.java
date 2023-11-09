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

import base.SeleniumBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Analytics extends ProjectSpecificMethods {

	
	
	private static final WebElement WebElement = null;


	@Given("Click Fleet User for Analytics")
	public Analytics clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for Analytics as {string}")
	public Analytics enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data); 
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for Analytics as {string}")
	public Analytics enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for Analytics as {string}")
	public Analytics enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for Analytics")
	public Analytics selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for Analytics")
	public Analytics selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("click Login button for Analytics")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("click Login button is successfull", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the Analytics")
				public Analytics ClickAnalytics() throws Exception 
				{
					
					
					
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]")); 
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'reports')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'reports')]"));
					
					reportStep("Click on the Analytics is successful", "pass");
					return this;
				}
				
				@Then("Assertion on the All vehicles in the Key Performance Indicators and Yesterday")
				public Analytics Assertion4AllVehicles() throws Exception 
				{
				Thread.sleep(8000);
				locateElement(Locators.XPATH, "//*[contains(@class,'selFilterHeadTxt')]").isDisplayed();
				System.out.println("Assertion on the All vehicles in the Key Performance Indicators is successful");
				Thread.sleep(8000);								
			    locateElement(Locators.XPATH, "(//*[contains(@id,'picker')])[1]").isDisplayed();
			    System.out.println("Assertion on the yesterday is successful");
				reportStep("Assertion on the Key Performance Indicators as All Vehicles and Yesterday is successfull", "pass"); 
				return this; 
				}
				
				
	
				
				
				@Then("click on the fleet summary in the vehicle reports")
				public Analytics ClickfleetSummary() throws Exception 
				{
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'CardLightBlue')])[1]"));
					
					reportStep("click on the fleet summary in the vehicle reports is successfull", "pass"); 
					return this;  
				}
				@Then("Export as image and pdf and xls for last ten days")
				public Analytics ExportLastTenDays() throws Exception 
				{
					/*Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.CSS, "body > div:nth-child(111) > div:nth-child(3) > ul:nth-child(2) > li:nth-child(3)"));  */
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					reportStep("Export as image and pdf and xls for last ten days is successfull", "pass"); 
					return this; 
				}
			
				@Then("Export as image and pdf and xls for Today")
				public Analytics ExportToday() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-range-key,'Today')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					reportStep("Export as image and pdf and xls for Today is successfull", "pass"); 
					return this; 
				}
				
				
				@Then("Export as image and pdf and xls for Yesterday")
				public Analytics ExportYesterday() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Yesterday')])[2]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					reportStep("Export as image and pdf and xls for Yesterday is successfull", "pass");  
					return this; 
				}
				
				@Then("Export as image and pdf and xls for custom and last month")
				public Analytics ExportCustomLastMonth() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					Thread.sleep(8000);
					
					
					SeleniumBase sum= new SeleniumBase();
					
	                sum.waitForApperance(locateElement(Locators.XPATH, "(//li[contains(@data-range-key,'Custom')])[2]"));
					
					click(locateElement(Locators.XPATH, "(//li[contains(@data-range-key,'Custom')])[2]")); 
					
					
					
					
				//	click(locateElement(Locators.XPATH, "(//li[text()='Custom'])[4]"));
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//li[contains(@data-range-key,'Last Month')])[2]"));
					
					click(locateElement(Locators.XPATH, "(//li[contains(@data-range-key,'Last Month')])[2]"));
					
					
				//	click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Custom')])[4]")); 
					//Thread.sleep(8000);
					//click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last')])[12]"));
					//click(locateElement(Locators.XPATH, "(//li[@data-range-key='Last Month'])[4]")); 
					//Thread.sleep(8000);
					//click(locateElement(Locators.XPATH, "(//*[contains(@class,'prev available')])[2]"));
					//click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Custom')])[3]"));
				   Thread.sleep(8000); 
					/*click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last Month')])[4]"));  
					Thread.sleep(8000);*/
					
					/*click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c6')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r5c1')])[1]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@type,'button')])[5]"));
					Thread.sleep(8000);*/
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					reportStep("Export as image and pdf and xls for custom and last month is successfull", "pass"); 
					return this;  
				}
				
				@Then("click on the back buttton")
				public Analytics ClickBackButton() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'backArrowBtn')])[3]"));
					
					reportStep("click on the back buttton is successful", "pass");
					return this;
				}
				
				
				@Then("click on the vehicle summary and click ok button")
				public Analytics ClickVehicleSummary() throws Exception 
				{
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'CardLightBlue')])[2]"));
					Thread.sleep(9000);
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'ok-btn')])[5]"));
					reportStep("click on the vehicle summary and click ok button is successful", "pass");
					return this;
				}
				@Then("click on the filter and SADEMO5 and apply for Analytics")
				public Analytics ClickSADEMO5Analytics() throws Exception 
				{
					Thread.sleep(14000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					Thread.sleep(8000);								
					click(locateElement(Locators.XPATH, "(//*[contains(@name,'vehiclelist')])[7]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
					
					reportStep("click on the filter and SADEMO5 and apply is successful", "pass");
					return this;
				}
				@Then("Assertion in the SAdemo5 in Key Performance Indicators and Yesterday")
				public Analytics AssertionSADEMO5() throws Exception 
				{
					Thread.sleep(9000);
					locateElement(Locators.XPATH, "//*[contains(@class,'selFilterHeadTxt')]").isDisplayed();
					System.out.println("Assertion in the SAdemo5 in Key Performance Indicators is successful");
					Thread.sleep(9000);
					locateElement(Locators.XPATH, "(//*[contains(@class,'dateTxt')])[1]").isDisplayed();
					System.out.println("Assertion for the yesterday is successful");
					reportStep("Assertion in the SAdemo5 in Key Performance Indicators and Yesterday is successful", "pass");
					return this;
				}
				
				
				
				
				
				
				
				@Then("Export as image and pdf and xls for This month") 
				public Analytics ExportThisMonth() throws Exception 
				{
					
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'This')])[3]"));  
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					reportStep("Export as image and pdf and xls for This month is successfull", "pass"); 
					return this; 
				}
				
				
				
				
				
				@Then("click on the Trip reports")
				public Analytics ClickTripReports() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'tab')])[2]"));
					
					reportStep("click on the Trip reports is successful", "pass");
					return this;
				}
				
				
				@Then("click on the Highlights")
				public Analytics ClickHighLights() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-name,'HIGHLIGHTS')]"));  
					
					reportStep("click on the Highlights is successful", "pass");
					return this;
				} 
				
				
				@Then("Export as image and pdf and xls for last ten days for Trip reports")
				public Analytics ClickImage() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));  
					Thread.sleep(8000);
				//	click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last')])[4]"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last 10 Days')])[3]"));
					
				/*	Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]")); */
					
					reportStep("Export as image and pdf and xls for last ten days is successful", "pass");
					return this;
				} 
				@Then("Export as image and pdf and xls for This month for Trip reports")
				public Analytics ClickThismonth() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));  
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'This')])[3]"));
				/*	Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]")); */
					
					reportStep("Export as image and pdf and xls for This month is successful", "pass");
					return this;
				} 
				@Then("Export as image and pdf and xls for last ten days for Highlights")
				public Analytics ClickTen() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));  
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last 10 Days')])[3]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					
					reportStep("Export as image and pdf and xls for last ten days is successful", "pass");
					return this;
				} 
				
				@Then("Export as image and pdf and xls for This month for Highlights")
				public Analytics ClickThismonth3() throws Exception 
				{
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));  
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'This')])[3]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]")); 
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]")); 
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "(//*[contains(@data-toggle,'dropdown')])[6]"));
					Thread.sleep(8000);
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]")); 
					Thread.sleep(18000);
					reportStep("Export as image and pdf and xls for This month is successful", "pass"); 
					return this;
				} 
				
					} 

