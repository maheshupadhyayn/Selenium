package reporterPkg;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestWithScreenShot {
	static ExtentTest graphicalTest;
	static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart(){
		graphicalReport = new ExtentReports("C:/Selenium/Oct2023/Report/ScreenShotGraphicalResults.html", true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod){
		graphicalTest = graphicalReport.startTest(testMethod.getName());
	}
	@Test
	public void TC1()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC1");
	}
	@Test
	public void TC2()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC2");
	}
	@Test
	public void TC3() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver))+ "Test Failed");
	}
	@Test
	public void TC4()
	{
		graphicalTest.log(LogStatus.PASS, "Navigated to TC4");
	}
	@AfterMethod
	public void afterEachTest(){
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
	
	public static String screenCapture(WebDriver driver) throws IOException {
		
		TakesScreenshot takeSS = (TakesScreenshot) driver;
		
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/fullPage.png");
		FileUtils.copyFile(sourceOutputFile, Dest);
		return Dest.getAbsolutePath();
	}
}
