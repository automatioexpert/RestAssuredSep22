package TestScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Actions.CreateBookingActions;
import Models.BookingDates;
import Payload.CreateBookingRequest;
import Utilities.ExtentReportUtils;

public class CreateBookingTests {

	ExtentReportUtils extentReportUtils;
	@BeforeSuite
	public void setUp() {
		extentReportUtils= new ExtentReportUtils("Rest_full_Booker_API_Test_Report");
		//ExtentTest test =extentReportUtils.getExtentReports().createTest("CreateBookingTests with proper data");
	}
	@Test
	public void createBooking() 
	{
		ExtentTest test =extentReportUtils.getExtentReports().createTest("CreateBookingTests with proper data");
		//Create Payload
		CreateBookingRequest createBookingRequest= new CreateBookingRequest();
		createBookingRequest.setFirstName("VV");
		createBookingRequest.setLastName("vish");
		createBookingRequest.setAdditionalDetails("Dinner");
		
		BookingDates  bookingDates = new BookingDates();
		bookingDates.setCheckIn("09/11/1992");
		bookingDates.setCheckOut("20/11/1992");
		
		CreateBookingActions createBookingActions=new CreateBookingActions(test);
		createBookingActions.createBooking(createBookingRequest);
		createBookingActions.verifyStatusCode(200);
		
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		extentReportUtils.generateExtentReport();
	}
}
