package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HedlessChrome_Demo {
	
	public static void test() {
		
		
		System.setProperty("webdriver.chrome.driver", "path" );
		WebDriver driver = new ChromeDriver();
	}

}
