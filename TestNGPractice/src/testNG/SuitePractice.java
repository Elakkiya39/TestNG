package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitePractice {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		startTime = System.currentTimeMillis();
	}
	@AfterSuite
	public void quitBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = System.currentTimeMillis();
		System.out.println("Total time taken is " + totalTime);
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void bing() {
		driver.get("https://www.bing.com");
	}

}
