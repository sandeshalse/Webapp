package com.webapp.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://www.xe.com/']")
	public WebElement HomeLink;
	public void ClickOnHomeLink()
	{
		HomeLink.click();
	}
	
	@FindBy(id="amount")
	public WebElement AmountTextField;
	public void EnterAmountInAmountTextField(double amt)
	{
		AmountTextField.clear();
		AmountTextField.sendKeys("amt");
	}
	
	@FindBy(xpath="//button[@aria-label='Convert']")
	public WebElement Convertbutton;
	public void ClickOnConvertButton()
	{
		Convertbutton.click();
	}
	
	@FindBy(xpath="//div[@id='educational']")
	public WebElement Resourcesmenu;
	public void ClickOnResourcesmenu()
	{
		Resourcesmenu.click();
	}
	
	@FindBy(xpath="//div[@id='educational']")
	public WebElement BlogLink;
	public void ClickOnBlogLink()
	{
		BlogLink.click();
	}
	public boolean BlogLinkisDisplayed()
	{
		return BlogLink.isDisplayed();
	}
	
	@FindBy(xpath="//a[@role='menuitem'][text()='Market Analysis']")
	public WebElement MarketAnalysisLink;
	public void ClickOnMarketAnalysisLink()
	{
		MarketAnalysisLink.click();
	}
	public boolean MarketAnalysisLinkisDisplayed()
	{
		return MarketAnalysisLink.isDisplayed();
	}
	
	@FindBy(xpath="//a[@role='menuitem'][text()='Currency Encyclopedia']")
	public WebElement CurrencyEncyclopediaLink;
	public void ClickOnCurrencyEncyclopediaLink()
	{
		CurrencyEncyclopediaLink.click();
	}
	public boolean CurrencyEncyclopediaLinkisDisplayed()
	{
		return CurrencyEncyclopediaLink.isDisplayed();
	}
	
	@FindBy(xpath="//a[@role='menuitem'][text()='Fraud Prevention']")
	public WebElement FraudPreventionLink;
	public void ClickOnFraudPreventionLink()
	{
		FraudPreventionLink.click();
	}
	public boolean FraudPreventionLinkisDisplayed()
	{
		return FraudPreventionLink.isDisplayed();
	}
	
	@FindBy(xpath="//a[contains(text(),'Back to Money Transfer & Currency Tips page')]")
	public WebElement BacktoMoneyTransferandCurrencyTipspagebutton;
	public void ClickOnBacktoMoneyTransferandCurrencyTipspagebutton()
	{
		BacktoMoneyTransferandCurrencyTipspagebutton.click();
	}
	public boolean BacktoMoneyTransferandCurrencyTipspagebuttonisDisplayed()
	{
		return BacktoMoneyTransferandCurrencyTipspagebutton.isDisplayed();
	}
	
	//Login link
	@FindBy(xpath="//a[@class='login']")
	public WebElement LoginLink;
	public void ClickOnLoginLink()
	{
		LoginLink.click();
	}
	//Go to Login button
	@FindBy(xpath="//a[@class='go-to-login']")
	public WebElement GotoLoginbutton;
	public void ClickOnGotoLoginbutton()
	{
		GotoLoginbutton.click();
	}
	
	//Please select a service text
	@FindBy(xpath="//p[text()='Please select a service']")
	public WebElement Pleaseselectaservicetext;
	public boolean PleaseSelectaServicetextisDisplayed()
	{
		return Pleaseselectaservicetext.isDisplayed();
	}
	
	//Money Transfer option
	@FindBy(xpath="//span[@class='xe-title' and text()='Money Transfer']")
	public WebElement selectmoneytransferradiobutton;
	public void selectMoneyTransferradiobutton()
	{
		selectmoneytransferradiobutton.click();
	}
	
	//Link my account button
	
	@FindBy(id="lnkMyAccount")
	public WebElement LinkMyAccountbutton;
	
	//Welcome Message after Signing Up
	
	@FindBy(xpath="//h1[contains(text(),'Welcome to XE Money Transfer, Gvh')]")
	public WebElement WelcomeMessage;
	public boolean WelcomeMessageisDisplayed()
	{
		return WelcomeMessage.isDisplayed();
	}

}
