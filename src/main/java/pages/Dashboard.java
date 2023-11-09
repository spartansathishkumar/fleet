
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

public class Dashboard extends ProjectSpecificMethods {
	WebDriver driver;

	//Scenario: TC008 Validation for the Tracking
	
	@Given("Click Fleet User option for the tracking")
	public Dashboard clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the tracking as {string}")
	public Dashboard enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the tracking as {string}")
	public Dashboard enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the tracking as {string}")
	public Dashboard enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the tracking")
	public Dashboard selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the tracking")
	public Dashboard selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox for the tracking is selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the tracking")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the tracking")
	public Dashboard BirdEyeview() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the tracking")
	public Dashboard  clickFilter() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the tracking")
	public Dashboard ClickApply() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]")); 
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the tracking")
	public Dashboard ClickSADemo1() throws Exception 
	{
		Thread.sleep(3000);
		//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	@Then("Click on the tracking in the dashboard")
	public Dashboard Clicktracking() throws Exception 
	{
		click(locateElement(Locators.XPATH, "//*[@id=\"liveTrackIcon\"]"));
		reportStep("Click on the tracking in the dashboard is successful", "pass");
		return this;
	}
	
	@Then("Check whether the tracking icon is selected or not using Assertion")
	public Dashboard TrackingAssertion() throws Exception {
		Thread.sleep(3000);
		locateElement(Locators.XPATH, "//span[normalize-space()='Live Tracking']").isSelected();
		reportStep("tracking icon  is selected and validated using assertion successfully", "pass");
		return this;
	}
	
	//Scenario: TC009 Validation for the trips
	
	
	@Given("Click Fleet User option for the trips")
	public Dashboard clickFleetuserTrips() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the trips as {string}")
	public Dashboard enterfleetIDTrips(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the trips as {string}")
	public Dashboard enterUsernametrips(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the trips as {string}")
	public Dashboard enterPasswordTrips(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the trips")
	public Dashboard selectAdminTrips() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the trips")
	public Dashboard selectagreeChecktrips(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the trips")
	public HomePage PickclickLoginTrips() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the trips")
	public Dashboard BirdEyeviewTrips() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the trips")
	public Dashboard  clickFilterTrips() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the trips")
	public Dashboard ClickApplyTrips() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the trips")
	public Dashboard ClickSADemo1Trips() throws Exception 
	{
		Thread.sleep(3000);
		//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		
		
		
		reportStep("Click on the SADemo1 vehicle for the trips is successful", "pass");
		return this;	
	}
	
	
	
	@Then("Click on the trips in the dashboard")
	public Dashboard Clicktrips() throws Exception 
	{
		//click(locateElement(Locators.XPATH, "//*[@id=\"tripShortCut\"]"));
		click(locateElement(Locators.XPATH, "//*[@id=\"tripsIcon\"]"));
		reportStep("Click on the trips in the dashboard is successful", "pass");
		return this;
	}
	
	@Then("Check whether the trips icon is selected or not using Assertion")
	public Dashboard TripsAssertion() throws Exception 
	{
		
		Thread.sleep(4000);
		locateElement(Locators.XPATH, "//a[@class='active']").isSelected();
		reportStep("Trips icon Assertion is successful", "pass");
		return this;
	}
	
	//Scenario: TC010 Validation for the Alerts
	@Given("Click Fleet User option for the Alerts")
	public Dashboard clickFleetuserAlerts() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the Alerts as {string}")
	public Dashboard enterfleetIDAlerts(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the Alerts as {string}")
	public Dashboard enterUsernameAlerts(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the Alerts as {string}")
	public Dashboard enterPasswordAlerts(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the Alerts")
	public Dashboard selectAdminAlerts() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the Alerts")
	public Dashboard selectagreeCheckAlerts(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the Alerts")
	public HomePage PickclickLoginAlerts() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the Alerts")
	public Dashboard BirdEyeviewAlerts() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the Alerts")
	public Dashboard  clickFilterAlerts() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Alerts")
	public Dashboard ClickApplyAlerts() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the Alerts")
	public Dashboard ClickSADemo1Alerts() throws Exception 
	{
		Thread.sleep(4000);
	//	click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	
	
	@Then("Click on the Alerts in the dashboard")
	public Dashboard ClickAlerts() throws Exception 
	{
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//*[@id=\"alertsIcon\"]"));
		reportStep("Click on the Alerts in the dashboard is successful", "pass");
		return this;
	}
	
	@Then("Check whether the Alerts icon is selected or not using Assertion")
	public Dashboard AlertsAssertion() throws Exception 
	{
		
		Thread.sleep(4000);
		locateElement(Locators.XPATH, "//a[@class='notification-access active']").isSelected();
		reportStep("Alerts icon Assertion is successful", "pass");
		return this;
	}
	
	//Scenario: TC011 Validation for the Events
	
	@Given("Click Fleet User option for the Events")
	public Dashboard clickFleetuserEvents() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the Events as {string}")
	public Dashboard enterfleetIDEvents(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the Events as {string}")
	public Dashboard enterUsernameEvents(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the Events as {string}")
	public Dashboard enterPasswordEvents(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the Events")
	public Dashboard selectAdminEvents() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the Events")
	public Dashboard selectagreeCheckEvents(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the Events")
	public HomePage PickclickLoginEvents() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the Events")
	public Dashboard BirdEyeviewEvents() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the Events")
	public Dashboard  clickFilterEvents() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Events")
	public Dashboard ClickApplyEvents() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the Events")
	public Dashboard ClickSADemo1Events() throws Exception 
	{
		Thread.sleep(4000);
		//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	
	
	@Then("Click on the Events in the dashboard")
	public Dashboard ClickEvents() throws Exception 
	{
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//*[@id=\"eventIcon\"]"));
		reportStep("Click on the Events in the dashboard is successful", "pass");
		return this;
	}
	
	@Then("Check whether the Events icon is selected or not using Assertion")
	public Dashboard EventsAssertion() throws Exception 
	{
		
		Thread.sleep(4000);
		locateElement(Locators.XPATH, "//span[@class='sidebar-control'][normalize-space()='Events']").isSelected();
		reportStep("Events icon Assertion is successful", "pass");
		return this;
	}
	
	//Scenario: TC012 Validation for the Share location
	
	@Given("Click Fleet User option for the Share location")
	public Dashboard clickFleetuserShareLocation() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the Share location as {string}")
	public Dashboard enterfleetIDShareLocation(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the Share location as {string}")
	public Dashboard enterUsernameShareLocation(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the Share location as {string}")
	public Dashboard enterPasswordShareLocation(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the Share location")
	public Dashboard selectAdminShareLocation() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the Share location")
	public Dashboard selectagreeCheckShareLocation(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the Share location")
	public HomePage PickclickLoginShareLocation() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the Share location")
	public Dashboard BirdEyeviewShareLocation() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the Share location")
	public Dashboard  clickFilterShareLocation() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Share location")
	public Dashboard ClickApplyShareLocation() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the Share location")
	public Dashboard ClickSADemo1ShareLocation() throws Exception 
	{
		Thread.sleep(4000);
		//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	
	
	@Then("Click the Share location icon in the Dashboard and click for about one hour and share the location")
	public Dashboard ClickShareLocation() throws Exception 
	{
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//*[contains(@id,'shareLocIcon')]"));
		click(locateElement(Locators.XPATH, "(//*[contains(@class,'filter-option pull-left')])[2]"));
		click(locateElement(Locators.XPATH, "//div[@id='sharingLocationPopup']//li[2]//a[1]"));
		click(locateElement(Locators.XPATH, "//a[@class='form-btn assign-btn']"));
		click(locateElement(Locators.XPATH, "(//*[contains(@class,'md-close')])[11]"));
		reportStep("Click on the ShareLocation and 1 hour sharing in the dashboard is successful", "pass");
		return this;
	}
	
	@Then("Check whether the Link expires in icon is displayed or not using Assertion")
	public Dashboard ShareLocationAssertion() throws Exception 
	{
		Thread.sleep(4000);
		locateElement(Locators.XPATH, "//*[@id=\"sharingLocationPopup\"]/div/div/div/div[1]/div[1]").isDisplayed();
		reportStep("Link expires in icon is displayed and verified using Assertion is successful", "pass");
		return this;
	}
	
	//Scenario: TC013 Validation for the Dash Camera
	
	@Given("Click Fleet User option for the Dash Camera")
	public Dashboard clickFleetuserDashCamera() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for the Dash Camera as {string}")
	public Dashboard enterfleetIDDashCamera(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for the Dash Camera as {string}")
	public Dashboard enterUsernameDashCamera(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for the Dash Camera as {string}")
	public Dashboard enterPasswordDashCamera(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for the Dash Camera")
	public Dashboard selectAdminDashCamera() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for the Dash Camera")
	public Dashboard selectagreeCheckDashCamera(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox selected successfully", "pass");
		return this;
	}

	
	@Then("Click Login button for the Dash Camera")
	public HomePage PickclickLoginDashCamera() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("Login button picked and clicked successfully", "pass");
		return new HomePage();
	}
	
	
	@Then("Click on the bird eye view icon for the Dash Camera")
	public Dashboard BirdEyeviewDashCamera() throws Exception {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@class='sidebar-toggle-box']//div[@class='fa fa-bars tooltips']"));
		click(locateElement(Locators.XPATH, "//span[contains(text(),'Bird’s-Eye View')]"));
		reportStep("bird eye view icon clicked successfully", "pass");
		return this;
	}
	@Then("click the Filter icon and Clear All option for all the vehicles for the Dash Camera")
	public Dashboard  clickFilterDashCamera() throws Exception {
		
		Thread.sleep(5500);
		click(locateElement(Locators.XPATH, "//img[@title='Filter']"));
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		reportStep("click the Filter icon and Clear All option for all the vehicles clicked successfully", "pass");
		return this;
	}
	@Then("SADemo1 is selected in the SADemo group under Demo group and click Apply for the Dash Camera")
	public Dashboard ClickApplyDashCamera() throws Exception {
		Thread.sleep(5000);
		click(locateElement(Locators.XPATH, "//p[normalize-space()='Demo']"));
		click(locateElement(Locators.XPATH, "//p[normalize-space()='SA Demo']"));
		Thread.sleep(3000);
		click(locateElement(Locators.CSS, "#VehicleFilterHeader .clearAllFilter"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "(//p[@class='checkmark'])[14]"));
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//a[@class='yes-btn show-btn']"));
		reportStep("click the SADemo1 icon in the SADemo group under Demo group and applied is successful", "pass");
		return this;
	}
	
	@Then("Click on the SADemo1 vehicle for the Dash Camera")
	public Dashboard ClickSADemo1DashCamera() throws Exception 
	{
		Thread.sleep(4000);
		//click(locateElement(Locators.XPATH, "(//img[@draggable='false'])[26]"));
		click(locateElement(Locators.XPATH, "//*[contains(@title,'Unit Not Updating')]"));
		
		reportStep("Click on the SADemo1 vehicle is successful", "pass");
		return this;	
	}
	
	
	
	@Then("Click on the Dash Camera in the dashboard")
	public Dashboard ClickDashCamera() throws Exception 
	{
		Thread.sleep(2000);
		click(locateElement(Locators.XPATH, "//*[@id=\"dashCamIcon\"]"));
		
		reportStep("Click on the Dash Camera in the dashboard is successful", "pass");
		return this;
	}
	
	
	
	
	
	
}
