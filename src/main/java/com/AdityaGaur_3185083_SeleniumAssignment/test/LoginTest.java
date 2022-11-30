package com.AdityaGaur_3185083_SeleniumAssignment.test;

import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.AdityaGaur_3185083_SeleniumAssignment.pages.LoginPage;

import org.testng.asserts.SoftAssert; 

public class LoginTest extends BaseTest {
	
	public void intialSteps() {
		LoginPage page = new LoginPage(driver);
		page.gotoSignin();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	@Parameters ({"userName", "password"})
	public void validLogin(String user, String pass) {
		extentTest = extent.startTest("Verify that valid login credentials are used");
		LoginPage page = new LoginPage(driver);
		SoftAssert softassert = new SoftAssert();
		intialSteps();
		page.username(user);
		page.ClickCont();
		page.Enterpass(pass);
		page.ClickSignin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		softassert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Reporter.log("Valid Login Credentials", true);
	}
	
	@Test(priority = 2)
	@Parameters ({"invaliduserName", "password"})
	public void InvalidEmail(String invaliduser, String pass) {
		extentTest = extent.startTest("Verify that Invalid Email is used");
		LoginPage page = new LoginPage(driver);
		SoftAssert softassert = new SoftAssert();
		intialSteps();
		page.username(invaliduser);
		page.ClickCont();
		page.Enterpass(pass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		softassert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Reporter.log("Invalid Login Credentials", true);
	}
	
	@Test(priority = 3)
	@Parameters ({"userName", "invalidpassword"})
	public void Invalidpass(String user, String invalidPass) {
		extentTest = extent.startTest("Verify that Invalid Password is used");
		LoginPage page = new LoginPage(driver);
		SoftAssert softassert = new SoftAssert();
		intialSteps();
		page.username(user);
		page.ClickCont();
		page.Enterpass(invalidPass);
		page.ClickSignin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		softassert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Reporter.log("Invalid Email Login Credentials", true);
	}
	
	@Test(priority = 4)
	@Parameters ({"blank"})
	public void blankLogin(String blank) {
		extentTest = extent.startTest("Verify that blank credentials are passed");
		LoginPage page = new LoginPage(driver);
		SoftAssert softassert = new SoftAssert();
		intialSteps();
		page.username(blank);
		page.ClickCont();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		softassert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Reporter.log("Blank Login Credentials", true);
	}

}
