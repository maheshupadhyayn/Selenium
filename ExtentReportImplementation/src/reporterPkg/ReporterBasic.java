package reporterPkg;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReporterBasic {
	public static void main(String[] args) {
		ExtentReports graphicalReport = new ExtentReports("C:/Selenium/Oct2023/Report/BasicResult.html",true);//Report Start
		ExtentTest graphicalTest = graphicalReport.startTest("Prathmesh Test");//Test Start
		
		graphicalTest.log(LogStatus.PASS, "I have open URL");//Step Start
		graphicalTest.log(LogStatus.FAIL, "Title does not match");
		graphicalTest.log(LogStatus.WARNING, "Capital User name is not allowed");
		graphicalTest.log(LogStatus.ERROR, "Element not found exception occured");//Steps End
		
		graphicalReport.endTest(graphicalTest);//End Test
		graphicalReport.flush();//Report clean
	}
}
