 package Actions;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import DataStore.Data;
import Payload.CreateBookingRequest;
import Payload.CreateBookingResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateBookingActions {
	Response response;
	CreateBookingResponse createBookingResponse;
	ExtentTest test;
	
	public CreateBookingActions(ExtentTest test) {
		this.test=test;
	}
	
	

	public CreateBookingResponse createBooking(CreateBookingRequest createBookingRequest) {
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		RestAssured.basePath=Data.Create_Booking_Path;
		test.info("Base URI is : "+Data.basePath);
		test.info("Base Path is : "+Data.Create_Booking_Path);
response=RestAssured.given()
.body(createBookingRequest)
.contentType(ContentType.JSON)
.log()
.all()
.post();

test.info("Responde is : "+response.prettyPrint());
createBookingResponse =response.as(CreateBookingResponse.class);
return createBookingResponse;
	}

	public void verifyStatusCode(int expectedStatusCode) {
		
		int actualCode=response.getStatusCode();
		test.info("Status code is : "+actualCode);
		Assert.assertEquals(actualCode, expectedStatusCode);
	}
}
