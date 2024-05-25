package reporterPkg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasicTestNGConversion {
	ExtentReports graphicalReport = null;
	ExtentTest graphicalTest = null;
	
	@BeforeTest
	public void beforeTest() {
		graphicalReport = new ExtentReports(
				"C:/Selenium/Oct2023/Report/TestNGBasicResult.html",true);//Report Start
		graphicalTest = graphicalReport.startTest("Login Test Report");//Test Start
	}
	
	@Test
	public void loginTest() {
		graphicalTest.log(LogStatus.PASS, "I have open URL");//Step Start
		graphicalTest.log(LogStatus.FAIL, "Title does not match");
		graphicalTest.log(LogStatus.WARNING, "Capital User name is not allowed");
		graphicalTest.log(LogStatus.ERROR, "Element not found exception occured");//Steps End
	}
	
	@AfterTest
	public void afterTest() {
		graphicalReport.endTest(graphicalTest);//End Test
		graphicalReport.flush();//Report clean
	}
}
