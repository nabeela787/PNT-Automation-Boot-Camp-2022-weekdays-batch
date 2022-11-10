package expediaPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a") WebElement tabFlight;
	@FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[1]/button") WebElement clickLeavingFrom;
	@FindBy(id = "location-field-leg1-origin") WebElement enterLeavingFrom;
	
	@FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/div[1]/button") WebElement clickGoingFrom;
	@FindBy (id = "location-field-leg1-destination") WebElement enterGFAirport;
	@FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button") WebElement submitBtn;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterLeavingFromAirport() {
		clickLeavingFrom.click();
		enterLeavingFrom.sendKeys("JFK" + Keys.ENTER);

	}
	
	public void enterGoingToAirport() {
		clickGoingFrom.click();
		enterGFAirport.sendKeys("SFO" + Keys.ENTER);
	}
	
	public void clickFlights() {
		tabFlight.click();
		
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
	

}
