package com.AdityaGaur_3185083_SeleniumAssignment.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.AdityaGaur_3185083_SeleniumAssignment.pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	public void intialSteps() {
		RegistrationPage register = new RegistrationPage(driver);
		register.ClickRegister();
	}
	
	@Test(priority = 1)
	@Parameters ({"name","newUser", "password"})
	public void validRegistration(String name,String newUser, String pass) {
		extentTest = extent.startTest("Verify that new user is registered");
		RegistrationPage page = new RegistrationPage(driver);
		intialSteps();
		page.enterCustName(name);
		page.enterUserID(newUser);
		page.newPassword(pass);
		waitTime();
		page.cnfPass(pass);
		waitTime();
		//page.cellNum(phnNum);
		waitTime();
		page.cklCont();
		waitTime();
		Reporter.log("Valid Login Credentials", true);
	}
	
	@Test(priority = 2)
	@Parameters ({"name","userName", "password","invalidPass"})
	public void InvalidRegistration(String name,String newUser, String pass, String invalidPass) {
		extentTest = extent.startTest("Verify that new user is not registed because of bad credentials");
		RegistrationPage page = new RegistrationPage(driver);
		intialSteps();
		page.enterCustName(name);
		page.enterUserID(newUser);
		page.newPassword(pass);
		waitTime();
		assertEquals("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&", driver.getCurrentUrl());
		page.cnfPass(invalidPass);
		waitTime();
		//page.cellNum(phnNum);
		waitTime();
		page.cklCont();
		waitTime();
		Reporter.log("Invalid Login Credentials", true);
	}
}
