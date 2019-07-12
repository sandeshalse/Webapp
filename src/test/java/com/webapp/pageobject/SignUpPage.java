package com.webapp.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Country of Residence
	
	@FindBy(id="select2-chosen-1")
	public WebElement ClickOnCountrysuggestionList;
	public void ClickOnCountrysuggestionList()
	{
		ClickOnCountrysuggestionList.click();
	}
	
	@FindBy(id="s2id_autogen1_search")
	public WebElement EnterCountry;
	public void EnterCountryinCountrysuggestionList()
	{
		EnterCountry.sendKeys("United States");
	}
	
	//Title
	@FindBy(xpath="//button[@data-value='MR']")
	public WebElement ClickOnTitle;
	public void SelectTitlebutton()
	{
		ClickOnTitle.click();
	}
	
	@FindBy(id="ff-first-name")
	public WebElement FNtextbox;
	public void EnterFirstName()
	{
		FNtextbox.sendKeys("TestFN");
	}
	
	@FindBy(id="ff-middle-name")
	public WebElement MNtextbox;
	public void EnterMiddleName()
	{
		MNtextbox.sendKeys("TestMN");
	}
	
	@FindBy(id="ff-last-name")
	public WebElement LNtextbox;
	public void EnterLastName()
	{
		LNtextbox.sendKeys("TestLN");
	}
	
	//Continue button
	@FindBy(id="ff-step1")
	public WebElement CTNBtn;
	public void ClickContinueButton()
	{
		CTNBtn.click();
	}
	
	//Email Text Box
	@FindBy(id="ff-email")
	public WebElement Emailtextbox;
	public void EnterEmailId()
	{
		Emailtextbox.sendKeys("san@gmail.com");
	}
	
	//Password Text Box
	@FindBy(id="ff-password")
	public WebElement Passwordtextbox;
	public void EnterPassword()
	{
		Passwordtextbox.sendKeys("Test1234!");
	}
	
	//Security Question
	@FindBy(id="ff-security-question")
	public WebElement SecurityquestionDDL;
	public String HighSchoolAttendedOptionValue="HIGH_SCHOOL_ATTENDED";
	
	//Security Answer
	@FindBy(id="ff-security-answer")
	public WebElement SecurityAnswertbox;
	public void EnterSecurityAnswer()
	{
		SecurityAnswertbox.sendKeys("TestAnswer");
	}
	
	//Your Details button
	@FindBy(xpath="//span[contains(text(),'NEXT: Your details')]")
	public WebElement YourDetailsBtn;
	public void ClickYourDetailsButton()
	{
		YourDetailsBtn.click();
	}
	
	//Address
	@FindBy(id="ff-address-search")
	public WebElement Addresstbox;
	public void EnterAddress()
	{
		Addresstbox.sendKeys("5520 SugarLoaf Ct");
	}
	
	//Date of Birth
	@FindBy(id="ff-dob__month")
	public WebElement MonthDDl;
	public String MonthOptionValue="8";
	
	//Day
	@FindBy(xpath="//input[@name='Day']")
	public WebElement daytbox;
	public void EnterDay()
	{
		daytbox.sendKeys("15");
	}
	
	//Year
	@FindBy(id="ff-dob__year")
	public WebElement yeartbox;
	public void Enteryear()
	{
		yeartbox.sendKeys("1990");
	}
	
	//Phone Number
	@FindBy(id="ff-phone__main")
	public WebElement phonenotbox;
	public void EnterPhoneno()
	{
		phonenotbox.sendKeys("7865432345");
	}
	
	//SSN
	@FindBy(xpath="//input[@name='UsCitizenQuestions.SsnOrItinNumber']")
	public WebElement ssnbox;
	public void EnterSSN()
	{
		ssnbox.sendKeys("832959745");
	}
	
	//Occupation
	@FindBy(id="ff-occupation-search")
	public WebElement occupationtbox;
	public void EnterOccupation()
	{
		occupationtbox.sendKeys("Actor");
	}
	
	//Acknowledge  button
	@FindBy(id="ff-signup__tcs2")
	public WebElement ackBtn;
	public void ClickAcknowledgeButton()
	{
		ackBtn.click();
	}
	
	//Create Account
	@FindBy(xpath="//span[@class='buttonText' and contains(text(),'Open your Account')]")
	public WebElement CreateAccBtn;
	public void ClickCreateAccountButton()
	{
		CreateAccBtn.click();
	}
	
	
}
