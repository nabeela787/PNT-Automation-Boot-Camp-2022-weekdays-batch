package expediaPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewYourFlightPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@stid='goto-checkout-button']") WebElement btn_CheckOut;
	
	public ReviewYourFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchWindows() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		
		String window1 = iterator.next();
		String window2 = iterator.next();
		driver.switchTo().window(window2);
		
	}
	
	public void clickCheckOutBtn() {
		btn_CheckOut.click();
	}

}
