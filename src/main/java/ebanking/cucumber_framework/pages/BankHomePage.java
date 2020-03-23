package ebanking.cucumber_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// page object model
public class BankHomePage {
	private WebDriver driver;

	public BankHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// username
	public WebElement txtUsername() {
		return this.driver.findElement(By.id("txtuId"));
	}

	// password
	public WebElement txtPassword() {
		return this.driver.findElement(By.id("txtPword"));
	}

	// login button
	public WebElement btnLogin() {
		return this.driver.findElement(By.id("login"));
	}

	// fill username
	public void fillUsername(String username) {
		this.txtUsername().sendKeys(username);
	}

	// fill password
	public void fillPassword(String password) {
		this.txtPassword().sendKeys(password);
	}

	// click login button
	public void clickLogin() {
		this.btnLogin().click();
	}

}
