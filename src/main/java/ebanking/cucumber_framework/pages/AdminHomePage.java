package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	
	private WebDriver driver;
	
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	public void clickHome() {
		this.btnHome.click();
	}
	
	
	// click logout button
	public void clickLogout() {
		this.btnLogout.click();
	}
	
	
	// click branches button
	public void clickBranches() {
		this.btnBranches.click();
	}
	
	// click  roles button
	public void clickRoles() {
		this.btnRoles.click();
	}
	
	// click employee button
	public void clickEmployee() {
		this.btnEmployee.click();
	}

}
