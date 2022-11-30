package com.AdityaGaur_3185083_SeleniumAssignment.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public WebElement SearchBox;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	public WebElement submit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='_1YokD2 _3Mn1Gg']//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//img[1]")
	public WebElement Item1;
	
//	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Friends: The Complete Season 5']")
//	public WebElement Item2;
//	
//	@FindBy(how = How.ID, using = "searchDropdownBox")
//	public WebElement ChangeItem;
//	
//	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option[29]")
//	public WebElement SelectCat;
//	
//	@FindBy(how = How.XPATH, using = "//span[@id='a-autoid-0-announce']")
//	public WebElement Sort;
//	
//	@FindBy(how = How.XPATH, using = "//a[@id='s-result-sort-select_1']")
//	public WebElement ClickSort;
//	
//	@FindBy(how = How.CLASS_NAME, using = "a-carousel-goto-nextpage")
//	public WebElement ScrollLeft;
//	
//	@FindBy(how = How.CLASS_NAME, using = "a-carousel-goto-nextpage")
//	public WebElement ScrollRight;
//	
//	public void sortItem() {
//		Sort.click();
//		ClickSort.click();
//	}
	
	public void enterItem(String item) {
		SearchBox.sendKeys(item);
	}
	
	public void ClickSubmit() {
		submit.click();
	}
	
	public void ClickItem() {
		Item1.click();
	}
	
//	public void ClickItem2() {
//		Item2.click();
//	}
//	
//	public void SelectCategory() {
//		ChangeItem.click();
//		SelectCat.click();
//	}
//	
//	public void Leftscroll() {
//		ScrollLeft.click();
//	}
//	
//	public void RightScroll() {
//		ScrollRight.click();
//	}
}
