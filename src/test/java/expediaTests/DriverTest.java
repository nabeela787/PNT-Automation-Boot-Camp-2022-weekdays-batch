package expediaTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import expediaPages.Driver;

public class DriverTest {
	static WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		driver = Driver.setUp("chrome");
		driver.get("https://www.expedia.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser() {
//		driver.close();
//		driver.quit();
		
	}

}
