package pages;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import testng.api.base.ProjectSpecificMethods;

public class HooksImplementation extends ProjectSpecificMethods{
	@Before
	public void beforeScenario(Scenario sc) {
		testName.set(sc.getName());
		setNode();

	}
}