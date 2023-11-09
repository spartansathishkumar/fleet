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

public class Vehicle_type extends ProjectSpecificMethods {
	WebDriver driver;
	
	//Scenario: TC024 Validation for the vehicle type as sedan
	
	@Given("Click Fleet User option for the vehicle type")
	public Vehicle_type clickFleetuserVehiclestatus() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the vehicle type as {string}")
	public Vehicle_type enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the vehicle type as {string}")
	public Vehicle_type enterUserID(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the password for the vehicle type as {string}")
	public Vehicle_type enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the vehicle type")
	public Vehicle_type selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("UserType Selected successfully", "pass");
		return this;
	}

	@Then("Select the Privacy Policy checkbox for the vehicle type")
	public Vehicle_type selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Agree to Selected successfully", "pass");
		return this;
	}

	@Then("Click Login button for the vehicle type")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}


	@Then("Click on the bird eye view icon for the vehicle type")
	public Vehicle_type BirdEyeview() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and select Demo group under the All subgroups and choose SAdemo group and apply under vehicle type")
	public Vehicle_type  clickFilter1() throws Exception {
		Thread.sleep(9500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.XPATH, "(//input[@type='radio'])[4]"));
		click(locateElement(Locators.XPATH, "(//input[@type='radio'])[12]"));
		Thread.sleep(1000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader > div.footer-search-device > div > a.yes-btn.show-btn"));
		reportStep("SA group is clicked and applied successfully", "pass");
		return this;
	}

	@Then("Click on the All types and vehicle type as sedan")
	public Vehicle_type ClickSedan() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Sedan']"));
		
		reportStep("Sedan vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as sedan")
	public Vehicle_type  countSedan() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Sedan  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Sedan.size();
		System.out.println("The number of Sedan vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Sedan vehicles are counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC025 Validation for the vehicle type as convertible
	@Then("Click on the All types and vehicle type as convertible")
	public Vehicle_type Clickconvertible() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Convertible']"));
		
		reportStep("Convertible vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as convertible")
	public Vehicle_type  countconvertible() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Sedan  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Sedan.size();
		System.out.println("The number of convertible vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of convertible vehicles are counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC026 Validation for the vehicle type as Hatchback
	@Then("Click on the All types and vehicle type as Hatchback")
	public Vehicle_type ClickHatchback() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Hatchback']"));
		
		reportStep("Hatchback vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Hatchback")
	public Vehicle_type  countHatchback() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Hatchback  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Hatchback.size();
		System.out.println("The number of Hatchback vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Hatchback vehicles are counted successfully", "pass");
		return this;
	}
	
	
	//Scenario: TC027 Validation for the vehicle type as SUV
	@Then("Click on the All types and vehicle type as SUV")
	public Vehicle_type ClickSUV() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='SUV']"));
		
		reportStep("SUV vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as SUV")
	public Vehicle_type  countSUV() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  SUV  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =SUV.size();
		System.out.println("The number of SUV vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of SUV vehicles are counted successfully", "pass");
		return this;
	}
	//Scenario: TC028 Validation for the vehicle type as MUV
	@Then("Click on the All types and vehicle type as MUV")
	public Vehicle_type ClickMUV() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='MUV']"));
		
		reportStep("MUV vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as MUV")
	public Vehicle_type  countMUV() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  MUV  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =MUV.size();
		System.out.println("The number of MUV vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of MUV vehicles are counted successfully", "pass");
		return this;
	}
	
	// Scenario: TC029 Validation for the vehicle type as Luxury
	@Then("Click on the All types and vehicle type as Luxury")
	public Vehicle_type ClickLuxury() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Luxury']"));
		
		reportStep("Luxury vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Luxury")
	public Vehicle_type  countLuxury() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Luxury  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Luxury.size();
		System.out.println("The number of Luxury vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Luxury vehicles are counted successfully", "pass");
		return this;
	}
	
	// Scenario: TC030 Validation for the vehicle type as Truck
	@Then("Click on the All types and vehicle type as Truck")
	public Vehicle_type ClickTruck() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Truck']"));
		
		reportStep("Truck vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Truck")
	public Vehicle_type  countTruck() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Truck  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Truck.size();
		System.out.println("The number of Truck vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Truck vehicles are counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC031 Validation for the vehicle type as Van
	@Then("Click on the All types and vehicle type as Van")
	public Vehicle_type ClickVan() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Van']"));
		
		reportStep("Van vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Van")
	public Vehicle_type  countVan() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Van  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Van.size();
		System.out.println("The number of Van vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Van vehicles are counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC032 Validation for the vehicle type as Bakkie
	@Then("Click on the All types and vehicle type as Bakkie")
	public Vehicle_type ClickBakkie() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='Bakkie/Pickup']"));
		
		reportStep("Bakkie vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Bakkie")
	public Vehicle_type  countBakkie() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Bakkie  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Bakkie.size();
		System.out.println("The number of Bakkie vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Bakkie vehicles are counted successfully", "pass");
		return this;
	}
	
	//Scenario: TC033 Validation for the vehicle type as Motorcycle
	@Then("Click on the All types and vehicle type as Motorcycle")
	public Vehicle_type ClickMotorcycle() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//span[@class='custom-select-trigger-nw']//i[@class='fa fa-caret-down']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Vehicle Type']"));
		
		
		click(locateElement(Locators.XPATH, "//span[normalize-space()='MotorCycle']"));
		
		reportStep("Motorcycle vehicle is clicked successfully", "pass");
		return this; 
	}


	@Then("click on the filter to know the number of vehicles type as Motorcycle")
	public Vehicle_type  countMotorcycle() throws Exception {
		Thread.sleep(8000);		
		click(locateElement(Locators.XPATH, "//img[@class='headerFilterIcon']"));
		
		List<WebElement>  Motorcycle  = 	getDriver().findElements(By.xpath("//Li[@class='vehicleList checkBoxContainer headercheckbox']")); 
		int i =Motorcycle.size();
		System.out.println("The number of Motorcycle vehicles are ="+ i);
		click(locateElement(Locators.XPATH, "//*[contains(@class,'no-btn')]"));
		reportStep("The number of Motorcycle vehicles are counted successfully", "pass");
		return this;
	}
	
}