package Gestures;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ScrollTest {
	
	@Test
	public void scrollTest() throws Throwable
	{
        File f=new File("C:\\Users\\Soumya Santa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M30s");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8M83ZJH2W");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL u=new URL("http://localhost:4723");
		
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
//		boolean canScrollMore;
//		
//		do {
//		canScrollMore = (Boolean)((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 100, "height", 500,
//			    "direction", "down",
//			    "percent", 1.0
//			));}
//		while(canScrollMore);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}

}
