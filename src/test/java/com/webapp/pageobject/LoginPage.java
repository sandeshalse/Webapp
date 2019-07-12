package com.webapp.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Sign Up button
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	public WebElement SignUpbutton;
	public void ClickOnSignUpbutton()
	{
		SignUpbutton.click();
	}
	public boolean SignUpbuttonisDisplayed()
	{
		return SignUpbutton.isDisplayed();
	}

	//Login button
	@FindBy(id="loginbutton")
	public WebElement Loginbutton;
	public void ClickOnLoginbutton()
	{
		Loginbutton.click();
	}
	public boolean LoginbuttonisDisplayed()
	{
		return Loginbutton.isDisplayed();
	}

	//Email Address or Username text field
	@FindBy(id="Username")
	public WebElement Usernamefield;
	public void EnterUsername()
	{
		Usernamefield.sendKeys("san@gmail.com");
	}
	//Password	
	@FindBy(id="Password")
	public WebElement Passwordield;
	public void EnterPassword()
	{
		Passwordield.sendKeys("Test23445!");
	}
	//Forgot Password link
	@FindBy(id="forgotPasswordLink")
	public WebElement forgotPasswordLink;
	public void ClickOnForgotLoginDetailslink()
	{
		forgotPasswordLink.click();
	}
	public boolean ForgotLoginDetailslinkisDisplayed()
	{
		return forgotPasswordLink.isDisplayed();
	}


}
