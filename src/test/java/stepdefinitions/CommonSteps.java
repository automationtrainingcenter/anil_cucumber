package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import utilities.BrowserUtility;
import utilities.CommonFunctions;

public class CommonSteps extends BrowserUtility{
	private static boolean isInitalized = false;
	
	
	/*
	 * Before hook method will execute before executing every scenario of every feature
	 */
	// launch browser
	public WebDriver getDriver() {
		if(!isInitalized) {
			launchBrowser("chrome", "http://primusbank.qedgetech.com/");
			isInitalized = true;
		}
		return driver;
	}
	
	/*
	 * After hook method will execute after executing every scenario of every feature
	 */
	// close browser
	@After
	public void tearDown() {
		closeBrowser();
		isInitalized = false;
	}
	
	/*
	 * to capture screenshot of failed steps we can use AfterStep hook method
	 */
	@AfterStep
	public void afterStep(Scenario scenario) {
		
		if(scenario.isFailed()) {
			// capture screenshot using Selenium getScreenshotAs(OutputType.BYTES)
//			scenario.embed(byte[], "image/png");
			CommonFunctions commonFunctions = new CommonFunctions(driver);
			scenario.embed(commonFunctions.captureScreenshot(driver), "image/png");
		}
	}

}
