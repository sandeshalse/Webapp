package com.webapp.Actions;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webapp.Base.ApplicationBase;

public class ApplicationActions extends ApplicationBase{
	Logger log=Logger.getLogger("ApplicationActions");
	public static void explicitWaitForElementToBeVisible(WebElement wb)
	   {
		   WebDriverWait wait=new WebDriverWait(driver,20);
		   wait.until(ExpectedConditions.visibilityOf(wb));
	   }
	public static void explicitWaitForElementToBeClickable(WebElement wb)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	//Drop Down List
	public static void selectDDLusingOptionvalue(WebElement wb, String optvalue)
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
	//Mouse Movement Operations
	public void moveToElement(WebElement wb)
	{
		Actions act=new Actions(driver);
		act.moveToElement(wb);
		act.perform();		
	}
	public static void Entermultipletimes(WebElement wb,int count)
	{
		for(int i=1;i<=count;i++)
		{
			wb.sendKeys(Keys.ENTER);
		}		
	}
	public void Tabmultipletimes(WebElement wb,int count)
	{
		for(int i=1;i<=count;i++)
		{
			wb.sendKeys(Keys.ENTER);
		}		
	}
	public static void ArrowDownmultipletimes(WebElement wb,int count)
	{
		for(int i=1;i<=count;i++)
		{
			wb.sendKeys(Keys.ARROW_DOWN);
		}		
	}
	public void ArrowUpmultipletimes(WebElement wb,int count)
	{
		for(int i=1;i<=count;i++)
		{
			wb.sendKeys(Keys.ARROW_UP);
		}		
	}
	//Alert
	public void acceptalert()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void cancelalert()
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public String gettexfromtalert()
	{
		Alert alt=driver.switchTo().alert();
		String alerttext;
		return alerttext=alt.getText();
	}
	 //Switch to Child window
	static String parentwindow=null;
	public static void switchToChildWindow()
	{
	Set<String> set=driver.getWindowHandles();
	Iterator<String> itr=set.iterator();
	parentwindow=itr.next();
	String childwindow=itr.next();
	driver.switchTo().window(childwindow);
	}
	public static void switchToParentWindow()
	{
		driver.switchTo().window(parentwindow);
	}

}
