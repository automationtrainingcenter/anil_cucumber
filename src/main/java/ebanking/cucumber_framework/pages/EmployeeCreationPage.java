package ebanking.cucumber_framework.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeCreationPage extends BasePage {

	public EmployeeCreationPage(WebDriver driver) {
		super(driver);
	}

	// employee name
	@FindBy(how = How.ID, using = "txtUname")
	private WebElement txtEmployeeName;

	// login password
	@FindBy(how = How.ID, using = "txtLpwd")
	private WebElement txtLoingPass;

	// role
	@FindBy(how = How.ID, using = "lst_Roles")
	private WebElement ddRole;

	// branch
	@FindBy(how = How.ID, using = "lst_Branch")
	private WebElement ddBranchname;

	// submit
	@FindBy(how = How.ID, using = "BtnSubmit")
	private WebElement btnSubmit;

	// reset
	@FindBy(how = How.ID, using = "btnreset")
	private WebElement btnReset;

	// cancel
	@FindBy(how = How.ID, using = "btnCancel")
	private WebElement btnCancel;

	// fill employee name
	public void fillEmployeeName(String empName) {
		commonFunctions.type(txtEmployeeName, empName);
	}

	// fill login password
	public void fillLoginPass(String loginPass) {
		commonFunctions.type(txtLoingPass, loginPass);
	}

	// select role
	public void selectRole(String roleName) {
		commonFunctions.selectOption(ddRole, roleName);
	}

	// select branch
	public void selectBranch(String branchName) {
		commonFunctions.selectOption(ddBranchname, branchName);
	}

	// click submit
	public Alert clickSubmit() {
		commonFunctions.click(btnSubmit);
		return this.driver.switchTo().alert();
	}

	// click reset
	public EmployeeCreationPage clickReset() {
		commonFunctions.click(btnReset);
		return this;
	}

	// click cancel
	public EmployeeDetailsPage clickCancel() {
		commonFunctions.click(btnCancel);
		return PageFactory.initElements(driver, EmployeeDetailsPage.class);
	}

}
