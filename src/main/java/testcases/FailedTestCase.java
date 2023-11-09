
package testcases;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import testng.api.base.ProjectSpecificMethods;

@CucumberOptions(
		plugin= {"rerun:C:\\Users\\sathishkumar.h\\eclipse-workspace\\fleet9\\target\\failedrerun.txt"},
				
				
		features="@target\\\\failedrerun.txt", glue= {"pages"}, monochrome=true)


public class FailedTestCase extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality";
		authors="Anu";
		category ="Smoke";
		
	 
}
}


//   src/main/java/features/F01_Login.feature