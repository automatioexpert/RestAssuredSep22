package UnitTest;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentReportUtils;

public class Test_ExtentReport {

	public static void main(String[] args) {
		ExtentReportUtils extent= new ExtentReportUtils("demo");
		ExtentTest test =extent.getExtentReports().createTest("Test1");
		test.pass("Step1 passed");
		test.pass("Step2 passed");
		test.info("Some info");
		test.fail("step 3 fail");
		
		 extent.generateExtentReport() ;
		
	}
	
}
