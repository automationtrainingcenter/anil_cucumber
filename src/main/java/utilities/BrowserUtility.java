package utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	protected WebDriver driver;

	public void launchBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("invalid browser name... Browser name must be either chrome or firefox");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void closeBrowser() {
		if (driver.getWindowHandles().size() > 1) {
			driver.quit();
		} else {
			driver.close();
		}
	}

}
