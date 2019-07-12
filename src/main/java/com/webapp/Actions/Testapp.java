package com.webapp.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Testapp {
	
	
	public void selectDDLusingOptionvalue(WebElement wb, String optvalue)
	{
		Select sel=new Select(wb);
		sel.selectByValue(optvalue);		
	}
	public void selectDDLusingIndex(WebElement wb, int index)
	{
		Select sel=new Select(wb);
		sel.selectByIndex(index);
	}
	public void selectDDLusingVisibletext(WebElement wb, String text)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(text);
	}
@Test
	public void test() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
				"/Users/salse/eclipse-workspace/Webapp/webtesting/src/main/resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
			
		driver.findElement(By.xpath("//a[@href='https://www.xe.com/']")).click();
		
//--------------------Assert		
		SoftAssert sa=new SoftAssert();
		driver.findElement(By.xpath("//div[@id='educational']")).click();
		sa.assertTrue(driver.findElement(By.xpath("//a[@role='menuitem'][text()='Blog']")).isDisplayed(),"Blog link is displayed in the menu");
		sa.assertTrue(driver.findElement(By.xpath("//a[@role='menuitem'][text()='Market Analysis']")).isDisplayed(),"Market Analysis link is displayed in the menu");
		sa.assertTrue(driver.findElement(By.xpath("//a[@role='menuitem'][text()='Currency Encyclopedia']")).isDisplayed(),"Currency Encyclopedia link is displayed in the menu");
		sa.assertTrue(driver.findElement(By.xpath("//a[@role='menuitem'][text()='Fraud Prevention']")).isDisplayed(),"Fraud Prevention link is displayed in the menu");
		//driver.findElement(By.xpath("//a[@role='menuitem'][text()='Fraud Prevention']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@role='menuitem'][text()='Fraud Prevention']")));
		act.perform();
		sa.assertTrue(driver.findElement(By.xpath("//span[text()='Fraud Prevention']")).isDisplayed(),"Fraud Prevention link is displayed in the menu");
		driver.findElement(By.xpath("//a[contains(text(),'Back to Money Transfer & Currency Tips page')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Money Transfer & Currency Tips')]")).isDisplayed());
		driver.quit();
//------------------------		
		
	driver.findElement(By.xpath("//a[@class='login']"))	.click();
	driver.findElement(By.xpath("//a[@class='go-to-login']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Please select a service']")).isDisplayed());
	driver.findElement(By.xpath("//span[@class='xe-title' and text()='Money Transfer']")).click();
	//Click on Go to Login button
	driver.findElement(By.xpath("//a[@class='go-to-login']")).click();
	//Click on Sign Up
	driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	
	Set<String> set=driver.getWindowHandles();
	Iterator<String> itr=set.iterator();
	String parentwindow=itr.next();
	String childwindow=itr.next();
	driver.switchTo().window(childwindow);
	
	//Country DDL
		driver.findElement(By.id("select2-chosen-1")).click();
		driver.findElement(By.id("s2id_autogen1_search")).sendKeys("United States");
		driver.findElement(By.id("s2id_autogen1_search")).sendKeys(Keys.ENTER);
		
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.id("s2id_autogen1_search"))).perform();
//		act.sendKeys(Keys.ENTER).perform();
		
	
	driver.findElement(By.xpath("//button[@data-value='MR']")).click();
	driver.findElement(By.id("ff-first-name")).sendKeys("TestFN");
	driver.findElement(By.id("ff-middle-name")).sendKeys("TestA");
	driver.findElement(By.id("ff-last-name")).sendKeys("TestLN");
	
	
	//Click on Continue button
		driver.findElement(By.id("ff-step1")).click();
		int x=1;
		driver.findElement(By.id("ff-email")).sendKeys("sandesh.waze7+"+x+"@gmail.com");
//		for(int i=0;i<100;i++)
//		{
//			x++;
//		}
		//Then write it to the excel sheet.
		
		driver.findElement(By.id("ff-password")).sendKeys("Test1234!");
		//Security Question
		WebElement ddl=driver.findElement(By.id("ff-security-question"));
		
		selectDDLusingOptionvalue(ddl, "HIGH_SCHOOL_ATTENDED");
		
	driver.findElement(By.id("ff-security-answer")).sendKeys("Test");
	driver.findElement(By.xpath("//span[contains(text(),'NEXT: Your details')]")).click();
	
//	act.moveToElement(driver.findElement(By.id("ff-address-search"))).sendKeys("5520 SugarLoaf Ct");
//	act.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.id("ff-address-search")).sendKeys("5520 SugarLoaf Ct");
	driver.findElement(By.id("ff-address-search")).sendKeys(Keys.ENTER);
	
	
	//Thread.sleep(10000);
	
	
	selectDDLusingOptionvalue(driver.findElement(By.id("ff-dob__month")),"8");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='Day']")).sendKeys("15");
	Thread.sleep(10000);
	driver.findElement(By.id("ff-dob__year")).sendKeys("1990");
//	driver.findElement(By.xpath("//span[@class='buttonText']")).click();
//	driver.findElement(By.id("ff-amount")).sendKeys("10000");
//	driver.findElement(By.id("ff-signup__offers")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("ff-phone__main")).sendKeys("4089655434");
	
	driver.findElement(By.xpath("//input[@name='UsCitizenQuestions.SsnOrItinNumber']")).sendKeys("832959745");
	
	driver.findElement(By.id("ff-occupation-search")).sendKeys("Actor");
	driver.findElement(By.id("ff-occupation-search")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("ff-occupation-search")).sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
	//driver.findElement(By.id("ff-signup__offers-no")).click();
	driver.findElement(By.id("ff-signup__tcs2")).click();
	Thread.sleep(10000);
	//Click on Create Account button
	driver.findElement(By.xpath("//span[@class='buttonText' and contains(text(),'Open your Account')]")).click();
	//wait
	driver.findElement(By.id("lnkMyAccount"));
	
	Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Welcome to XE Money Transfer, Gvh')]")).isDisplayed());
	
	
	
	
	
	
	//driver.switchTo().window(parentwindow);
	
	
	
	driver.quit();
	
	
	
		
		
		
		
		
		
		
		

	}

}
