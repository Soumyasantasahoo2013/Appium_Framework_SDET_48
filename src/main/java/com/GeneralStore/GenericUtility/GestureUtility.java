package com.GeneralStore.GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	
	AndroidDriver driver;
	public GestureUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void scrollingGesture(String value)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"))"));
	}
	
	public void longPressGesture(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	
	public void dragAndDropGesture(WebElement element, int x, int y)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", x,
			    "endY", y
			));
	}
	
	public void pinchOpenGesture(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
	}
	
	public void pinchCloseGesture(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
	}
	
	public void swipingGesture()
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "left",
			    "percent", 0.75
			));
	}

}
