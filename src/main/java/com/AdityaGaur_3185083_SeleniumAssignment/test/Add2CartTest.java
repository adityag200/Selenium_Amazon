package com.AdityaGaur_3185083_SeleniumAssignment.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AdityaGaur_3185083_SeleniumAssignment.pages.AddToCart;

public class Add2CartTest extends BaseTest {
	
	@Test(priority = 1)
	@Parameters ({"userName", "password"})
	public void Add2Cart(String user, String pass) {
		extentTest = extent.startTest("Verify that the item is added to the cart");
		AddToCart buy = new AddToCart(driver);
		buy.signin(user, pass);
		waitTime();
		buy.Mat();
		waitTime();
		buy.buying();
	}
	
	@Test(priority = 2)
	@Parameters ({"userName", "password"})
	public void RemoveFromCart(String user, String pass) {
		extentTest = extent.startTest("Verify that the item is removed or not");
		AddToCart page = new AddToCart(driver);
		page.signin(user, pass);
		waitTime();
		page.RemoveFromCart();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
	}
}
