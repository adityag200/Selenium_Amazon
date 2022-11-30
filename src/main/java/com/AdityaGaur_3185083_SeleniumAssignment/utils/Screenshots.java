package com.AdityaGaur_3185083_SeleniumAssignment.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public static String captureScreen(WebDriver driver, String testname) {
		String  screenshotPath = System.getProperty("user.dir")+"\\TestFailed.jpg";

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File(screenshotPath));
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return screenshotPath;
	}
}
