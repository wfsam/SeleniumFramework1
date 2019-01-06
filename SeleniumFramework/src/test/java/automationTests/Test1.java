package automationTests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;

public class Test1 {
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {	
		
		//Project Path
		String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
			//Go to Google.com
			driver.get("http://www.google.com");
				
			//enter text in search
			//driver.findElement(By.name("q")).sendKeys("Course on Selenium");
			GoogleSearchPage.textbox_search(driver).sendKeys("WOrking with POM");
			
			//click on search
			//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			GoogleSearchPage.button_Search(driver).sendKeys(Keys.ENTER);
			
			//close browser
			driver.close();
			
			System.out.println("Test completed succesfully!");
				
				
	}

}
