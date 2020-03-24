package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	private WebDriverWait wait;

	public CommonFunctions(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 10);
		
	}

	// click
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// select
	public void selectOption(WebElement element, String optionText) {
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
		new Select(element).selectByVisibleText(optionText);

	}

	// sendkeys
	public void type(WebElement element, String data) {
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(data);
	}

	// capture screenshot

}
