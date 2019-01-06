package automationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports_Demo {

	//private static ExtentHtmlReporter htmlReporter = null;
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        
     // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest testExtend1 = extent.createTest("Google Search Test 1" , "This is a test to validate google search functionality");
        
        String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		// log(Status, details)
		testExtend1.log(Status.INFO, "This step shows usage of log(status, details)");
		
		driver.get("https://www.google.com");
		//testExtend1.log(Status.PASS, "Google is ready");
		testExtend1.pass("Succesfully open Google.com");
		
		String text = "Testul cu Diana";
		driver.findElement(By.name("q")).sendKeys(text);
		
		testExtend1.pass("Succesfully entered text "+ text + " in  the  search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		testExtend1.pass("Hit Enter Succesfully !");
		
		//driver.close();
		//driver.quit();
		testExtend1.pass("All tests are passed!");
		
		testExtend1.info("Session completed");
		
		// calling flush writes everything to the log file
        extent.flush();
		
	}

}
