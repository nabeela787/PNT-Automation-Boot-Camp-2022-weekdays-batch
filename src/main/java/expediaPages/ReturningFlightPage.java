package expediaPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReturningFlightPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@data-stid='FLIGHTS_DETAILS_AND_FARES-index-16-FlightsActionButton']") WebElement btn_ReturnFlight;
	@FindBy(xpath = "(//button[@stid='select-button'])[1]") WebElement btn_Select;
	
	public ReturningFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectReturningFlight() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(btn_ReturnFlight));
		btn_ReturnFlight.click();
	}
	
	public void clickSelectBtn() {
		btn_Select.click();
	}

}
