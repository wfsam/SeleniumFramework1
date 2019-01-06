package automationTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		//Project Path
				String projectPath = System.getProperty("user.dir");	
				System.out.println("My current project path is" + projectPath);
				System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
				driver = new FirefoxDriver();
				
				GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
				
				driver.get("https://www.google.com");
				
				searchPageObj.setTextInSearchBox(projectPath);
				searchPageObj.clickSearchButton();
				driver.close();
	}
}
