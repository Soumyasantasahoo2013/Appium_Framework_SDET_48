package com.GeneralStore.TestScripts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.GeneralStore.GenericUtility.BaseAppiumClass;
import com.GeneralStore.GenericUtility.DriverUtility;
import com.GeneralStore.GenericUtility.GestureUtility;
import com.GeneralStore.ObjectRepository.CartPage;
import com.GeneralStore.ObjectRepository.LoginPage;
import com.GeneralStore.ObjectRepository.ProductPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
@Listeners(com.GeneralStore.GenericUtility.ListenerImplementation.class)
public class AddProductToCart extends BaseAppiumClass{
	
	//@Parameters({"deviceName", "UDID", "port"})
	
	@Test
	public void addProductToCart() throws Throwable
	{	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			lp.loginSetup(gUtil,"India", "Soumya");
			pp.addProductToCart();
			Assert.assertEquals(false, true);
	        cp.getProceedBtn().click();

	        dUtil.getViews();
	        Thread.sleep(5000);
	        dUtil.switchContext("WEBVIEW_com.androidsample.generalstore");
	        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Appium");
	}
           
}
