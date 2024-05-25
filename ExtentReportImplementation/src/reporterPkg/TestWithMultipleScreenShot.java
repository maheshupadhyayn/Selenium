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

public class TestWithMultipleScreenShot {
	static ExtentTest graphicalTest;
	static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart(){
		graphicalReport = new ExtentReports("C:/Selenium/Oct2023/Report/ScreenShotMultipleResults.html", true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod){
		graphicalTest = graphicalReport.startTest(testMethod.getName());
	}
	@Test
	public void TC1() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver,"TC1"))+ "Test Pass");
	}
	@Test
	public void TC2() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver,"TC2"))+ "Test Failed");
	}
	@Test
	public void TC3() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver,"TC3"))+ "Test Failed");
	}
	@Test
	public void TC4()throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver,"TC4"))+ "Test Pass");
	}
	@AfterMethod
	public void afterEachTest(){
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
	
	public static String screenCapture(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot takeSS = (TakesScreenshot) driver;
		
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);//will take complete page screenshot
		File Dest = new File("./Screenshot/"+name+".png");//Dest where we want to copy screen shot file
		FileUtils.copyFile(sourceOutputFile, Dest);//we are copying source to destination
		String errflpath = Dest.getAbsolutePath();//we are returning complete path of destination
		return errflpath;
	}
}
