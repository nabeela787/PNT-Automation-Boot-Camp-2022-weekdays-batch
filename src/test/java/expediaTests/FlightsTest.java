package expediaTests;

import org.testng.annotations.Test;

import expediaPages.CheckOutPage;
import expediaPages.DepartingFlightPage;
import expediaPages.HomePage;
import expediaPages.ReturningFlightPage;
import expediaPages.ReviewYourFlightPage;

public class FlightsTest extends DriverTest{
	
  @Test(priority = 0)
  public void testHomePage() {
	  HomePage page = new HomePage(driver);
	  page.clickFlights();
	  page.enterLeavingFromAirport();
	  page.enterGoingToAirport();
	  page.clickSubmit();
  }
  
  @Test(priority = 1)
  public void testDepartingFlightPage() {
	  DepartingFlightPage page = new DepartingFlightPage(driver);
	  page.selectDepartingFlight();
	  page.clickSelectBtn();
  }
  
  @Test(priority = 2)
  public void testReturningFlightPage() {
	  ReturningFlightPage page = new ReturningFlightPage(driver);
	  page.selectReturningFlight();
	  page.clickSelectBtn();
  }
  
  @Test(priority = 3)
  public void testReviewYourTripPage() {
	  ReviewYourFlightPage page = new ReviewYourFlightPage(driver);
	  page.switchWindows();
	  page.clickCheckOutBtn();

  }
  
  @Test(priority = 4)
  public void testCheckOutPage() {
	  CheckOutPage page = new CheckOutPage(driver);
	  page.enterFirstName();
	  page.enterLastName();
	  page.enterPhoneNumber();
	  page.selectFemaleGender();
	  page.selectDOBMonth();
	  page.selectDOBDay();
	  page.selectDOBYear();
  }
  

  
}
