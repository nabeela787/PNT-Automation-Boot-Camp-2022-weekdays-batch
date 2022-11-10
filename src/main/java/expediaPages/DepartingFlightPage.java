package expediaPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartingFlightPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@data-stid='FLIGHTS_DETAILS_AND_FARES-index-1-FlightsActionButton']") WebElement btn_DepartFlight;
	@FindBy(xpath = "(//button[@stid='select-button'])[1]") WebElement btn_Select;
	
	public DepartingFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectDepartingFlight() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(btn_DepartFlight));
		btn_DepartFlight.click();
	}
	
	public void clickSelectBtn() {
		btn_Select.click();
	}

}
