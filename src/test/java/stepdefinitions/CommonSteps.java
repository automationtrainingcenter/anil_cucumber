package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class CommonSteps {
	
	/*
	 * Before hook method will execute before executing every scenario of every feature
	 */
	// launch browser
	@Before
	public void setup() {
		System.out.println("*****************launch browser****************");
	}
	
	/*
	 * After hook method will execute after executing every scenario of every feature
	 */
	// close browser
	@After
	public void tearDown() {
		System.out.println("*********************close browser*************************");
	}
	
	/*
	 * to capture screenshot of failed steps we can use AfterStep hook method
	 */
	@AfterStep
	public void afterStep(Scenario scenario) {
		
		if(scenario.isFailed()) {
			// capture screenshot using Selenium getScreenshotAs(OutputType.BYTES)
//			scenario.embed(byte[], "png");
		}
	}

}
