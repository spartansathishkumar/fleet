package testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import base.SeleniumBase;
import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		startApp("chrome", false, "https://fleet.amberconnect.com/v3/login");

	}

	@AfterMethod
	public void postCondition() {
		close();

	}








}
