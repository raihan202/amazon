package upSkill.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;





public class SetUpDrivers {
	public static WebDriver driver;
	
	public static void setupDriver() {
		
		

	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start maximize");
	options.addArguments("--disable-notification"); 
	driver = new ChromeDriver(options);
	driver.get("https://www.amazon.com/");
}
	public static WebDriver getDriver() {
		return driver;
		
			
		
	}

	public static void tearDownDriver() {
		driver.close();
		driver.quit();
	}

	
	
	
	
	
}
