package com.AdityaGaur_3185083_SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCart{
	
	WebDriver driver;
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/a[1]/div/img")
	public WebElement WhiteYellow;
	
	@FindBy(how = How.XPATH, using = "//input[@id='buy-now-button']")
	public WebElement BuyNow;
	
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
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'ppw-instrumentRowSelection']")
	public WebElement UPI;
	
	@FindBy(how = How.XPATH, using = "//input[@id='pp-mdwqzV-315']")
	public WebElement EnterUPI;
	
	@FindBy(how = How.XPATH, using = "//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	public WebElement Verify;
	
	@FindBy(how = How.XPATH, using = "//span[@id='nav-cart-count']")
	public WebElement ClickCart;
	
	@FindBy(how = How.ID, using = "a-autoid-4-announce")
	public WebElement Quantity;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity_0\"]")
	public WebElement delete;
	
	public void RemoveFromCart() {
		ClickCart.click();
		Quantity.click();
		delete.click();
	}
	
	public void clkVerify() {
		Verify.click();
	}
	
	public void EnterID(String UpiId) {
		EnterUPI.sendKeys(UpiId);
	}
	
	public void SelectUPI() {
		UPI.click();
	}
	
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
	
	public void Mat() {
		WhiteYellow.click();
	}
	
	public void signin(String mail, String pass) {
		Signin_Button.click();
		Signin_Email.sendKeys(mail);
		next.click();
		password.sendKeys("9810316395");
		submit.click();
	}
	
	public void buying(){
		BuyNow.click();
	}
}
