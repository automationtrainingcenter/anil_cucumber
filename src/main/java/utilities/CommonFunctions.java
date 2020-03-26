package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
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
	public void captureScreenshot(WebDriver driver, String folderName, String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcImg = ts.getScreenshotAs(OutputType.FILE);
		File desImg = new File(System.getProperty("user.dir") + File.separator + folderName + File.separator + fileName);
		try {
			FileHandler.copy(srcImg, desImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// capture screenshot to add that to the report
	public byte[] captureScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BYTES);
	}

}
