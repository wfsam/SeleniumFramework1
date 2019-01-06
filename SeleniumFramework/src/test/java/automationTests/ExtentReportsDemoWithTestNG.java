package automationTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsDemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	WebDriver driver;

	@BeforeSuite
	public void setUpReport() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	

	}

	@BeforeTest
	public void setUpTest() {

		//Project Path
		String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@org.testng.annotations.Test
	public void firstTest() throws IOException {

		ExtentTest testExtendWithTestNG = extent.createTest("Google Search Test with Test NG" , "This is a test to validate google search functionality");

		driver.get("https://www.google.com");
		testExtendWithTestNG.pass("Navigated to Google.com");


		testExtendWithTestNG.log(Status.INFO, "This step shows usage of log(status, details)");
		testExtendWithTestNG.info("This step shows usage of info(details)");
		testExtendWithTestNG.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		testExtendWithTestNG.addScreenCaptureFromPath("screenshot.png");
	}

	@org.testng.annotations.Test
	public void firstTest2() throws IOException {

		ExtentTest testExtendWithTestNG = extent.createTest("Google Search Test with Test NG" , "This is a test to validate google search functionality");

		testExtendWithTestNG.log(Status.INFO, "This step shows usage of log(status, details)");
		testExtendWithTestNG.info("This step shows usage of info(details)");
		testExtendWithTestNG.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		testExtendWithTestNG.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDownTest() {
		//close browser
		//driver.close();
		//driver.quit();
		System.out.println("Test completed succesfully!");
	}

	@AfterSuite
	public void tearDown() {

		// calling flush writes everything to the log file
		extent.flush();

	}
}
