package com.AdityaGaur_3185083_SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "nav-line-1-container")
	public WebElement Signin_Button;

	@FindBy(how = How.ID, using = "ap_email")
	public WebElement Signin_Email;

	@FindBy(how = How.ID, using = "continue")
	public WebElement next;
	
	@FindBy(how = How.ID, using = "ap_password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "signInSubmit")
	public WebElement submit;
	
	public void gotoSignin() {
		Signin_Button.click();
	}
	
	public void username(String mail) {
		Signin_Email.sendKeys(mail);
	}
	
	public void ClickCont() {
		next.click();
	}
	
	public void Enterpass(String pass) {
		password.sendKeys(pass);
	}
	
	public void ClickSignin() {
		submit.click();
	}
	
}
