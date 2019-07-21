package com.webapp.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ApplicationBase {
	public static WebDriver driver=null;
	static Logger log = Logger.getLogger("ApplicationBase");
	public static final String USERNAME = "sandeshalse1";
	public static final String AUTOMATE_KEY = "iS4YfrbzgTypk2Xz2JgK";
	public static final String url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	@BeforeClass
	@Parameters("Browser")
	public static void beforeclass(String br) throws MalformedURLException {
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/chromedriver");
		log.info("Opening Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		String title = driver.getTitle();
		log.info("Navigating to conversion currency website ------------->" +title);
		}
		if(br.equals("firefox"))
		{
			File src=new File("/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/geckodriver");
			System.setProperty("webdriver.gecko.driver",src.getAbsolutePath());
			log.info("Opening fireFox Browser");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
			String title = driver.getTitle();
			log.info("Navigating to conversion currency website ------------->" +title);
		}
		if(br.equals("ie"))
		{
			File src=new File("/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",src.getAbsolutePath());
			log.info("Opening Internet Exploprer Browser");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
			String title = driver.getTitle();
			log.info("Navigating to conversion currency website ------------->" +title);
		}
		if(br.equals("headless"))
		{
			File src=new File("/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/phantomjs");
			System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
			log.info("Executing internally using Headless- phantom JS - browser");
			driver = new PhantomJSDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
			String title = driver.getTitle();
			log.info("Navigating to conversion currency website ------------->" +title);		
		}
		if(br.equals("Browserstack_Windows_chrome"))
		{
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "70.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");
		    driver=new RemoteWebDriver(new URL(url),caps);
		    driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		}
		if(br.equals("Browserstack_Windows_ie"))
		{
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("browser", "IE");
		    caps.setCapability("browser_version", "11.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");
		    driver=new RemoteWebDriver(new URL(url),caps);
		    driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		}
		if(br.equals("Browserstack_OSX_safari"))
		{
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("browser", "Safari");
		    caps.setCapability("browser_version", "11.0");
		    caps.setCapability("os", "OS X");
		    caps.setCapability("os_version", "High Sierra");
		    caps.setCapability("resolution", "1024x768");
		    driver=new RemoteWebDriver(new URL(url),caps);
		    driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		}
	}
	@AfterClass
	public static void afterclass()
	{
	  driver.quit();
	}
}
