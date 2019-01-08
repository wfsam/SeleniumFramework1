package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SauceLabsDemo {

	public static final String USERNAME = "wfsam";
	public static final String ACCESS_KEY = "f177fe58-87d5-49b2-835b-99c790636524";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "Google test 1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "1.0");
				
//		String projectPath = System.getProperty("user.dir");	
//		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		//WebDriver driver = new FirefoxDriver();

		driver.get("http:www.google.com");
		System.out.println("Driver is "+ driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("SouceLabs");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());

		driver.quit();
		System.out.println("Test Completed");

		//	driver.get("https://saucelabs.com/test/guinea-pig");
		//	System.out.println("title of page is: " + driver.getTitle());

	}
}
