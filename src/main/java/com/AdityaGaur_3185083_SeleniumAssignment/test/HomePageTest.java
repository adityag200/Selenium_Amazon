package com.AdityaGaur_3185083_SeleniumAssignment.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AdityaGaur_3185083_SeleniumAssignment.pages.HomePage;


public class HomePageTest extends BaseTest {
	
	@Test (priority = 1)
	public void searchbox(String item) {
		extentTest = extent.startTest("Verify that required Search is performed or not");
		HomePage search = new HomePage(driver);
		search.enterItem("Sony Buds"); // Required search is Performed.
		search.ClickSubmit();
		Assert.assertEquals(driver.getTitle(),"Amazon.in : Apple iPhone13","Correct Page loaded");
		Reporter.log("Valid Search Box Entry", true);
	}
	
//	@Test (priority = 2)
//	public void findItem() {
//		extentTest = extent.startTest("Verify that search field accepts alphabets, numbers or symbols");
//		HomePage item = new HomePage(driver);
//		item.enterItem("@pple IPhone13"); // Verify that search field accepts alphabets, numbers or symbols.
//		item.ClickSubmit();
//		item.ClickItem();
//		Reporter.log("Finding The Right Page for search", true);
//	}
//	
//	@Test(priority = 3)
//	public void SortingResults() {
//		extentTest = extent.startTest("Verify that sorting on a category page is executed");
//		HomePage item = new HomePage(driver);
//		waitTime();
//		item.enterItem("iPhone 13"); 
//		item.ClickSubmit();
//		item.sortItem();// The category page is sorted form price high to low
//		waitTime();
//		Assert.assertEquals(driver.getTitle(),"Amazon.in : iPhone 13");
//		Reporter.log("Page Sorted Correctly",true);
//	}
//	
//	@Test(priority = 4)
//	public void LeftRight() {
//		extentTest = extent.startTest("Verify that Hero image is being changing or not");
//		HomePage item = new HomePage(driver);
//		waitTime();
//		item.Leftscroll(); // Verify that The Active hover scrolls left
//		waitTime();
//		item.RightScroll(); // Verify that The Active hover scrolls right
//		waitTime();
//		Reporter.log("Banner Scrolled Left & Right",true);
//	}
//	
//	@Test(priority = 5)
//	public void CategorySelect() {
//		extentTest = extent.startTest("Verify that search is done in different categories");
//		HomePage item = new HomePage(driver);
//		waitTime();
//		item.SelectCategory();// Verify that user should be perform search in different categories for example -  Movies.
//		waitTime();
//		item.enterItem("Friends");
//		item.ClickSubmit();
//		item.ClickItem2();
//		Assert.assertEquals(driver.getTitle(),"Amazon.in : Friends","Assert Successful");
//		Reporter.log("Filter Working",true);
//	}
//	
//	@Test(priority = 6)
//	public void CategoryWrong() {
//		extentTest = extent.startTest("Verify that user should be perform search in different categories for example - Movies, A completely different thing for Example - apple.");
//		HomePage item = new HomePage(driver);
//		waitTime();
//		item.SelectCategory();// Verify that user should be perform search in different categories for example - Movies, A completely different thing for Example - A Camera.
//		waitTime();
//		item.enterItem("apple");
//		item.ClickSubmit();
//		Assert.assertEquals(driver.getTitle(), "Amazon.in : apple");
//		Reporter.log("Filter Working",false);
//	}
}
