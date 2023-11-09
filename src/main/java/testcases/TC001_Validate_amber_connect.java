package testcases;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import testng.api.base.ProjectSpecificMethods;

@CucumberOptions(
		plugin= {"rerun:C:\\Users\\sathishkumar.h\\eclipse-workspace\\fleet10\\target\\failedrerun.txt"},
		features={"src/main/java/features/F01_Login.feature","src/main/java/features/F02_Vehicle_Information.feature","src/main/java/features/F03_Trips_Data.feature",
				"src/main/java/features/F04_Small_map_big_map_dashboard_loop.feature","src/main/java/features/F05_Vehicle_status_vehicle_type.feature","src/main/java/features/F06_Vehicle_type.feature",
				"src/main/java/features/F07_Logout.feature","src/main/java/features/F08_Export_xls_pdf_graphical_pdf.feature","src/main/java/features/F09_List.feature","src/main/java/features/F10_Multi_Trip_View.feature",
				"src/main/java/features/F11_Analytics.feature","src/main/java/features/F12_Comparison.feature"}, 
		         glue= {"pages"}, monochrome=true)




public class TC001_Validate_amber_connect extends ProjectSpecificMethods{
	@BeforeTest 
	public void setValues() {
		testcaseName = "Validate Login, SADemo1,Dashboard,Vehicle status,Vehicle type,trips data,  Vehicle information, small map and big map loop, Export xls and pdf,List, Multi trip, Analytics, Comparison,Logout";
		testDescription ="Validate of amber connect application"; 
		authors="Anu";
		category ="Smoke";
		
	 
}
}