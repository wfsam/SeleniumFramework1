import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCapabilities_Demo {

	private static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String projectPath = System.getProperty("user.dir");	
				System.out.println("My current project path is" + projectPath);
				System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
				
				driver = new FirefoxDriver();
				
				driver.get("https://www.google.com/");
				driver.findElement(By.name("q")).sendKeys("abcd");
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				
				

	}

}
