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

public class LoginPage extends ProjectSpecificMethods {
	WebDriver driver;




	@Given("Click Fleet User option")
	public LoginPage selectFleetuser() throws Exception {
		Thread.sleep(1000);
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Login button clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID as {string}")
	public LoginPage enterfleetID(String data) throws Exception {
		Thread.sleep(1000);
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username as {string}")
	public LoginPage enterUserID(String data) throws Exception {
		Thread.sleep(1000);
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	

	@And("Enter the password as {string}")
	public LoginPage enterPassword(String data) throws Exception {
		Thread.sleep(1000);
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin")
	public LoginPage selectAdmin() throws Exception {
		Thread.sleep(1000);
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	@And("Select User Type as Group")
	public LoginPage selectGroup() throws Exception {
		Thread.sleep(1000);
		clickWithNoSnap(locateElement(Locators.ID, "radio-01"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	@Then("Select the Privacy Policy checkbox")
	public LoginPage selectagreeCheck() throws Exception{
		Thread.sleep(1000);
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Agree to Selected successfully", "pass");
		return this;
	}

	@Then("click Login button")
	public HomePage clickLogin() throws Exception {
		Thread.sleep(1000);
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}



	@Then("Need to show error message1")
	public LoginPage Error_message1() throws Exception 
	{
		//waitForApperance(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible")); 
		Thread.sleep(5000);
		String ActualerrorMessage1 =	(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible").getText());
		System.out.println(ActualerrorMessage1);
		String ExpectedMessage1 = "Error! The fleet Id or email/user name or password you entered is incorrect";
		Thread.sleep(3000);
		Assert.assertEquals(ActualerrorMessage1, ExpectedMessage1, "Assertion for the incorrect fleetID is Unsuccessful");
		reportStep("Error message is asserted successfully", "pass");
		return this ;
	}

	@Then("Need to show error message2")
	public LoginPage Error_message2() throws Exception 
	{
		//waitForApperance(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible")); 
		Thread.sleep(2000);
		String ActualerrorMessage2 =	(locateElement(Locators.XPATH, "(//*[contains(@role,'alert')])[1]").getText());
		
		System.out.println(ActualerrorMessage2);
		String ExpectedMessage2 = "Error! The fleet Id or email/user name or password you entered is incorrect";
		Thread.sleep(7000);
		Assert.assertEquals(ActualerrorMessage2, ExpectedMessage2, "Assertion for the incorrect Username is Unsuccessful");
		reportStep("Error message is asserted successfully", "pass");
		return this ;
	}

	@Then("Need to show error message3")
	public LoginPage Error_message3() throws Exception 
	{
		//waitForApperance(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible")); 
		Thread.sleep(2000);
		String ActualerrorMessage3 =	(locateElement(Locators.XPATH, "(//*[contains(@class,'alert alert-danger alert-dismissible')])[1]").getText());
		System.out.println(ActualerrorMessage3);
		String ExpectedMessage3 = "Error! Please check your email address and password and try again";
		Thread.sleep(7000);
		Assert.assertEquals(ActualerrorMessage3, ExpectedMessage3, "Assertion for the incorrect Password is Unsuccessful");
		reportStep("Error message is asserted successfully", "pass");
		return this ;
	}
	
	@Then("Need to show error message4")
	public LoginPage Error_message4() throws Exception 
	{
		//waitForApperance(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible")); 
		Thread.sleep(2000);
		String ActualerrorMessage4 =	(locateElement(Locators.XPATH, "(//*[contains(@role,'alert')])[1]").getText());
		System.out.println(ActualerrorMessage4);
		String ExpectedMessage4 = "Error! The fleet Id or email/user name or password you entered is incorrect";
		Thread.sleep(7000);
		Assert.assertEquals(ActualerrorMessage4, ExpectedMessage4, "Assertion for the incorrect Usertype is Unsuccessful");
		reportStep("Error message is asserted successfully", "pass");
		return this ;
	}
	@Then("Need to show error message5")
	public LoginPage Error_message5() throws Exception 
	{
		//waitForApperance(locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible")); 
		Thread.sleep(1000);
		String ActualerrorMessage5 = (locateElement(Locators.CSS, ".signUpForm .errorMsg .alert-dismissible").getText());
		System.out.println(ActualerrorMessage5);
		String ExpectedMessage5 = "Please agree our policies to proceed";
		Thread.sleep(7000);
		Assert.assertEquals(ActualerrorMessage5, ExpectedMessage5, "Assertion for the Deselected checkbox is Unsuccessful");
		reportStep("Error message is asserted successfully", "pass");
		return this ;
	}
		
	@Then("Need to assert Bird eye view")
		public void need_to_assert_Bird_eye_view() throws Exception {
		Thread.sleep(3000);
		locateElement(Locators.XPATH, "(//a[@class='active'])[1]").isDisplayed();
		reportStep("Bird eye view is asserted successfully", "pass");
		return ;
	}
	
}
