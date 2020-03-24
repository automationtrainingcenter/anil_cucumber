package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonFunctions;

public class BasePage {
	
	protected WebDriver driver;
	protected CommonFunctions commonFunctions;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.commonFunctions = new CommonFunctions(driver);
		PageFactory.initElements(driver, this);
	}

}
