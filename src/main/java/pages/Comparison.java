

package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SeleniumBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import design.Locators;
import testng.api.base.ProjectSpecificMethods;

public class Comparison extends ProjectSpecificMethods {

	
	
	private static final WebElement WebElement = null;


	@Given("Click Fleet User for comparison")
	public Comparison clickFleetuser() {
		click(locateElement(Locators.XPATH, "//*[@src='images/fleet-user.svg']"));
		reportStep("Fleet user is clicked successfully", "pass");
		return this;
	}

	@When("Enter Fleet ID for comparison as {string}")
	public Comparison enterfleetID(String data) {
		clearAndType(locateElement(Locators.ID, "fleetId"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Enter the Username for comparison as {string}")
	public Comparison enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}
	
	@And("Enter the password for comparison as {string}")
	public Comparison enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data + " entered successfully", "pass");
		return this;
	}

	@And("Select User Type as Admin for comparison")
	public Comparison selectAdmin() {
		clickWithNoSnap(locateElement(Locators.ID, "radio-00"));
		reportStep("Admin userType is Selected successfully", "pass");
		return this;
	}

	
	@Then("Select the Privacy Policy checkbox for comparison")
	public Comparison selectagreeCheck(){
		clickUsingJs(locateElement(Locators.ID, "agreeCheck"));
		reportStep(" Privacy Policy checkbox is selected successfully", "pass");
		return this;
	}

	
	@Then("click Login button for comparison")
	public HomePage PickclickLogin() {
		click(locateElement(Locators.CLASS_NAME, "loginBtn"));
		reportStep("click Login button is successfull", "pass");
		return new HomePage();
	}
	
	
				@Then("Click on the Analytics and comparison")
				public Comparison ClickAnalyticsComparison() throws Exception 
				{
					
					
					
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]"));
					
					click(locateElement(Locators.XPATH, "(//*[contains(@data-placement,'bottom')])[1]")); 
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'reports')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'reports')]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'CardLightBlue')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'CardLightBlue')])[3]"));
					
					reportStep("Click on the Analytics and comparison is successful", "pass");
					return this;
				}
				
				@Then("Assertion of select maximum upto twenty vehicles for the comparison report") 
				public Comparison ClickAssertionSelectMaximum() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'comparison report')]"));
					
				    sum.verifyDisplayed(locateElement(Locators.XPATH, "//*[contains(@alt,'comparison report')]"));
				    
				    System.out.println("select maximum upto twenty vehicles for the comparison report is displayed");
					
					reportStep("Assertion of select maximum upto twenty vehicles for the comparison report is successful", "pass");
					return this;
				}
				@Then("Click the filter and select all the vehicles except SADEMO6 and apply") 
				public Comparison ClickFilterExceptSADEMO6() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'vehicleList checkBoxContainer headercheckbox CheckSubPackComparison')])[1]")); 
					List<WebElement> xyz= locateElements(Locators.XPATH, "//*[contains(@class,'vehicleList checkBoxContainer headercheckbox CheckSubPackComparison')]");
				    
					for(int i=0;i<xyz.size();i++)
					{
					if(i!=7) 
					{
						WebElement q= xyz.get(i);
					
						click(q);
						}
			
						 
					}
					
				
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'yes-btn')])[1]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'yes-btn')])[1]")); 
					reportStep("Click the filter and select all the vehicles except SADEMO6 and apply is successful", "pass");
					return this;
				}
			
				
				@Then("Assertion for the Key Performance Indicators with selected vehicles") 
				public Comparison ClickKeyPerformance() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'col-md-12')])[1]"));
					
				    sum.verifyDisplayed(locateElement(Locators.XPATH, "(//*[contains(@class,'col-md-12')])[1]"));
				    
				    System.out.println("Key Performance Indicators with selected vehicles is displayed");
					
					reportStep("Assertion for the Key Performance Indicators with selected vehicles is successful", "pass"); 
					return this;
				}
				
				@Then("Assertion for the comparison report with selected vehicles") 
				public Comparison Clickcomparisonreport() throws Exception 
				{
					SeleniumBase sum= new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'selFilterTxt')]"));
					
				    sum.verifyDisplayed(locateElement(Locators.XPATH, "//*[contains(@class,'selFilterTxt')]"));
				    
				    System.out.println("comparison report with selected vehicles is displayed");
				    
				   			    
				    
					reportStep("Assertion for the comparison report with selected vehicles is successful", "pass");
					return this; 
				}
				
				@Then("Screenshot of the first graph which is shown below the comparison report") 
				public Comparison FirstGraphComparisonreport() throws Exception 
				{
							    
				    JavascriptExecutor js = (JavascriptExecutor) getDriver();  
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,600)");
				    
				    reportStep("Screenshot of the first graph which is shown below the comparison report is successful", "pass"); 
					return this; 
				}
				
				
				
				
				
				
				@Then("Screenshot of the second graph which is shown below the comparison report") 
				public Comparison SecondGraphComparisonreport() throws Exception 
				{
							    
				    JavascriptExecutor js = (JavascriptExecutor) getDriver();  
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,300)");
				    
				    reportStep("Screenshot of the second graph which is shown below the comparison report is successful", "pass"); 
					return this; 
				}
				
				@Then("Screenshot of the third graph which is shown below the comparison report")  
				public Comparison ThirdGraphComparisonreport() throws Exception 
				{
							    
				    JavascriptExecutor js = (JavascriptExecutor) getDriver();  
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,700)");
				    
				    reportStep("Screenshot of the third graph which is shown below the comparison report is successful", "pass");
					return this; 
				}
				@Then("Click on the Trip reports and Screenshot of first graph which is shown below the Trip reports")  
				public Comparison TripreportFirstGraph() throws Exception 
				{
					 Thread.sleep(5000);	
					 
					 JavascriptExecutor js = (JavascriptExecutor) getDriver();  
					    Thread.sleep(5000); 
					    js.executeScript("window.scrollBy(0,-1200)");
					
					click(locateElement(Locators.XPATH, "//*[contains(@data-name,'TRIPREPORT')]"));
					
				    JavascriptExecutor jse = (JavascriptExecutor) getDriver();  
				    Thread.sleep(5000);
				    jse.executeScript("window.scrollBy(0,300)");
				    
				    reportStep("Click on the Trip reports and Screenshot of first graph which is shown below the Trip reports is successful", "pass");
					return this; 
				}
				
			@Then("Screenshot of second graph which is shown below the Trip reports")  
				public Comparison TripreportSecondGraph() throws Exception 
				{
						
					
					
				    JavascriptExecutor js = (JavascriptExecutor) getDriver();  
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,900)");
				    
				    reportStep("Screenshot of second graph which is shown below the Trip reports is successful", "pass");
					return this; 
				}
			@Then("Click on the Analytics report and export files for the default date range")  
			public Comparison AnalyticsReportExport() throws Exception 
			{
				
				 Thread.sleep(5000);	
				 
				 JavascriptExecutor js = (JavascriptExecutor) getDriver();  
				 Thread.sleep(5000); 
				 js.executeScript("window.scrollBy(0,-1200)");
				 SeleniumBase sum= new SeleniumBase();
				 sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@data-name,'ANALYTIC')]"));
				
				 click(locateElement(Locators.XPATH, "//*[contains(@data-name,'ANALYTIC')]"));
				 sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_pdf')]"));
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads')]"));
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@data-translate,'_page_reports_btn_export_as_xls')]"));
				
			    
			    reportStep("Click on the Analytics report and export files for the default date range is successful", "pass");
				return this; 
			}
			
			@Then("Select the last month")  
			public Comparison ScreenshotGraphsLastMonth() throws Exception 
			{
					
				SeleniumBase sum= new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'comparison-date-icon-img')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@class,'comparison-date-icon-img')]"));
				
				sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last')])[6]"));
				click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Last')])[6]"));
				
			    JavascriptExecutor js = (JavascriptExecutor) getDriver();  
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,200)");
			     
			    
			    
			    reportStep("Select the last month is successful", "pass");
				return this; 
			}
			@Then("Screenshot of the second graph under last month")  
			public Comparison ScreenshotsecondGraphsLastMonth() throws Exception 
			{
					
				
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,400)"); 
			    
			    
			    reportStep("screenshot of the second graph under last month is successful", "pass");
				return this; 
			}
			@Then("Screenshot of the third graph under last month")  
			public Comparison ScreenshotThirddGraphsLastMonth() throws Exception 
			{
					
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,600)"); 
			    
			    reportStep("screenshot of the third graph under last month is successful", "pass");
				return this; 
			}	
			
			
			
			
			@Then("Click on the Trip reports and Screenshot of the first graph under last month")  
			public Comparison ScreenshotLastMonth() throws Exception 
			{
				
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,-1000)"); 
				SeleniumBase sum= new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@data-name,'TRIPREPORT')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@data-name,'TRIPREPORT')]")); 
				JavascriptExecutor jse = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    jse.executeScript("window.scrollBy(0,100)"); 
			    
			    reportStep("Click on the Trip reports and Screenshot of the first graph under last month is successful", "pass");
				return this; 
			}	
			
			@Then("Take screenshot of the second graph under last month")  
			public Comparison Screenshot2ndGraph() throws Exception 
			{
					
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,600)"); 
			    
			    reportStep("Screenshot of the second graph under last month is successful", "pass");
				return this; 
			}	
				
			@Then("click on the back and highlights")  
			public Comparison ClickBackHighlights() throws Exception 
			{
					
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,-1000)"); 
			    SeleniumBase sum= new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'backArrowBtn')])[3]"));
				click(locateElement(Locators.XPATH, "(//*[contains(@class,'backArrowBtn')])[3]"));
				JavascriptExecutor jse = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    jse.executeScript("window.scrollBy(0,500)"); 
			    
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@src,'images/reports/SVG/Highlights.svg')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@src,'images/reports/SVG/Highlights.svg')]"));
			    reportStep("click on the back and highlights is successful", "pass");
				return this; 
			}
			
			@Then("Assertion for the Select atleast one vehicle to proceed and click ok button")  
			public Comparison AssertSelectAtleastOneVehicle() throws Exception 
			{
					
				
			    SeleniumBase sum= new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'infoPopContent')])[4]"));
			locateElement(Locators.XPATH, "(//*[contains(@class,'infoPopContent')])[4]").isDisplayed();
			System.out.println("Select atleast one vehicle to proceed is asserted successfully");
			
			sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'ok-btn')])[5]"));
			click(locateElement(Locators.XPATH, "(//*[contains(@class,'ok-btn')])[5]"));
			reportStep("Assertion for the Select atleast one vehicle to proceed is successful", "pass");
			return this; 
			}
			@Then("Click on the filter and SADEMO5 and apply")  
			public Comparison FilterSADEMO5Apply() throws Exception 
			{
					
				
				SeleniumBase sum = new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@class,'headerFilterIcon')]"));

				sum.waitForApperance(locateElement(Locators.XPATH,"(//*[contains(@class,'vehicleList checkBoxContainer headercheckbox')])[7]"));
				click(locateElement(Locators.XPATH,"(//*[contains(@class,'vehicleList checkBoxContainer headercheckbox')])[7]"));
				
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'yes-btn show-btn')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@class,'yes-btn show-btn')]"));

			reportStep("Click on the filter and SADEMO5 and apply is successful", "pass");
			return this; 
			}
			
			@Then("Take first screenshot under Highlights for SAdemo5")  
			public Comparison FirstScreenshotHighlightsSADEMO5() throws Exception 
			{
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,100)"); 
			
			reportStep("Take first screenshot under Highlights for SAdemo5 is successful", "pass");
			return this; 
			}
			
			@Then("Take second screenshot under Highlights for SAdemo5")  
			public Comparison SecondScreenshotHighlightsSADEMO5() throws Exception 
			{
				JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,600)"); 
			
			reportStep("Take second screenshot under Highlights for SAdemo5 is successful", "pass");
			return this; 
			}
			
			@Then("Take third screenshot under Highlights for SAdemo5")  
			public Comparison ThirdScreenshotHighlightsSADEMO5() throws Exception 
			{
				JavascriptExecutor js = (JavascriptExecutor) getDriver();  
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,500)"); 
			
			reportStep("Take third screenshot under Highlights for SAdemo5 is successful", "pass");
			return this; 
			}
			
			
			@Then("Export the files for the default date range")  
			public Comparison ExportDefault() throws Exception 
			{
				JavascriptExecutor js = (JavascriptExecutor) getDriver();  
			    Thread.sleep(5000);
			    js.executeScript("window.scrollBy(0,-900)"); 
			    
			    SeleniumBase sum = new SeleniumBase();
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads button')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads button')]"));

				sum.waitForApperance(locateElement(Locators.XPATH,"//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
				click(locateElement(Locators.XPATH,"//*[contains(@data-translate,'_page_reports_btn_export_image')]"));
				
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads button')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@alt,'Downloads button')]"));
				
				sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@alt,'IMAGE')]"));
				click(locateElement(Locators.XPATH, "//*[contains(@alt,'IMAGE')]"));

				sum.waitForApperance(locateElement(Locators.XPATH,"//*[contains(@alt,'Downloads button')]"));
				click(locateElement(Locators.XPATH,"//*[contains(@alt,'Downloads button')]"));
				
				sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'normalExport')])[3]"));
				click(locateElement(Locators.XPATH, "(//*[contains(@class,'normalExport')])[3]"));
			
			reportStep("Export the files for the default date range is successful", "pass");
			return this; 
			}
			
			 
			 @Then("Click on the custom and select August month completely and apply")  
				public Comparison CustomSelect() throws Exception 
				{
					
				    
				    SeleniumBase sum = new SeleniumBase();
					sum.waitForApperance(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));
					click(locateElement(Locators.XPATH, "//*[contains(@class,'date-icon-img')]"));

					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Custom')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@data-range-key,'Custom')])[3]"));
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'fa fa-chevron-left glyphicon glyphicon-chevron-left')])[3]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c1')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r0c1')])[3]"));
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c3')])[3]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@data-title,'r4c3')])[3]"));
					
					
					
					sum.waitForApperance(locateElement(Locators.XPATH, "(//*[contains(@class,'applyBtn btn btn-sm btn-success')])[5]"));
					click(locateElement(Locators.XPATH, "(//*[contains(@class,'applyBtn btn btn-sm btn-success')])[5]"));
					
				
				reportStep("Click on the custom and select August month completely and apply is successful", "pass");
				return this; 
				}
			 
			 
			 
			 @Then("Take the first graph screenshot of Highlights for SAdemo5 under August month")  
				public Comparison FirstGraphScreenshotHighlights() throws Exception 
				{
					JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,300)"); 
				
				reportStep("Take the first graph screenshot of Highlights for SAdemo5 under August month is successful", "pass");
				return this; 
				}
			 
			 
			 @Then("Take the second graph screenshot of Highlights for SAdemo5 under August month")  
				public Comparison SecondGraphScreenshotHighlights() throws Exception 
				{
					JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,300)"); 
				
				reportStep("Take the second graph screenshot of Highlights for SAdemo5 under August month is successful", "pass");
				return this; 
				}
			
			 @Then("Take the third graph screenshot of Highlights for SAdemo5 under August month")  
				public Comparison ThirdGraphScreenshotHighlights() throws Exception 
				{
					JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
				    Thread.sleep(5000);
				    js.executeScript("window.scrollBy(0,600)"); 
				
				reportStep("Take the third graph screenshot of Highlights for SAdemo5 under August month is successful", "pass");
				return this; 
				}
			 
			  
			 
			 
			 
					} 

