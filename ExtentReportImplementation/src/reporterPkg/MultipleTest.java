package reporterPkg;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MultipleTest {
	static ExtentTest graphicalTest;
	static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart(){
		graphicalReport = new ExtentReports(
				"C:/Selenium/Oct2023/Report/MultipleTestResults.html", true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod){
		graphicalTest = graphicalReport.startTest(testMethod.getName());
	}
	@Test
	public void loginTest()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC1");
	}
	@Test
	public void inboxTest()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC2");
	}
	@Test
	public void outboxTest()
	{
		graphicalTest.log(LogStatus.FAIL, "Navigated to TC3");
	}
	@Test
	public void logoutTest()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC4");
	}
	@AfterMethod
	public void afterEachTest(){
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
}
