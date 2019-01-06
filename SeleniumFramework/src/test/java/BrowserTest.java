import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {

		//*Project Path
		String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		//**

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement textBox =  driver.findElement(By.name("q"));
		textBox.sendKeys("Learning Selenium");
		Thread.sleep(1000);
		textBox.clear();
		Thread.sleep(1000);

		WebElement secondSearch = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		secondSearch.sendKeys("Using xPath");
		Thread.sleep(1000);
		secondSearch.clear();

		List<WebElement> listOfElements = driver.findElements(By.xpath("//input"));
		int count = listOfElements.size();
		System.out.println("Count of input elements is " + count);
		driver.close();

	}
}
