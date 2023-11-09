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

public class Vehicle_status extends ProjectSpecificMethods {
	WebDriver driver;
	
	//Scenario: TC014 Validation for the vehicle status for parking less than Ten minutes
	
	@Given("Click Fleet User option for the vehicle status")
	public Vehicle_status clickFleetuserVehiclestatus() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the vehicle status as {string}")
	public Vehicle_status enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the vehicle status as {string}")
	public Vehicle_status enterUserID(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the password for the vehicle status as {string}")
	public Vehicle_status enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the vehicle status")
	public Vehicle_status selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	@Then("Select the Privacy Policy checkbox for the vehicle status")
	public Vehicle_status selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Agree to Selected successfully", "pass");
		return this;
	}

	@Then("Click Login button for the vehicle status")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}


	@Then("Click on the bird eye view icon for the vehicle status")
	public Vehicle_status BirdEyeview() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and select Demo group under the All subgroups and choose SAdemo group and apply")
	public Vehicle_status  clickFilter1() throws Exception {
		Thread.sleep(9500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.XPATH, "(//input[@type='radio'])[4]"));
		click(locateElement(Locators.XPATH, "(//input[@type='radio'])[12]"));
		Thread.sleep(1000);
		//click(locateElement(Locators.CSS, "#VehicleFilterHeader > div.footer-search-device > div > a.yes-btn.show-btn"));
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		//click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']\\"));
		
		reportStep("SA group is clicked and applied successfully", "pass");
		return this;
	}

	@Then("Click on the Driving status and vehicle status for parking less than Ten minutes")
	public Vehicle_status ClickDrivingstatus() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='< 10 Mins']"));
		reportStep("Parked less than 10 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for lesser than Ten minutes")
	public Vehicle_status  clickParked() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountLeeserthan10minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountLeeserthan10minutes.size();
		System.out.println("The lesser than 10 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		
		reportStep("Number of vehicles parked for lesser than 10 minutes is counted successfully", "pass");
		return this;
	}
	//Scenario: TC015 Validation for the vehicle status for parking less than Twenty minutes  
	
	@Then("Click on the Driving status and vehicle status for parking less than Twenty minutes")
	public Vehicle_status ClickDrivingstatusLessthan20min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='< 20 Mins']"));
		reportStep("Parked less than 20 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for lesser than Twenty minutes")
	public Vehicle_status  clickParkedLessthan20min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountLeeserthan20minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountLeeserthan20minutes.size();
		System.out.println("The lesser than 20 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for lesser than 20 minutes is counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC016 Validation for the vehicle status for parking less than Thirty minutes 

	@Then("Click on the Driving status and vehicle status for parking less than Thirty minutes")
	public Vehicle_status ClickDrivingstatusLessthan30min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='< 30 Mins']"));
		reportStep("Parked less than 30 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for lesser than Thirty minutes")
	public Vehicle_status  clickParkedLessthan30minutes() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountLeeserthan30minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountLeeserthan30minutes.size();
		System.out.println("The lesser than 30 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for lesser than 30 minutes is counted successfully", "pass");
		return this;
	}


// Scenario: TC017 Validation for the vehicle status for parking less than Fourty minutes
	
	@Then("Click on the Driving status and vehicle status for parking less than Fourty minutes")
	public Vehicle_status ClickDrivingstatusLessthan40min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='< 40 Mins']"));
		reportStep("Parked less than 40 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for lesser than Fourty minutes")
	public Vehicle_status  clickParkedLessthan40min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountLeeserthan40minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountLeeserthan40minutes.size();
		System.out.println("The lesser than 40 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for lesser than 40 minutes is counted successfully", "pass");
		return this;
	}
	
		
	//  Scenario: TC018 Validation for the vehicle status for parking less than Sixty minutes 

	@Then("Click on the Driving status and vehicle status for parking less than Sixty minutes")
	public Vehicle_status ClickDrivingstatusLessthan60min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='< 60 Mins']"));
		reportStep("Parked less than 60 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for lesser than Sixty minutes")
	public Vehicle_status  clickParkedLessthan60min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountLesserthan60minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountLesserthan60minutes.size();
		System.out.println("The lesser than 60 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for lesser than 60 minutes is counted successfully", "pass");
		return this;
	}
	
// Scenario: TC019 Validation for the vehicle status for parking greater than Ten minutes

	@Then("Click on the Driving status and vehicle status for parking greater than Ten minutes")
	public Vehicle_status ClickDrivingstatusgreaterthan10min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='> 10 Mins']"));
		reportStep("Parked greater than 10 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for greater than Ten minutes")
	public Vehicle_status  clickParkedgreaterthan10min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountgreaterthan10minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountgreaterthan10minutes.size();
		System.out.println("The greater than 10 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for greater than 10 minutes is counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC020 Validation for the vehicle status for parking greater than Twenty minutes
	@Then("Click on the Driving status and vehicle status for parking greater than Twenty minutes")
	public Vehicle_status ClickDrivingstatusgreaterthan20min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='> 20 Mins']"));
		reportStep("Parked greater than 20 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for greater than Twenty minutes")
	public Vehicle_status  clickParkedgreaterthan20min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountgreaterthan20minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountgreaterthan20minutes.size();
		System.out.println("The greater than 20 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for greater than 20 minutes is counted successfully", "pass");
		return this;
	}
	//Scenario: TC021 Validation for the vehicle status for parking greater than Thirty minutes
	@Then("Click on the Driving status and vehicle status for parking greater than Thirty minutes")
	public Vehicle_status ClickDrivingstatusgreaterthan30min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='> 30 Mins']"));
		reportStep("Parked greater than 30 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for greater than Thirty minutes")
	public Vehicle_status  clickParkedgreaterthan30min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountgreaterthan30minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountgreaterthan30minutes.size();
		System.out.println("The greater than 30 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for greater than 30 minutes is counted successfully", "pass");
		return this;
	}
	//Scenario: TC022 Validation for the vehicle status for parking greater than Fourty minutes
	@Then("Click on the Driving status and vehicle status for parking greater than Fourty minutes")
	public Vehicle_status ClickDrivingstatusgreaterthan40min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='> 40 Mins']"));
		reportStep("Parked greater than 40 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for greater than Fourty minutes")
	public Vehicle_status  clickParkedgreaterthan40min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountgreaterthan40minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountgreaterthan40minutes.size();
		System.out.println("The greater than 40 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for greater than 40 minutes is counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC023 Validation for the vehicle status for parking greater than Sixty minutes
	@Then("Click on the Driving status and vehicle status for parking greater than Sixty minutes")
	public Vehicle_status ClickDrivingstatusgreaterthan60min() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//*[@id=\"main-content\"]/section/div[2]/div[1]/div/span/i"));
		click(locateElement(Locators.XPATH, "//*[@id=\"vehicleStatRadio\"]/ul/li[1]/p"));
		
		
		click(locateElement(Locators.XPATH, "//span[@id='parkedStateSec']"));
		click(locateElement(Locators.XPATH, "//span[normalize-space()='> 60 Mins']"));
		reportStep("Parked greater than 60 minutes is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles parked for greater than Sixty minutes")
	public Vehicle_status  clickParkedgreaterthan60min() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  vehiclescountgreaterthan60minutes= 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =vehiclescountgreaterthan60minutes.size();
		System.out.println("The greater than 60 min vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("Number of vehicles parked for greater than 60 minutes is counted successfully", "pass");
		return this;
	}















}