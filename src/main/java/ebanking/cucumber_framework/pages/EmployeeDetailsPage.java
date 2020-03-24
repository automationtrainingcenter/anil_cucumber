package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDetailsPage extends BasePage{

	public EmployeeDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	// new employee button
	@FindBy(how = How.ID, using="BtnNew")
	private WebElement btnNewEmployee;
	
	
	// click on new employee button
	public EmployeeCreationPage clickNewEmployee() {
		commonFunctions.click(btnNewEmployee);
		return PageFactory.initElements(driver, EmployeeCreationPage.class);
	}
	
	

}
