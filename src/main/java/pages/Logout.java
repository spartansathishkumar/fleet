package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import design.Locators;
import testng.api.base.ProjectSpecificMethods;

public class Logout extends ProjectSpecificMethods {
	WebDriver driver;
	
	//Scenario: TC046 Validation for the logout
	
	@Given("Click Fleet User option for the logout")
	public Logout clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the logout as {string}")
	public Logout enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the logout as {string}")
	public Logout enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the password for the logout as {string}")
	public Logout enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the logout")
	public Logout selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	@Then("Select the Privacy Policy checkbox for the logout")
	public Logout selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Agree to Selected successfully", "pass");
		return this;
	}

	@Then("Click Login button for the logout")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	@Then("Click on the welcome SA demo and logout")
	public HomePage clickLogout() {
		click(locateElement(Locators.CLASS_NAME, "username"));
		click(locateElement(Locators.XPATH, "(//*[contains(@href,'logout')])[1]"));
		reportStep("Logout button picked and clicked successfully", "pass");
		return new HomePage();
	}
	@Then("Validate the logout")
	public HomePage LogoutAssertion() {
		locateElement(Locators.XPATH, "//*[contains(@class,'login-head')]").isDisplayed();
		reportStep("Logout button validation using Assertion is successful", "pass");
		return new HomePage();
	}
	
}

