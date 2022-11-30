package com.AdityaGaur_3185083_SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "nav-line-1-container")
	public WebElement Signin_Button;
	
	@FindBy(how = How.LINK_TEXT, using = "Start here.")
	public WebElement registration;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_customer_name']")
	public WebElement custName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
	public WebElement newUserID;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_password']")
	public WebElement newPass;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'ap_phone_number]")
	public WebElement phnNum;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_password_check']")
	public WebElement passCheck;
	
	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	public WebElement clickCont;
	
	public void gotoSignin() {
		Signin_Button.click();
	}
	
	public void ClickRegister() {
		registration.click();
	}
	
	public void enterCustName(String name) {
		custName.sendKeys(name);
	}
	
	public void enterUserID(String id) {
		newUserID.sendKeys(id);
	}
	
	public void newPassword(String pass) {
		newPass.sendKeys(pass);
	}
	
	public void cnfPass(String pass) {
		passCheck.sendKeys(pass);
	}
	
	public void cellNum(String number) {
		phnNum.sendKeys(number);
	}
	
	public void cklCont() {
		clickCont.click();
	}

}
