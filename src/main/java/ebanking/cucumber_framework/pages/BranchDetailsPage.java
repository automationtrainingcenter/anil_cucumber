package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchDetailsPage {

	private WebDriver driver;

	public BranchDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// new branch button
	@FindBy(id = "BtnNewBR")
	private WebElement btnNewBranch;

	// click new branch button
	public void clickNewBranch() {
		this.btnNewBranch.click();
	}

}
