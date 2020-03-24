package ebanking.cucumber_framework.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage extends BasePage{
	
	public BranchCreationPage(WebDriver driver) {
		super(driver);
	}
	
	
	// branch name
	@FindBy(how = How.ID, using = "txtbName")
	private WebElement txtBranchName;
	
	// address 1
	@FindBy(how = How.ID, using= "txtAdd1")
	private WebElement txtAddress1;
	
	// zipcode
	@FindBy(how = How.ID, using = "txtZip")
	private WebElement txtZipcode;
	
	
	// country
	@FindBy(how= How.ID, using="lst_counrtyU")
	private WebElement ddCountry;
	
	// state
	@FindBy(how = How.ID, using = "lst_stateI")
	private WebElement ddState;
	
	// city
	@FindBy(how = How.ID, using = "lst_cityI")
	private WebElement ddCity;
	
	// submit
	@FindBy(how = How.ID, using = "btn_insert")
	private WebElement btnSubmit;
	
	
	// reset
	@FindBy(how = How.ID, using = "Btn_Reset")
	private WebElement btnReset;
	
	
	// cancel
	@FindBy(how = How.ID, using = "Btn_cancel")
	private WebElement btnCancel;
	
	
	// fill branch name
	public void fillBranchName(String branchName) {
		commonFunctions.type(txtBranchName, branchName);
	}
	
	
	// fill address 1
	public void fillAddress1(String address1) {
		commonFunctions.type(txtAddress1, address1);
	}
	
	// fill zip code
	public void fillZipcode(String zipcode) {
		commonFunctions.type(txtZipcode, zipcode);
	}
	
	// select country
	public void selectCountry(String country) {
//		Select countrySelect = new Select(this.ddCountry);
//		countrySelect.selectByVisibleText(country);
//		new Select(this.ddCountry).selectByVisibleText(country);
		commonFunctions.selectOption(ddCountry, country);
		
	}
	
	// select state
	public void selectState(String state) {
		commonFunctions.selectOption(ddState, state);
	}
	
	// select city
	public void selectCity(String city) {
		commonFunctions.selectOption(ddCity, city);
	}
	
	// click submit
	public Alert clickSubmit() {
		commonFunctions.click(btnSubmit);
		return this.driver.switchTo().alert();
	}
	
	// click reset
	public BranchCreationPage clickReset() {
		commonFunctions.click(btnReset);
		return this;
	}
	
	// click cancel
	public BranchDetailsPage clickCancel() {
		commonFunctions.click(btnCancel);
		return PageFactory.initElements(driver, BranchDetailsPage.class);
	}
	
	
	
}
