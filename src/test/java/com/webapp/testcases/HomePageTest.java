package com.webapp.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.webapp.Actions.ApplicationActions;
import com.webapp.Base.ApplicationBase;
import com.webapp.pageobject.HomePage;
import java.util.logging.Logger;
import org.testng.annotations.Test;

public class HomePageTest extends ApplicationBase

{	
	Logger log = Logger.getLogger("HomePageTest");
	HomePage hp=null;
	SoftAssert sa=new SoftAssert();
	@Test
	public void CurrencyConvertion()
	{
		try {
			hp=new HomePage(driver);
			ApplicationActions.explicitWaitForElementToBeVisible(hp.HomeLink);
			log.info("Clicking on the Home link");
			hp.ClickOnHomeLink();
			log.info("Adding amount in the Amount field");
			hp.EnterAmountInAmountTextField(25.0);
			ApplicationActions.explicitWaitForElementToBeClickable(hp.Convertbutton);
			log.info("Clicking on Convert button");
			hp.ClickOnConvertButton();
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	@Test
	public void verifymenuitems()
	{
		hp.ClickOnResourcesmenu();
		sa.assertTrue(hp.BlogLinkisDisplayed(), "Blog link is displayed in the menu");
		sa.assertTrue(hp.MarketAnalysisLinkisDisplayed(),"Market Analysis link is displayed in the menu");
		sa.assertTrue(hp.CurrencyEncyclopediaLinkisDisplayed(),"Currency Encyclopedia link is displayed in the menu");
		sa.assertTrue(hp.FraudPreventionLinkisDisplayed(),"Fraud Prevention link is displayed in the menu");
		sa.assertTrue(hp.BacktoMoneyTransferandCurrencyTipspagebuttonisDisplayed(),"");	
	}
	@Test
	public void navigatetoFraudPreventionPageTest()
	{
		hp.ClickOnFraudPreventionLink();
		sa.assertTrue(hp.BacktoMoneyTransferandCurrencyTipspagebuttonisDisplayed(),"Back to Money Transfer & Currency Tips page");	
		hp.ClickOnBacktoMoneyTransferandCurrencyTipspagebutton();		
	}
}








//@Test
//public void test() {
//
//	
//	
//	
//	WebElement convertbtn = driver.findElement((By.xpath("//button[@aria-label='Convert']")));
//	log.info("Clicking on " + convertbtn + " button");
//	convertbtn.click();
//
//}