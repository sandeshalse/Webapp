package com.webapp.Base;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ApplicationBase {
	public static WebDriver driver=null;
	@BeforeClass
	public static void beforeclass() {
		Logger log = Logger.getLogger("ApplicationBase");
		System.setProperty("webdriver.chrome.driver",
				"/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/chromedriver");
		log.info("Opening Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		String title = driver.getTitle();
		log.info("Navigating to conversion currency website ------------->" +title);
		

	}
	@AfterClass
	public static void afterclass()
	{
	  driver.quit();
	}
}
