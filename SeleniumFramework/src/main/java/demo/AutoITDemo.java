package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {

		String projectPath = System.getProperty("user.dir");	
		System.out.println("My current project path is" + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/gekoDriver/geckodriver.exe");
		//**

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tinyupload.com");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:/Users/SamDesktop/test/TestAutoIT.exe");
		Thread.sleep(3000);
		driver.close();
		
	}

}
