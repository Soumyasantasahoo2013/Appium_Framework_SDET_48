package com.GeneralStore.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.ConfigurationGroupMethods;
import org.testng.internal.ITestInvoker;
import org.testng.internal.ITestResultNotifier;
import org.testng.internal.TestMethodArguments;
import org.testng.xml.XmlSuite;

import com.google.common.io.Files;

public class ListenerImplementation implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		String screenshotName = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)BaseAppiumClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+screenshotName+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	

}
