package reporterPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GraphicalReporter {
	static ExtentTest graphicalTest;
	static ExtentReports graphicalReport;
	@BeforeClass
	public static void startTest()
	{
		graphicalReport = new ExtentReports(
				"C:/Selenium/Oct2023/Report/GraphicalResults.html",true);
		graphicalTest = graphicalReport.startTest("Google Test Design");
	}
	@Test
	public void extentReportsDemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google")){
			graphicalTest.log(LogStatus.PASS, "Navigated to the specified URL");
		}else{
			graphicalTest.log(LogStatus.FAIL, "Test Failed, Title not matched.");
		}
		driver.close();
	}
	@AfterClass
	public static void endTest()
	{
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
}
