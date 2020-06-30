package com.infoglen.genericLib;

import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult name) {
			String testname = name.getName();
			EventFiringWebDriver efw= new EventFiringWebDriver(driver);
			File screenshot = efw.getScreenshotAs(OutputType.FILE);
			File srefile= new File("./screenshot/"+testname+".png");
			
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
