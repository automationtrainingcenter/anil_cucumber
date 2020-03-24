package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage extends BasePage{
	
	public AdminHomePage(WebDriver driver) {
		super(driver);
	} 
	
	// home
	@FindBy(css = "a[href *= 'adminflow']")
	private WebElement btnHome;
	
	// logout
	@FindBy(css = "a[href *= 'primus']")
	private WebElement btnLogout;
	
	// branches
	@FindBy(css = "a[href *= 'banker']")
	private WebElement btnBranches;
	
	// roles
	@FindBy(css = "a[href *= 'Roles']")
	private WebElement btnRoles;
	
	// employees
	@FindBy(how = How.CSS, using = "a[href *= 'Emp']")
	private WebElement btnEmployee;
	
	
	// click home button
	public AdminHomePage clickHome() {
		commonFunctions.click(btnHome);
		return this;
	}
	
	
	// click logout button
	public BankHomePage clickLogout() {
		commonFunctions.click(btnLogout);
		return PageFactory.initElements(driver, BankHomePage.class);
	}
	
	
	// click branches button
	public BranchDetailsPage clickBranches() {
		commonFunctions.click(btnBranches);
		return PageFactory.initElements(driver, BranchDetailsPage.class);
	}
	
	// click  roles button
	public RoleDetailsPage clickRoles() {
		commonFunctions.click(btnRoles);
		return PageFactory.initElements(driver, RoleDetailsPage.class);
	}
	
	// click employee button
	public EmployeeDetailsPage clickEmployee() {
		commonFunctions.click(btnEmployee);
		return PageFactory.initElements(driver, EmployeeDetailsPage.class);
	}

}
