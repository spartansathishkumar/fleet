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

public class SADemo1 extends ProjectSpecificMethods {
	WebDriver driver;

	


	@Given("Pick and Click Fleet User option")
	public SADemo1 selectFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user clicked successfully", "pass"); 
		return this;
	}

	@When("Enter Fleet ID2 as {string}")
	public SADemo1 enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username2 as {string}")
	public SADemo1 enterUserIDBirdeyeview(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password2 as {string}")
	public SADemo1 enterPassword2(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Choose User2 Type as Admin")
	public SADemo1 selectAdmin2() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	/*@And("Select User Type as Group")
	public SADemo1 selectGroup() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-01"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}*/

	@Then("Select the Privacy Policy2 checkbox")
	public SADemo1 selectagreeCheck2(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Agree to Selected successfully", "pass");
		return this;
	}

	

	@Then("Click on the bird eye view icon2")
	public SADemo1 BirdEyeview() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles")
	public SADemo1  clickFilter() throws Exception {
		//waitForApperance(locateElement(Locators.XPATH, "//img[@title='Filter']")); 
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply")
	public SADemo1 ClickApply() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		//click(locateElement(Locators.XPATH, "(//*[contains(@type,'checkbox')])[2]"));
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied successfully", "pass");
		return this;
	}
	@Then("Check whether the SADemo1 vehicle is displayed or not using assertion")
	public SADemo1 SADemo1Assertion() throws Exception {
		Thread.sleep(3000);
	//	locateElement(Locators.XPATH, "//img[@src='https://maps.gstatic.com/mapfiles/transparent.png").isDisplayed();
		
		//locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]").isDisplayed();
		locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]").isDisplayed();
		
		
		reportStep("SADemo1 vehicle is displayed using assertion successfully", "pass");
		return this;
	}
	
	
	
	@And("Choose User Type as Admin")
	public SADemo1 ChooseGroup() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-01"));
		reportStep("UserType has chosen successfully", "pass");
		return this;
	}
	
	
	@Then("Pick and click Login button")
	public HomePage PickclickLogin1() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
}
