package com.webapp.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.webapp.Actions.ApplicationActions;
import com.webapp.pageobject.HomePage;
import com.webapp.pageobject.LoginPage;
import com.webapp.pageobject.SignUpPage;

public class CreateAccountTest {
	Logger log=Logger.getLogger("CreateAccountTest");
	HomePage hp=null;
	LoginPage lp=null;
	SignUpPage sp=null;
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void Createaccount_WithouService_errormessagetest()
	{
		hp.ClickOnLoginLink();
		hp.ClickOnGotoLoginbutton();
		sa.assertTrue(hp.PleaseSelectaServicetextisDisplayed(), "Please select a service message is displayed");
	}
	
	@Test
	public void Createaccount_WithService()
	{
		hp.selectMoneyTransferradiobutton();
		hp.ClickOnGotoLoginbutton();
		lp.ClickOnSignUpbutton();
		ApplicationActions.switchToChildWindow();
		sp.ClickOnCountrysuggestionList();
		sp.EnterCountryinCountrysuggestionList();
		ApplicationActions.Entermultipletimes(sp.EnterCountry,1);
		sp.SelectTitlebutton();
		sp.EnterFirstName();
		sp.EnterMiddleName();
		sp.EnterLastName();
		sp.ClickContinueButton();
		//Email Id
		sp.EnterEmailId();
		sp.EnterPassword();
		ApplicationActions.selectDDLusingOptionvalue(sp.SecurityquestionDDL,sp.HighSchoolAttendedOptionValue);
		sp.EnterSecurityAnswer();
		sp.ClickYourDetailsButton();
		sp.EnterAddress();
		ApplicationActions.Entermultipletimes(sp.EnterCountry,1);
		ApplicationActions.selectDDLusingOptionvalue(sp.MonthDDl,sp.MonthOptionValue);
		sp.EnterDay();
		sp.Enteryear();
		sp.EnterPhoneno();
		sp.EnterSSN();
		sp.EnterOccupation();
		ApplicationActions.ArrowDownmultipletimes(sp.occupationtbox,1);
		ApplicationActions.Entermultipletimes(sp.occupationtbox,1);
		sp.ClickAcknowledgeButton();
		sp.ClickCreateAccountButton();
		ApplicationActions.explicitWaitForElementToBeVisible(hp.LinkMyAccountbutton);
		sa.assertTrue(hp.WelcomeMessageisDisplayed(), "Welcome message is displayed");
				
	}

}
