package expediaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	static WebDriver driver;
	
	public static WebDriver setUp(String browser) {
		String path = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", path + "\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", path + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
