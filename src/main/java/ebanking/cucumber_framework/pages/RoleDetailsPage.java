package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RoleDetailsPage extends BasePage {

	public RoleDetailsPage(WebDriver driver) {
		super(driver);
	}

	// new role button
	@FindBy(how = How.ID, using = "btnRoles")
	private WebElement btnNewRole;
	
	// click on new roles button
	public RoleCreationPage clickNewRole() {
		commonFunctions.click(btnNewRole);
		return PageFactory.initElements(driver, RoleCreationPage.class);
	}

}
