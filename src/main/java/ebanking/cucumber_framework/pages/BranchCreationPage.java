package ebanking.cucumber_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage {
	
	private WebDriver driver;
	
	
	public BranchCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
		this.txtBranchName.sendKeys(branchName);
	}
	
	
	// fill address 1
	public void fillAddress1(String address1) {
		this.txtAddress1.sendKeys(address1);
	}
	
	// fill zip code
	public void fillZipcode(String zipcode) {
		this.txtZipcode.sendKeys(zipcode);
	}
	
	// select country
	public void selectCountry(String country) {
//		Select countrySelect = new Select(this.ddCountry);
//		countrySelect.selectByVisibleText(country);
		new Select(this.ddCountry).selectByVisibleText(country);
		
	}
	
	// select state
	public void selectState(String state) {
		new Select(this.ddState).selectByVisibleText(state);
		
	}
	
	// select city
	public void selectCity(String city) {
		new Select(this.ddCity).selectByVisibleText(city);
	}
	
	// click submit
	public void clickSubmit() {
		this.btnSubmit.click();
	}
	
	// click reset
	public void clickReset() {
		this.btnReset.click();
	}
	
	// click cancel
	public void clickCancel() {
		this.btnCancel.click();
	}
	
	
	
}
