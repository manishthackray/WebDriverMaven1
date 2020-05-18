package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver; 
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Desktop/Manish/Workspace/Selenium/geckodriver");
		driver = new FirefoxDriver();
		
	}
	
	@Test	
	public void doLogin() {
		
		driver.get("https://trial.rivers.im/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/form/div[1]/input")).sendKeys("+91");
		driver.findElement(By.id("phoneNumber")).sendKeys("8377099577");
		
		driver.findElement(By.xpath("//div[1]/div/div[1]/div/form/button"));
	
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
