package automationTests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class TestNG_Demo {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {

		//Project Path
		String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public static void googleSearch() {	
			//Go to Google.com
			driver.get("http://www.google.com");
				
			//enter text in search
			//driver.findElement(By.name("q")).sendKeys("Course on Selenium");
			GoogleSearchPage.textbox_search(driver).sendKeys("WOrking with POM");
			
			//click on search
			//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			GoogleSearchPage.button_Search(driver).sendKeys(Keys.ENTER);			
					
	}
	
	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully!");
	}

}
