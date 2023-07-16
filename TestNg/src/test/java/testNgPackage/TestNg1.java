package testNgPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg1 {
	@Test
	public void run()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
				
	}
	@Test
	public void run1() 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.quit();
		//Reporter.log("driver.get(\"https://www.facebook.com/\")", false);
		
	}

}
