package expediaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
	WebDriver driver;
	
	@FindBy(id = "firstname[0]") WebElement txt_FirstName;
	@FindBy(id = "lastname[0]") WebElement txt_LastName;
	@FindBy(id = "phone-number[0]") WebElement phoneNumber;
	@FindBy(id = "gender_female[0]") WebElement femaleGender;
	@FindBy(id = "date_of_birth_month0") WebElement dob_Month;
	@FindBy(id = "date_of_birth_day[0]") WebElement dob_Day;
	@FindBy(id = "date_of_birth_year[0]") WebElement dob_Year;
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName() {
		txt_FirstName.sendKeys("Test");
	}
	
	public void enterLastName() {
		txt_LastName.sendKeys("Data");
	}
	
	public void enterPhoneNumber() {
		phoneNumber.sendKeys("6091234567");
	}
	
	public void selectFemaleGender() {
		femaleGender.click();
	}
	
	public void selectDOBMonth() {
		Select select = new Select(dob_Month);
		select.selectByIndex(10);
	}
	
	public void selectDOBDay() {
		Select select = new Select(dob_Day);
		select.selectByValue("23");
	}
	
	public void selectDOBYear() {
		Select select = new Select(dob_Year);
		select.selectByVisibleText("1998");
	}

}
