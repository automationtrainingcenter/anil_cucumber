package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchDetailsPage extends BasePage{

	public BranchDetailsPage(WebDriver driver) {
		super(driver);
	}

	// new branch button
	@FindBy(id = "BtnNewBR")
	private WebElement btnNewBranch;

	// click new branch button
	public BranchCreationPage clickNewBranch() {
		commonFunctions.click(btnNewBranch);
		return PageFactory.initElements(driver, BranchCreationPage.class);
	}

}
