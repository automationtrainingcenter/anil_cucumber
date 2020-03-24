package ebanking.cucumber_framework.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RoleCreationPage extends BasePage {

	public RoleCreationPage(WebDriver driver) {
		super(driver);
	}

	// role name
	@FindBy(how = How.ID, using = "txtRname")
	private WebElement txtRoleName;

	// role type
	@FindBy(how = How.ID, using = "txtRname")
	private WebElement ddRoleType;

	// submit
	@FindBy(how = How.ID, using = "btninsert")
	private WebElement btnSubmit;

	// reset
	@FindBy(how = How.ID, using = "Btn_Reset")
	private WebElement btnReset;

	// cancel
	@FindBy(how = How.ID, using = "Btn_cancel")
	private WebElement btnCancel;

	// fill role name
	public void fillRoleName(String roleName) {
		commonFunctions.type(txtRoleName, roleName);
	}

	// select role type
	public void selectRoleType(String roleType) {
		commonFunctions.selectOption(ddRoleType, roleType);
	}

	// click on submit
	public Alert clickSubmit() {
		commonFunctions.click(btnSubmit);
		return this.driver.switchTo().alert();
	}

	// click on reset
	public RoleCreationPage clickReset() {
		commonFunctions.click(btnReset);
		return this;
	}

	// click on cancel
	public RoleDetailsPage clickCancel() {
		commonFunctions.click(btnCancel);
		return PageFactory.initElements(driver, RoleDetailsPage.class);
	}

}
