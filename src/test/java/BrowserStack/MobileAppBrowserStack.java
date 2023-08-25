package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppBrowserStack {
	
	public static final String UserName="soumyasantasahoo_0EBiCu";
	public static final String AcessKey="2fRdT5HFxg3SqsAtH79q";
	public static final String Url="https://"+UserName+":"+AcessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void mobileAppTest() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability("os_version", "11.0");
		dc.setCapability("Project", "API Demo Testing");
		dc.setCapability("build", "API Demo 2.2.4");
		dc.setCapability("name", "Mobile_App_BrowserStack");
		dc.setCapability("app", "bs://2b956d6d1a6351aa69de8c0effa0d92b683e2fc7");
		
		AndroidDriver driver=new AndroidDriver(new URL(Url),dc);
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.quit();
	}

}
