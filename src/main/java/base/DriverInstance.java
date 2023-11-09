package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class DriverInstance extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<>();

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), 30));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			
			
			
			
			Map<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory","C:\\Users\\sathishkumar.h\\eclipse-workspace\\fleet9\\ExportFiles" ); 
			options.setExperimentalOption("prefs",chromePrefs);
			
			
			
			
			
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}

}
