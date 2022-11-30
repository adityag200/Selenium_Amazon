package com.AdityaGaur_3185083_SeleniumAssignment.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.AdityaGaur_3185083_SeleniumAssignment.utils.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest { // includes all the base information required for initial workings of the framework
		
		static WebDriver driver;
		public static File file;
		public static FileInputStream fis;
		public static Properties prop;
		public static ExtentReports extent;
		public static ExtentTest extentTest;

		static {
			try {
				file = new File("./Resources/config.properties");
				fis = new FileInputStream(file);
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			prop = new Properties();
			try {
				prop.load(fis);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		@BeforeSuite
		public void setExtent() {
			extent = new ExtentReports("./Reports/ExtentReports.html");
		}
		
		@AfterSuite
		public void endReport() {
			extent.flush();
			extent.close();
		}
		
		
		@BeforeTest
		@Parameters({"browser"})
		public void setup(String browser) throws Exception{
			//Check if parameter passed from TestNG is 'firefox'
			if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty(prop.getProperty("foxProperty"),prop.getProperty("foxDriver"));
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty(prop.getProperty("chromeProperty"),prop.getProperty("chromeDriver"));
				//create chrome instance
				driver = new ChromeDriver();
			}
			//Check if parameter passed as 'Edge'
			else if(browser.equalsIgnoreCase("Edge")){
				//set path to Edge.exe
				System.setProperty(prop.getProperty("edgeProperty"),prop.getProperty("edgeDriver"));
				//create Edge instance
				driver = new EdgeDriver();
			}
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	@BeforeTest
	public void waitTime() {
		prop.getProperty("waitTime");
	}	
	
	@AfterMethod
	public void resultTest(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String imagePath = Screenshots.captureScreen(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			
		}
		else {
			if(result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");			
			}
		}
		extent.endTest(extentTest);
		driver.close();
	}	
}
